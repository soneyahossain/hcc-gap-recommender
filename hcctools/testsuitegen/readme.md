This tool manipulates a test suite to generate different versions with varying statement checked coverage. This is a supporting tool 
for RQ2, where we showed the correlation between gap vs fault-detection effectiveness.

Requirements:

    JDK 1.8 
    Maven 3.6.3

To build the tool, run:

    mvn package 

this will generate a .jar file inside assembly directory.

To generate different test suites from a main test suite, run:

    sh run.sh

run.sh requires following inputs:

1. path of testsuite-gen.jar
2. path of slice files
3. path of clover.xml
4. path of main test suite
5. output path
6. package of test package, e.g., org.joda.time


Upon successful completion, several new test suites will be generated in the output directory.

