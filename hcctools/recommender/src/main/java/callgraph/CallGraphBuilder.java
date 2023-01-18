package callgraph;

import util.Util;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.util.Printer;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceMethodVisitor;
import java.io.*;
import java.util.*;

public class CallGraphBuilder {

    public Queue<String> superclasses = new LinkedList<>();
    public Queue<String> interfaces = new LinkedList<>();
    HashMap<String, Set<String>> CallGraph = new HashMap<>();

    public HashMap<String, Set<String>> buildCallGraph(String sourcePath, String out_dir) throws Exception {
        readClass(sourcePath);
        readClass(superclasses, sourcePath);
        readClass(interfaces, sourcePath);
        printCallGraph(out_dir);
        return CallGraph;
    }

    public HashMap<String, Set<String>> getCallGraph() {
        return CallGraph;
    }

    private void printCallGraph(String out_dir) throws FileNotFoundException {

        PrintWriter out = new PrintWriter(out_dir+"/"+"callgraph.txt");

        for (String caller : CallGraph.keySet()) {
            out.append(caller + " may call:\n");
            Set<String> calle = CallGraph.get(caller);

            for (String calle_ : calle) {
                out.append("\t" + calle_ + "\n");
            }
        }
        out.close();

    }

    private void readClass(String filePath) throws Exception {
        List<String> all_classes = new ArrayList<>(); //all_classes contains all slice file paths
        File dir = new File(filePath);
        if (dir.isFile()) {
            all_classes.add(dir.getAbsolutePath());
        } else Util.search(".*\\.class", dir, all_classes);

        for (String path : all_classes) {
            FileInputStream fis = new FileInputStream(path);
            ClassReader cr = new ClassReader(fis);
            read(cr);
        }
    }

    public void readClass(Queue<String> superclasses, String basePath) throws Exception {

        while (!superclasses.isEmpty()) {
            String path = superclasses.remove();
            System.out.println(path);
            String absolutePath = basePath + path + ".class";
            System.out.println(absolutePath);
            File dir = new File(absolutePath);
            if (dir.isFile()) {
                FileInputStream fis = new FileInputStream(absolutePath);
                ClassReader cr = new ClassReader(fis);
                read(cr);
            } else {
                try {
                    ClassReader cr = new ClassReader(path);
                    read(cr);
                }catch (Exception e) {

                }
            }
        }
    }

    private void read(ClassReader cr) {

        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String class_name = cn.name;

        //store the super class and interfaces
        if (cr.getSuperName() != null && cr.getSuperName().startsWith("org/")) {
            if (!superclasses.contains(cr.getSuperName())) {
                superclasses.add(cr.getSuperName());
            }
        }

        for (int i = 0; i < cr.getInterfaces().length; i++) {
            if (cr.getInterfaces()[i].startsWith("org/")) {
                if (!interfaces.contains(cr.getSuperName())) {
                    interfaces.add(cr.getSuperName());
                }
            }
        }

        final List<MethodNode> mns = cn.methods;
        Printer printer = new Textifier();
        TraceMethodVisitor mp = new TraceMethodVisitor(printer);


        for (MethodNode mn : mns) {  // loop all methods

            InsnList inList = mn.instructions;

            for (int i = 0; i < inList.size(); i++) {  //loop all instructions in a method
                AbstractInsnNode inode = inList.get(i);
                int opcode = inode.getOpcode();

                inode.accept(mp);
                StringWriter sw = new StringWriter();
                printer.print(new PrintWriter(sw));
                printer.getText().clear();
                String inst = sw.toString().trim();

                if (opcode == Opcodes.INVOKEVIRTUAL   //consider all methods call
                        || opcode == Opcodes.INVOKESTATIC || opcode == Opcodes.INVOKESPECIAL ||
                        opcode == Opcodes.INVOKEINTERFACE || opcode == Opcodes.INVOKEDYNAMIC) {

                    String methodCalled = inst.split("\\s+")[1];

                    Set<String> called_method = CallGraph.get(class_name + "." + mn.name);
                    if (called_method == null) {
                        called_method = new HashSet<>();
                        CallGraph.put(class_name + "." + mn.name, called_method);
                    }
                    if (!methodCalled.startsWith("java/"))
                        called_method.add(methodCalled); //only storing the methods from joda time application
                }
            }
        }
    }
}
