package evaluation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HCC {

    public String file_path;
    public HashMap<String, Set<String>> per_assertion_cov= new HashMap<>();
    public HashMap<String, Set<String>> per_pkg_criteria= new HashMap<>();


    public HCC(String per_assert_cov) throws FileNotFoundException {
        this.file_path=per_assert_cov;
        parsePerAssertionCov();
    }

    public Set<String> getAssertionCov(String scriterion){
        return per_assertion_cov.get(scriterion);
    }

    public void parsePerAssertionCov() throws FileNotFoundException {
        //read the text file and add checked cov in the hash map

        File slice = new File(file_path);
        Scanner sc = new Scanner(slice);

        String criterion;
        Set<String> checked_stmt_for_assertion=null;
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if(line.startsWith("criterion:"))
            {
                criterion = line.substring("criterion:".length()).trim();
                checked_stmt_for_assertion = per_assertion_cov.get(criterion);
                if(checked_stmt_for_assertion==null)
                {
                    checked_stmt_for_assertion= new HashSet<>();
                    per_assertion_cov.put(criterion, checked_stmt_for_assertion);
                }

                //get the pkg from criterion
                String pkg = getPackageFromCriterion(criterion);
                Set<String> criteria_in_package = per_pkg_criteria.get(pkg);

                if(criteria_in_package==null){
                    criteria_in_package= new HashSet<>();
                    per_pkg_criteria.put(pkg, criteria_in_package);
                }
                criteria_in_package.add(criterion);

            }else
            {
                checked_stmt_for_assertion.add(line);
            }
        }
    }

    private String getPackageFromCriterion(String criterion) {
        String[] pkg_class_method_tokens = criterion.split("\\.");

        String pkg="";
        String method_name ="";
        String className="";
        for(int i=0; i<pkg_class_method_tokens.length;i++)
        {

            if(i==pkg_class_method_tokens.length - 1)
            {
                method_name=pkg_class_method_tokens[i];
            }else if(i==pkg_class_method_tokens.length - 2)
            {
                className =pkg_class_method_tokens[i];
            }else if(i==pkg_class_method_tokens.length - 3)
            {
                pkg+=pkg_class_method_tokens[i];
            }else pkg+=pkg_class_method_tokens[i]+".";

        }
        return pkg;
    }

    public void print() {}

    public String getMethodFromCriteria(String criterion) {
        String[] pkg_class_method_tokens = criterion.split("\\.");

        String pkg="";
        String method_name ="";
        String className="";
        for(int i=0; i<pkg_class_method_tokens.length;i++)
        {

            if(i==pkg_class_method_tokens.length - 2)
            {
                className =pkg_class_method_tokens[i];
            }

        }
        return className;
    }
}
