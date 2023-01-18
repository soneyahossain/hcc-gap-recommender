Requirements:

    JDK 1.8 
    Maven 3.6.3


Computes object branch checked coverage (OBCC)

To generate the jar file, run:

    mvn package

To compute SCC, run:

    sh run.sh

run.sh requires following inputs:

1. path to slice directory
2. path to jacoco.xml
3. path to output directory 
4. path to prefix.txt

output directory contains several .csv files that store the coverage information.

