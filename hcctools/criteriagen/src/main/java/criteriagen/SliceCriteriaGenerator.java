package criteriagen;

import com.github.javaparser.*;
import com.github.javaparser.ast.*;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import util.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

public class SliceCriteriaGenerator {


    static int assert_in_class = 0;
    static int test_in_class = 0;
    static int test_in_project = 0;
    static int assert_in_project = 0;
    static boolean addComma = false;

    public static void main(String args[]) {


        //--------------input process--------------------
        if (args.length == 0)
            throw new IllegalArgumentException("insufficient parameters! param 1: test_file_dir, param2: trace_dir, param3: slice_dir (slice be stored when running the scripts), param4: slicer.jar param5: outdir (generated scripts will be stored)");

        String test_file_dir = args[0];
        if (test_file_dir.endsWith("/"))
            test_file_dir = test_file_dir.substring(0, test_file_dir.length() - 1);
        String trace_dir = args[1];
        if (trace_dir.endsWith("/"))
            trace_dir = trace_dir.substring(0, trace_dir.length() - 1);
        String slice_dir = args[2];
        if (slice_dir.endsWith("/"))
            slice_dir = slice_dir.substring(0, slice_dir.length() - 1);

        String slicer = args[3];
        String outDir = args[4];
        if (outDir.endsWith("/"))
            outDir = outDir.substring(0, outDir.length() - 1);

        final File project_test_dir = new File(test_file_dir);
        List<String> result = new ArrayList<>();

        if (project_test_dir.isFile()) {
            result.add(project_test_dir.getAbsolutePath());
        } else Util.search(".*\\.java", project_test_dir, result);

        generateScripts(result, outDir, trace_dir, slice_dir, slicer);
    }


    private static void generateScripts(List<String> result, String outdir, final String trace_dir, final String slice_dir, final String slicer) {
        try {
            for (String s : result) {

                assert_in_class = 0; //reset after each class
                File script_file = null;
                test_in_class = 0;
                File f = new File(s);

                addComma = false;


                String test_class = f.getName().substring(0, f.getName().length() - ".java".length()); //removing .java extension
                System.out.println("test_class: " + test_class);

                ParseResult<CompilationUnit> agendaCu = new JavaParser().parse(new FileInputStream(f));
                CompilationUnit cu = agendaCu.getResult().get();
                Optional<PackageDeclaration> pcd = cu.getPackageDeclaration();
                String pkg_main = pcd.get().getName().toString();
                String pkg = pkg_main.substring(pkg_main.lastIndexOf(".") + 1);
                //System.out.println("pkg=============" + pkg);

                try {
                    Path path = Paths.get(outdir);
                    if (!Files.exists(path)) {
                        Files.createDirectory(path);
                        //System.out.println("Directory created");
                    } else {
                        //System.out.println("Directory already exists");
                    }

                    path = Paths.get(outdir + "/" + pkg);
                    if (!Files.exists(path)) {
                        Files.createDirectory(path);
                        //System.out.println("package dir created");
                    } else {
                        //System.out.println("package dir already exists");
                    }

                    script_file = new File(outdir + "/" + pkg + "/" + pkg_main + "." + test_class + ".sh");

                    if (script_file.createNewFile()) {
                        //System.out.println("File created: " + script_file.getName());
                    } else {
                        //System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                final FileWriter outFileWriter = new FileWriter(script_file);

                outFileWriter.write("#!/bin/bash\n\n");
                outFileWriter.write("echo \"computing slice for " + test_class + "\"\n\n");
                outFileWriter.write("mkdir -p " + slice_dir + "/" + pkg + "_slices/" + test_class + "\n\n");


                try {
                    String finalPkg = pkg;

                    new VoidVisitorAdapter<Object>() {
                        public String method_name;
                        @Override
                        public void visit(final MethodDeclaration n, Object arg) {

                            AtomicBoolean hasAssertion = new AtomicBoolean(false);
                            method_name = n.getName().toString();
                            //System.out.println(method_name);

                            hasAssertion.set(true);

                            if (hasAssertion.get()) {
                                n.getBody().get().getStatements().forEach((p) -> {
                                    p.accept(this, arg);
                                });
                                n.getName().accept(this, arg);
                                n.getComment().ifPresent((l) -> {
                                    l.accept(this, arg);
                                });
                            }
                        }

                        @Override
                        public void visit(final MethodCallExpr n, Object arg) {
                            //System.out.println(n.toString());
                            String MethodCallExpr = n.getName().toString();
                            //System.out.println(MethodCallExpr);
                            if (MethodCallExpr.startsWith("assertEquals") || MethodCallExpr.startsWith("assertTrue") || MethodCallExpr.startsWith("assertFalse") || MethodCallExpr.startsWith("assertNotNull") || MethodCallExpr.startsWith("assertNull")
                                    || MethodCallExpr.startsWith("assertThat") || MethodCallExpr.startsWith("assertSame") || MethodCallExpr.startsWith("assertArrayEquals") || MethodCallExpr.startsWith("assertNotSame")) {
                                assert_in_class++;
                                assert_in_project++;
                                try {
                                    outFileWriter.write("java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar " + slicer + " -m=1 -p ");
                                    outFileWriter.write(trace_dir + "/" + pkg + "_traces/");
                                    outFileWriter.write(test_class + ".trace ");
                                    outFileWriter.write(pkg_main + "." + test_class + "." + method_name + ":" + n.getBegin().get().line + ":*");
                                    outFileWriter.write(">" + slice_dir + "/" + pkg + "_slices/" + test_class + "/" + test_class + assert_in_class + ".txt\n");

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } else {
                                if (n.toString().startsWith("assertThat")) {
                                    assert_in_class++;
                                    assert_in_project++;
                                    try {
                                        outFileWriter.write("java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar " + slicer + " -m=1 -p ");
                                        outFileWriter.write(trace_dir + "/" + pkg + "_traces/");
                                        outFileWriter.write(test_class + ".trace ");
                                        outFileWriter.write(pkg_main + "." + test_class + "." + method_name + ":" + n.getBegin().get().line + ":*");
                                        outFileWriter.write(">" + slice_dir + "/" + pkg + "_slices/" + test_class + "/" + test_class + test_class + assert_in_class + ".txt\n");

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }.visit(cu, null);
                } catch (Exception e) {

                    new RuntimeException(e);
                }

                outFileWriter.write("\n#Total Asserts in " + pkg_main + "/" + test_class + "=============" + assert_in_class + "\n");
                outFileWriter.write("#Total Tests in " + pkg_main + "/" + test_class + "=============" + test_in_class + "\n");
                outFileWriter.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Total Asserts=============" + assert_in_project + "\n");
        //System.out.println("Total Tests=============" + test_in_project + "\n");
    }
}

