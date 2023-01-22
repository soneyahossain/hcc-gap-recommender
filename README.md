# Artifact: Measuring and Mitigating Gaps in Structural Testing

This repository contains the artifact for testing the host checked coverage (hcc), coverage gap, and the recommender for closing that gap. It is implemented primarily on Java and includes all data, codes, and scripts required for replicating the studies in the paper "Measuring and Mitigating Gaps in Structural Testing".


## Introduction

The artifact implements the host checked coverage (hcc) metric, the coverage gap computed from hcc, and the assertion recommendations to close the gap. HCC is calculated for the statement (SCC) and object branch criteria (OBCC). To compute hcc, we used and extended the JavaSlicer (https://github.com/backes/javaslicer). Once hcc is calculated, we compute the coverage gap from hcc and regular code coverage (RQ1), where regular statement and object branch coverage are calculated from the clover and JaCoCo tools.
We have shown that the gap strongly and negatively correlates with fault detection effectiveness (RQ2). We utilize the gap to generate recommendations to add more assertions to a test suite and improve the fault-detection power (RQ3+RQ4).
In this replication package, we have shown how to run the end-to-end experiment, and then we have provided RQ-wise instructions to regenerate the results presented in the paper.


## Setup

### Setup: the easy way
Simply download and use the VirtualBox VM provided at `FIXME: final location`. It will have all relevant dependencies and environment variables already setup. The username is `icse2023` and the password is `icse2023`.

### Setup on your own machine
The artifacts have been tested on both Ubuntu 20 and Ubuntu 22. Again, we highly recommend using the VirtualBox VM to familiarize yourselves with HCC.
If installing on your own machine, we recommend starting with a clean machine. 

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

## Running HCC end-to-end

To make sure everything is working properly, run the following smoke tests:
```
cd $HCC_EXPERIMENTS/scripts
./smoke-tests.sh
```

The smoke tests should take less than 15 mns and will exercise the HCC toolset workflow end-to-end. 
You should see output that looks like the following:

```
*****************************************************************
Smoke tests for end-to-end checked coverage computation workflow
*****************************************************************

Verify ability to generate:
   - statement coverage via clover
   - object branch coverage via JaCoCo
   - traces via JavaSlicer
   - slices via JavaSlicer
   - statement checked coverage (SCC)
   - object branch coverage (OBCC)
   - recommendations via recommender

= Compute baseline statement coverage = 
SCC output file created: OK
   Statements: 288/1009 (28.5%)                                                                                                 

= Compute baseline object branch coverage = 
OBCC output file created: OK

= Generate traces (~2mns) = 
Trace file generated: OK

= Generate slices =
Slice file(s) generated: OK

= Compute SCC =                                                     
total_stmt, total_executed, total_missed, total_checked_stmt, total_assertion                                                                   
1009,288,721,197,15                                                                                                                             
SCC computed: OK                                                                                                        
                                                                  
= Compute OBCC =                                                                                                     
total_branch,total_executed,total_missed,total_checked,total_criteria                                                                           
698,137,561,86,15                                                                                                                               
OBCC computed: OK                                                                                                    
                                                                                                                                                 
= Run recommendation evaluator =                                                       
subject,total_assertion,top_1(%),top_5(%),top_10(%)                                                                                             
project,9,55.56,100.00,100.00,                                                                                                                   
Evaluator ran successfully: OK 
```

# RQ1
To assess RQ1 (computation of SCC and OBCC), you first must download the relevant slices for all subjects. If you are running the provided Virtual Box VM, this is already done for you.

Otherwise, you can download a zipped tar file of slices from `FIXME: FINAL_LOCATION_FOR_SLICES`. The tar file should be saved in `$HCC_EXPERIMENTS`.
To untar:

```
# be sure to save the downloaded file into $HCC_EXPERIMENTS
tar xvfz icse-2023-slices.tar.gz
```

Issue the command `ls slices`. You should see output of the form:

```
commons-cli          commons-codec-1.12  commons-lang-3.6  commons-validator  jackson-dataformat-xml  jfreechart  jsoup-1.10.1  xstream
commons-cli-limited  commons-csv         commons-text      gson               jaxen-1.2.0             joda-time   plexus-utils
```

To compute HCC and OBCC metrics for a specific subject program, e.g. `commons-cli`, or seveal subjects, e.g. `commons-cli commons-csv`, run:

```
# this will take about 5 mns
cd $HCC_EXPERIMENTS/scripts
./rq1.sh commons-cli commons-csv
```

The script will output HCC and OBCC data for all subject programs upon completion, and should look like:

```
=== Show HCC statement (SCC) output for each subject
commons-cli
total_stmt, total_executed, total_missed, total_checked_stmt, total_assertion
1009,836,173,559,405
commons-csv
total_stmt, total_executed, total_missed, total_checked_stmt, total_assertion
748,688,60,367,898
```
In general, data for a given subject program can be found in `$HCC_EXPERIMENTS/hcc_results/<subject>/scc.csv`

```
=== Show HCC object-branch (OBCC) output for each subject
commons-cli
total_branch,total_executed,total_missed,total_checked,total_criteria
698,519,179,310,405
commons-csv
total_branch,total_executed,total_missed,total_checked,total_criteria
576,507,69,234,898
```
In general, data for a given subject program can be found in `$HCC_EXPERIMENTS/hcc_results/<subject>/obcc.csv`

### Computing HCC and OBCC for all subjects
```
# warning: this can easily take up 1hr to run for all subjects
cd $HCC_EXPERIMENTS/scripts
./rq1.sh
```

After running RQ1, you may wish to run RQ3 next as RQ3 makes use of the output generated by RQ1.

# RQ2
To assess the functionality and reusuability of RQ2, run the following commands:

    cd $HCC_EXPERIMENTS/scripts
    ./rq2.sh

This should take approximately 2 minutes to generate 15 different test suites from the commons-cli-limited subject and run mutation test on those 15 test suites. 
Upon successful completion, the outputs are stored in the $HCC_EXPERIMENTS/hcc_results/commons-cli-limited/rq2 directory, result.txt stores the statement checked coverage
gap for 15 test suites and mutation_result.txt stores the mutation scores. All 15 test suites are stored $HCC_EXPERIMENTS/subjects/commons-cli-limited/rq2_test_suites directory.

# RQ3
Once RQ1 successfully completes, you can run scripts for RQ3.
```
cd $HCC_EXPERIMENTS/scripts

# you can specify a list of subject programs
./rq3.sh commons-cli commons-csv

# for all subjects
./rq3.sh
```

This should only take 1-2 mns to run. The output will display data for each subject program specified:
```
=== Show evalution of recommendations
commons-cli
subject,total_assertion,top_1(%),top_5(%),top_10(%)
project,331,16.01,51.06,69.79,
commons-csv
subject,total_assertion,top_1(%),top_5(%),top_10(%)
project,601,69.05,84.19,90.02,
```
This data can be found in `$HCC_EXPERIMENTS/hcc_results/<subject>/evaluator/summary.csv`

# RQ4

# Other
TODO: say something about collecting traces (for ex. for a new program) and that it can take both a long time and requires gobs of storage and memory. 
TODO: describe the layout and content of `experiments` (do this by updating the README under experiments)
