package org.util;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class TestSetGenerator {


    static void modify_file(String test_file_path, int line, String test_dir_package) throws IOException {

        //now open the file and comment that specific line,
        File test_file = new File(test_file_path);
        Scanner sc_test_file = new Scanner(test_file);
        //System.out.println(test_file_path);

        //Open a temporary file to write to.
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(test_file_path + "_temp")));

        // ... then inside your loop ...
        int line_no = 1;
        while (sc_test_file.hasNextLine()) {

            String line_from_test_file = sc_test_file.nextLine();

            if (line_from_test_file.trim().startsWith("package ") && !line_from_test_file.contains("NoAssert")) {
                if (line_from_test_file.contains(test_dir_package)) {
                    line_from_test_file = line_from_test_file + "import " + test_dir_package + ".NoAssert;";
                }
            }

            if (line_no == line) {
                if (line_from_test_file.contains("assertFalse") || line_from_test_file.contains("assertTrue") || line_from_test_file.contains("assertEquals")
                        || line_from_test_file.contains("assertThat") || line_from_test_file.contains("assertNotNull") || line_from_test_file.contains("assertNull") || line_from_test_file.contains("assertSame")
                        || line_from_test_file.contains("assertNotSame") || line_from_test_file.contains("assertArrayEquals")) {

                    String function_name = line_from_test_file.substring(0, line_from_test_file.indexOf("("));
                    line_from_test_file = line_from_test_file.replace(function_name, "NoAssert.donothing");
                }
            }
            // Always write the line, whether you changed it or not.
            writer.println(line_from_test_file);
            line_no++;
        }

        // ... and finally ...

        test_file.delete(); // remove the old file
        new File(test_file_path + "_temp").renameTo(test_file); // Rename temp file

        sc_test_file.close();
        writer.close();

    }

    public void generateTestSets(List<String> disabled_assertions, String newTestSuiteDir, int per_of_assertion_enabled, String testDir, String test_dir_package) throws IOException {
        //create a new copy of the test folder
        File sourceDirectory = new File(testDir + "/");
        File targetDirectory = new File(newTestSuiteDir + "/rq2_test_suites/" + "test_suite_" + per_of_assertion_enabled + "/test");

        //copy source to target using Files Class
        DirectoryCopy.copyDirectoryCompatibityMode(sourceDirectory, targetDirectory);

        //now read each assertion file and read the file name and line number
        for (String slice_file : disabled_assertions) {
            File slice = new File(slice_file);
            Scanner sc = new Scanner(slice);

            String test_file_path = newTestSuiteDir + "/rq2_test_suites/" + "test_suite_" + per_of_assertion_enabled + "/test/";

            if (!testDir.contains("jaxen")) test_file_path += "java"; //it has different structure

            int line = -1;
            while (sc.hasNextLine()) {

                String line_from_slice = sc.nextLine();

                if (line_from_slice.startsWith("The dynamic slice for criterion")) {
                    String criterion = line_from_slice.substring("The dynamic slice for criterion [".length());

                    //criterion=criterion.replace("org.jaxen.test.","org.jaxen.test.basetest."); //temporary change for experiment purpose
                    criterion = criterion.replaceAll("\\.", "/");

                    String tokens[] = criterion.split(":");// tokenizing using space

                    assert (tokens.length >= 3);

                    line = Integer.parseInt(tokens[1]);
                    criterion = criterion.substring(0, criterion.lastIndexOf("/")) + ".java";
                    test_file_path = test_file_path + "/" + criterion;
                    break;
                }
            }
            if (line != -1) {
                modify_file(test_file_path, line, test_dir_package);
            }
            sc.close();
        }
    }
}
