# Artifact: Measuring and Mitigating Gaps in Structural Testing

This repository contains the artifact for testing the host checked coverage (hcc), coverage gap, and the recommender for closing that gap. It is implemented primarily on Java and includes all data, codes, and scripts required for replicating the studies in the paper "Measuring and Mitigating Gaps in Structural Testing".


## Introduction

The artifact implements the host checked coverage (hcc) metric, the coverage gap computed from hcc, and the assertion recommendations to close the gap. HCC is calculated for the statement (SCC) and object branch criteria (OBCC). To compute hcc, we used and extended the JavaSlicer (https://github.com/backes/javaslicer). Once hcc is calculated, we compute the coverage gap from hcc and regular code coverage (RQ1), where regular statement and object branch coverage are calculated from the clover and JaCoCo tools.
We have shown that the gap strongly and negatively correlates with fault detection effectiveness (RQ2). We utilize the gap to generate recommendations to add more assertions to a test suite and improve the fault-detection power (RQ3+RQ4).
In this replication package, we have shown how to run the end-to-end experiment, and then we have provided RQ-wise instructions to regenerate the results presented in the paper.


## Setup

The artifact has been tested on Ubuntu 20. We recommend starting with a clean Ubuntu 20 virtual machine to familiarize yourselves with HCC.

HCC framework requires the following software on your machine:

- JDK 1.7 (https://www.oracle.com/java/technologies/javase/javase7-archive-downloads.html, https://docs.oracle.com/javase/7/docs/webnotes/install/linux/linux-jdk.html#install-64)
- JDK 1.8 (https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)

Run the following commands to install:

        sudo apt-get update
        sudo apt-get install openjdk-8-jdk

Verify the version of the JDK:

        java -version

The output should look like this:

        openjdk version "1.8.0_312"
        OpenJDK Runtime Environment (build 1.8.0_312-8u312-b07-0ubuntu1~20.04-b07)
        OpenJDK 64-Bit Server VM (build 25.312-b07, mixed mode)

- Apache Maven 3.6.3 (https://maven.apache.org/)


        sudo apt update        
        sudo apt install maven

  To verify the installation, run mvn -version:
  
        mvn -version
  The output should look something like this:
     
       Apache Maven 3.6.3
       Maven home: /usr/share/maven
       Java version: 1.8.0_312, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
       Default locale: en_US, platform encoding: UTF-8
       OS name: "linux", version: "5.13.0-41-generic", arch: "amd64", family: "unix"


Once this is done, update the maven and Java-related environment variables in the file `experiments/setenv`

Then set the needed environment variables in your shell by running (remember to set these environment variables for each shell you will be using):
```
# Assuming that you are in the top level of this project...
cd experiments
. setenv
```
To build the HCC support libraries:
```
cd $HCC_HOME
./scripts/install_all.sh
```
## Running end-to-end

To make sure everything is working properly, run the following smoke tests:
```
cd $HCC_EXPERIMENTS/scripts
./smoke-tests.sh
```

The smoke tests should take approximately 10mns and will exercise an end-to-end workflow of the HCC toolset. 
You should see output that looks like the following:

```
*****************************************************************
Smoke tests for end-to-end checked coverage computation workflow
*****************************************************************

Verify ability to generate:
   - statement coverage via clover
   - object branch coverage via jacoco
   - traces
   - slices
   - checked coverage (statement)
   - checked coverage (object branch)
   - recommender/evaluator tool output

= Computing statement coverage =
   Statements: 288/1009 (28.5%)  

= Computing object-branch coverage =
Object-branch coverage output file created: OK

= Generating trace files =
Trace file generated: OK

= Generating slices =
Slice file(s) generated: OK

= Computing statement checked coverage (SCC) =                                                     
total_stmt, total_executed, total_missed, total_checked_stmt, total_assertion                                                                   
1009,288,721,197,15                                                                                                                             
SCC computed: OK                                                                                                        
                                                                  
= Computing object-branch checked coverage (OBCC) =                                                                                                     
total_branch,total_executed,total_missed,total_checked,total_criteria                                                                           
698,137,561,86,15                                                                                                                               
OBCC computed: OK                                                                                                    
                                                                                                                                                 
= Running recommendation evaluator =                                                       
subject,total_assertion,top_1(%),top_5(%),top_10(%)                                                                                             
project,9,55.56,100.00,100.00,                                                                                                                   
Evaluator ran successfully: OK 
```


# RQ2
To assess the functionality and reusuability of RQ2, run the following commands:

    cd $HCC_EXPERIMENTS/scripts
    ./rq2.sh

This should take approximately 2 minutes to generate 15 different test suites from the commons-cli-limited subject and run mutation test on those 15 test suites. 
Upon successful completion, the outputs are stored in the $HCC_EXPERIMENTS/hcc_results/commons-cli-limited/rq2 directory, result.txt stores the statement checked coverage
gap for 15 test suites and mutation_result.txt stores the mutation scores. All 15 test suites are stored $HCC_EXPERIMENTS/subjects/commons-cli-limited/rq2_test_suites directory.