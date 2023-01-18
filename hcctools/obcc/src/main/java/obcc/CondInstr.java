package obcc;

import java.util.ArrayList;

public class CondInstr {
    public static final ArrayList<String> c_instr = new ArrayList<String>() {{
        add("IF_ACMPEQ");
        add("IF_ACMPNE");
        add("IF_ICMPEQ");
        add("IF_ICMPGE");
        add("IF_ICMPGT");
        add("IF_ICMPLE");
        add("IF_ICMPLT");
        add("IF_ICMPNE");
        add("IFEQ");
        add("IFGE");
        add("IFGT");
        add("IFLE");
        add("IFLT");
        add("IFNE");
        add("IFNONNULL");
        add("IFNULL");
    }};
}
