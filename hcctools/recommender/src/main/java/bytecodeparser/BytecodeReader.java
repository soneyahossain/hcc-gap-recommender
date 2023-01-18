package bytecodeparser;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.util.Printer;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceMethodVisitor;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import util.Util;
import static org.objectweb.asm.Opcodes.ACC_PRIVATE;

public class BytecodeReader {
    public HashMap<String, HashMap<String, bytecodeparser.MethodInfo>> fromMethodToLineRecords; //pkg.class.method --> line number--> reads, writes, method calls
    public HashMap<String, List<String>> fromFieldToMethodsThatRead;
    public HashMap<String, List<String>> fromFieldToMethodsWrittenBy;
    public Queue<String> superclasses;
    public Queue<String> innerlasses;
    public HashMap<String, ArrayList<String>> fromClassToMethod;
    public HashMap<String, String> fromClassToSuper;
    public HashMap<String, String> fromClassToInterface;
    public HashMap<String, ArrayList<String>> fromMethodToWriteFields;
    public HashMap<String, Boolean> fromMethodToReturn;

    public BytecodeReader(HashMap<String, HashMap<String, bytecodeparser.MethodInfo>> fromMethodToLineRecords, HashMap<String,
            List<String>> fromFieldToMethodsThatRead, HashMap<String, List<String>> fromFieldToMethodsWrittenBy,
                          Queue<String> superclasses, Queue<String> innerlasses, HashMap<String, ArrayList<String>> fromClassToMethod,
                          HashMap<String, String> fromClassToSuper, HashMap<String, ArrayList<String>> fromMethodToWriteFields,
                          HashMap<String, Boolean> fromMethodToReturn) {

        this.fromMethodToLineRecords = fromMethodToLineRecords;  //pkg/class/method (e.g java/util/Vector.containsAll) --> line number--> reads, writes, method calls
        this.fromFieldToMethodsThatRead = fromFieldToMethodsThatRead;  //pkg/class/method:field --> methods that read the field
        this.fromFieldToMethodsWrittenBy = fromFieldToMethodsWrittenBy; //pkg/class/method:field --> methods that write the field
        this.superclasses = superclasses;  //for second level iteration
        this.innerlasses = innerlasses; //for iterating inner classes
        this.fromClassToMethod = fromClassToMethod;  //test_cov/Stack-----> [<init>, push, pop, peek, empty, search]
        this.fromClassToSuper = fromClassToSuper;   //test_cov/Stack ---> java/util/Vector
        this.fromMethodToWriteFields = fromMethodToWriteFields; //java/util/Vector.remove ---> java/util/Vector.modCount, java/util/Vector.elementCount
        this.fromMethodToReturn = fromMethodToReturn;
    }
    public BytecodeReader()
    {
        this.fromMethodToLineRecords = new HashMap<>();  //pkg/class/method (e.g java/util/Vector.containsAll) --> line number--> reads, writes, method calls
        this.fromFieldToMethodsThatRead = new HashMap<>();//fromFieldToMethodsThatRead;  //pkg/class/method:field --> methods that read the field
        this.fromFieldToMethodsWrittenBy = new HashMap<>(); //fromFieldToMethodsWrittenBy; //pkg/class/method:field --> methods that write the field
        this.superclasses = new LinkedList<>();  //for second level iteration
        this.innerlasses = new LinkedList<>(); //for iterating inner classes
        this.fromClassToMethod = new HashMap<>();  //test_cov/Stack-----> [<init>, push, pop, peek, empty, search]
        this.fromClassToSuper = new HashMap<>();   //test_cov/Stack ---> java/util/Vector
        this.fromClassToInterface = new HashMap<>();
        this.fromMethodToWriteFields = new HashMap<>(); //java/util/Vector.remove ---> java/util/Vector.modCount, java/util/Vector.elementCount
        this.fromMethodToReturn = new HashMap<>();

    }

    public void read(ClassReader cr) throws Exception {

        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String class_name = cn.name;  //do not use cn.name anywhere as this is modified
        //System.out.println(class_name);
        if (class_name.indexOf("$") != -1) {  //if the class name contains $ which means that it is an inner class within a class
            // e.g., org/joda/time/Partial$Property, extract the host class org/joda/time/Partial and collect all methods and their
            //put and write fields as usual
            class_name = class_name.substring(0, class_name.indexOf("$"));
        } else { //if here this is not an inner class, so collect the inner class for later visit
            if (cn.innerClasses != null) {
                List<InnerClassNode> classes = cn.innerClasses;

                for (InnerClassNode cls : classes) {
                    if (!innerlasses.contains(cls.name) && !class_name.equals(cls.name)) {
                        innerlasses.add(cls.name);
                        //System.out.println("inner class: " + cls.name);
                    }
                }
            }
        }

        if (cr.getSuperName() != null && cr.getSuperName().startsWith("org/")) {
            if (!superclasses.contains(cr.getSuperName())) {
                superclasses.add(cr.getSuperName());
            }
            //storing in the list for parsing these
            fromClassToSuper.put(class_name, cr.getSuperName()); //map from class to super
           // System.out.println(class_name+","+cr.getSuperName());

        }

        for ( int i =0; i< cr.getInterfaces().length;i++)
        {
            if(cr.getInterfaces()[i].startsWith("org/")) fromClassToInterface.put(class_name, cr.getInterfaces()[i]);

           // System.out.println("Interface: "+cr.getInterfaces()[i]);
        }


        ArrayList<String> methodsInClass = fromClassToMethod.get(class_name);
        if (methodsInClass == null) {
            methodsInClass = new ArrayList<>();
            fromClassToMethod.put(class_name, methodsInClass);
        }


        final List<MethodNode> mns = cn.methods;
        Printer printer = new Textifier();
        TraceMethodVisitor mp = new TraceMethodVisitor(printer);
        String line_number = null;

        for (MethodNode mn : mns) {  // loop all methods
            InsnList inList = mn.instructions;
            //mn.name=mn.name+mn.desc;
            methodsInClass.add(mn.name);

            // if method is protected or private it's better to avoid

            //System.out.println(mn.name+"- "+mn.desc);
            //private, protected, private static
            if (mn.access == ACC_PRIVATE || mn.access == 10) {
                //System.out.println(mn.name+" is not public, continuing");
                continue;
            }


            //recording all lines that contain read and write instructions
            HashMap<String, bytecodeparser.MethodInfo> recordOfMethodLines = fromMethodToLineRecords.get(class_name + "." + mn.name);

            if (recordOfMethodLines == null) {
                recordOfMethodLines = new HashMap<>();
                fromMethodToLineRecords.put(class_name + "." + mn.name, recordOfMethodLines);
            }

            ArrayList<String> fieldsWrittenByMethod = fromMethodToWriteFields.get(class_name + "." + mn.name);
            if (fieldsWrittenByMethod == null) {
                fieldsWrittenByMethod = new ArrayList<>();
                fromMethodToWriteFields.put(class_name + "." + mn.name, fieldsWrittenByMethod);
            }

            Type returnType = Type.getReturnType(mn.desc);
            if (returnType != Type.VOID_TYPE) {

                //System.out.println("return in "+class_name + "." + mn.name+" , desc:"+mn.desc);
                //means this method has a return type
                //if the line number of this method doesnt contain anything, then if it's non void recommend this method
                fromMethodToReturn.put(class_name + "." + mn.name, true);
            } else if (!mn.desc.contains("()")) //parameter in not empty
            {
                // System.out.println("param in "+class_name + "." + mn.name+" , desc:"+mn.desc);
                fromMethodToReturn.put(class_name + "." + mn.name, true);
            }
//where is the read record????

            for (int i = 0; i < inList.size(); i++) {  //loop all instructions in a method
                AbstractInsnNode inode = inList.get(i);
                int opcode = inode.getOpcode();

                inode.accept(mp);
                StringWriter sw = new StringWriter();
                printer.print(new PrintWriter(sw));
                printer.getText().clear();
                String inst = sw.toString().trim();

                if (inode instanceof LineNumberNode) {
                    if (inst.contains("LINENUMBER")) {
                        line_number = inst.split("\\s+")[1];  //get the current line number
                        //System.out.println("Method name:"+class_name + "." + mn.name);
                        //System.out.println("Line No.:"+line_number);

                        //fetching record for this line for the current method
                        bytecodeparser.MethodInfo lineRecords = recordOfMethodLines.get(line_number);
                        if (lineRecords == null) {
                            lineRecords = new bytecodeparser.MethodInfo();
                            recordOfMethodLines.put(line_number, lineRecords);
                        }
                    }
                    continue; //no need to check further as we found a line number instr
                }


                if (opcode == Opcodes.PUTFIELD || opcode == Opcodes.PUTSTATIC) { //fields are written

                    String field_name = inst.split("\\s+")[1];
                    //System.out.println("here.............."+field_name);

                    fieldsWrittenByMethod.add(field_name);

                    bytecodeparser.MethodInfo line = recordOfMethodLines.get(line_number);
                    if (line == null) {
                        throw new Exception();
                    } else {
                        line.writeFields.add(field_name);
                    }

                    List<String> writtenBY = fromFieldToMethodsWrittenBy.get(field_name);
                    if (writtenBY == null) {
                        writtenBY = new ArrayList<>();
                        fromFieldToMethodsWrittenBy.put(field_name, writtenBY);
                    }
                    if (!writtenBY.contains(class_name + "." + mn.name)) writtenBY.add(class_name + "." + mn.name);

                } else if (opcode == Opcodes.GETFIELD || opcode == Opcodes.GETSTATIC) {  //read fields

                    String field_name = inst.split("\\s+")[1];

                    bytecodeparser.MethodInfo line = recordOfMethodLines.get(line_number);
                    if (line == null) {
                        throw new Exception();
                    } else {
                        line.readFields.add(field_name);
                    }

                    if (!mn.desc.contains(")V")) { //to exclude method with void return type
                        List<String> readBY = fromFieldToMethodsThatRead.get(field_name);
                        if (readBY == null) {
                            readBY = new ArrayList<>();
                            fromFieldToMethodsThatRead.put(field_name, readBY);
                        }
                        if (!readBY.contains(class_name + "." + mn.name)) readBY.add(class_name + "." + mn.name);
                    }
                } else if (opcode == Opcodes.INVOKEVIRTUAL   //consider all methods call
                        || opcode == Opcodes.INVOKESTATIC || opcode == Opcodes.INVOKESPECIAL ||
                        opcode == Opcodes.INVOKEINTERFACE || opcode == Opcodes.INVOKEDYNAMIC) {

                    String methodCalled = inst.split("\\s+")[1];
                    bytecodeparser.MethodInfo line = recordOfMethodLines.get(line_number);
                    if (line == null) {
                        throw new Exception();
                    } else {
                        if (!line.methodCalls.contains(methodCalled)) line.methodCalls.add(methodCalled);
                        if(opcode == Opcodes.INVOKESPECIAL) line.invokeSpecial.add(methodCalled);
                    }
                }
            }
        }
    }

    public void print() {

        for (String methodName : fromMethodToLineRecords.keySet()) {
            System.out.println("method Name:" + methodName);
            HashMap<String, bytecodeparser.MethodInfo> methodMap = fromMethodToLineRecords.get(methodName);

            for (String lineNum : methodMap.keySet()) {
                System.out.println("line no:" + lineNum);
                bytecodeparser.MethodInfo fieldRec = methodMap.get(lineNum);
                System.out.println("Writes Field" + fieldRec.writeFields.toString());
                System.out.println("Reads Field" + fieldRec.readFields.toString());
                System.out.println("Method Calls" + fieldRec.methodCalls.toString());
            }
        }
        //print read by method map
        for (String field_name : fromFieldToMethodsThatRead.keySet()) {
            System.out.println("field_name:" + field_name);
            System.out.println("Methods that read the field" + fromFieldToMethodsThatRead.get(field_name).toString());
        }

        //print written by method map
        for (String field_name : fromFieldToMethodsWrittenBy.keySet()) {
            System.out.println("field_name:" + field_name);
            System.out.println("Methods that write the field" + fromFieldToMethodsWrittenBy.get(field_name).toString());
        }
        //print written by method map
        for (String m_name : fromMethodToWriteFields.keySet()) {
            ArrayList<String> fields_written = fromMethodToWriteFields.get(m_name);
            System.out.println("method Name:" + m_name);
            System.out.println("Fields written:  " + fields_written.toString());
        }

        //print written by method map
        for (String m_name : fromClassToSuper.keySet()) {
            String class_name = m_name;
            System.out.println("class name:" + class_name);
            System.out.println("super class: " + fromClassToSuper.get(class_name));
        }

        //print written by method map
        for (String class_name : fromClassToMethod.keySet()) {
            System.out.println("class name:" + class_name);
            System.out.println("Methods in class: " + fromClassToMethod.get(class_name));
        }
    }

    public void readClass(String filePath) throws Exception {
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
        //Iterator<String> iter = superclasses.iterator();
        while (!superclasses.isEmpty()) {
            String path = superclasses.remove();
            String absolutePath = basePath + path + ".class";
            //System.out.println(absolutePath);
            File dir = new File(absolutePath);
            if (dir.isFile()) {
                FileInputStream fis = new FileInputStream(absolutePath);
                ClassReader cr = new ClassReader(fis);
                read(cr);
            } else {
                ClassReader cr = new ClassReader(path);
                read(cr);
            }
        }
    }
}