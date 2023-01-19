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


==========================================================================================
[SmokeTest] commons-cli-limited: Cleaning up any old experimental artifacts
==========================================================================================
Cleaning up traces directory
Cleaning up slices directory
Cleaning up results directory

==========================================================================================
[SmokeTest] commons-cli-limited: Compute baseline coverage information with clover (< 1mn)
==========================================================================================
Clover baseline coverage: OK
Coverage Overview -
Coverage:-
      Methods: 99/253 (39.1%)                                                                                                   
   Statements: 288/1009 (28.5%)                                                                                                 
     Branches: 96/468 (20.5%)                                                                                                   
        Total: 27.9%                                                                                                            
Complexity:-
   Avg Method: 2.217
      Density: 0.556
        Total: 561

==========================================================================================
[SmokeTest] commons-cli-limited: Compute baseline coverage information with jacoco (< 1mn)
==========================================================================================
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.179 s
[INFO] Finished at: 2023-01-18T20:22:27Z
[INFO] ------------------------------------------------------------------------
Save jacoco.xml in /home/stg/hcc-gap-recommender/experiments/hcc_results/commons-cli-limited/jacoco/

==========================================================================================
[SmokeTest] commons-cli-limited: Generate trace information for unit tests (< 2mns)
==========================================================================================
Trace file generated: OK
total 7588
-rw-rw-r-- 1 stg stg 7768597 Jan 18 20:23 CommandLineTest.trace

==========================================================================================
[SmokeTest] commons-cli-limited: Slice traces (~10mns)
==========================================================================================
Slice file(s) generated: OK
/home/stg/hcc-gap-recommender/experiments/slices/commons-cli-limited/cli_slices/:
total 4
drwxrwxr-x 2 stg stg 4096 Jan 18 20:25 CommandLineTest

/home/stg/hcc-gap-recommender/experiments/slices/commons-cli-limited/cli_slices/CommandLineTest:
total 436
-rw-rw-r-- 1 stg stg  8939 Jan 18 20:25 CommandLineTest15.txt
-rw-rw-r-- 1 stg stg  6510 Jan 18 20:25 CommandLineTest14.txt
-rw-rw-r-- 1 stg stg  7106 Jan 18 20:25 CommandLineTest13.txt
-rw-rw-r-- 1 stg stg 41426 Jan 18 20:24 CommandLineTest12.txt
-rw-rw-r-- 1 stg stg 40431 Jan 18 20:24 CommandLineTest11.txt
-rw-rw-r-- 1 stg stg  5326 Jan 18 20:24 CommandLineTest10.txt
-rw-rw-r-- 1 stg stg  4012 Jan 18 20:24 CommandLineTest9.txt
-rw-rw-r-- 1 stg stg  4273 Jan 18 20:24 CommandLineTest8.txt
-rw-rw-r-- 1 stg stg 44125 Jan 18 20:24 CommandLineTest7.txt
-rw-rw-r-- 1 stg stg 43454 Jan 18 20:24 CommandLineTest6.txt
-rw-rw-r-- 1 stg stg 42567 Jan 18 20:23 CommandLineTest5.txt
-rw-rw-r-- 1 stg stg 43728 Jan 18 20:23 CommandLineTest4.txt
-rw-rw-r-- 1 stg stg 43592 Jan 18 20:23 CommandLineTest3.txt
-rw-rw-r-- 1 stg stg 45389 Jan 18 20:23 CommandLineTest2.txt
-rw-rw-r-- 1 stg stg 34564 Jan 18 20:23 CommandLineTest1.txt

==========================================================================================
[SmokeTest] commons-cli-limited: Compute checked coverage statement metric
==========================================================================================
Checked Coverage (statement) computed: OK

==========================================================================================
[SmokeTest] commons-cli-limited: Compute checked coverage object branch metric
==========================================================================================
Checked Coverage (object-branch) computed: OK

==========================================================================================
[SmokeTest] commons-cli-limited: Run recommender/evaluator
==========================================================================================
```

# Experimental Subjects
List all the subjects from the ICSE paper
