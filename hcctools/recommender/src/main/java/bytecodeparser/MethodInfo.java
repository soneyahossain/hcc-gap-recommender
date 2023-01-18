package bytecodeparser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MethodInfo {
    public ArrayList<String> readFields = new ArrayList<>();
    public ArrayList<String> writeFields = new ArrayList<>();
    public ArrayList<String> methodCalls = new ArrayList<>();
    public Set<String> invokeSpecial = new HashSet<>();
}