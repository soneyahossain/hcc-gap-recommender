Requirements:

    JDK 1.8 
    Maven 3.6.3


Criteria generator jar automatically generates script files for program slicing.

To generate the jar file, run:

    mvn package

To generate scripts for a given test directory, run:

    sh run.sh

run.sh requires following inputs:

1. location of the jar file
2. test directory
3. trace files directory
4. location where generated slices will be stored
5. slicer jar file location
6. output directory where generated scripts will be stored

the output scripts can be run to generate program slices for hcc computation