# Artifact: Measuring and Mitigating Gaps in Structural Testing

This repository contains the `artifact` for testing the host checked coverage (HCC), coverage gaps, and the recommendations for closing the gaps to improve fault-detection effectiveness. It is implemented primarily in Java and includes all data, source codes, and scripts required for replicating the studies in the paper `Measuring and Mitigating Gaps in Structural Testing` published at `ICSE-2023`.

## Introduction

This replication package implements the host checked coverage (HCC) metric, the coverage gap computed from HCC, and the assertion recommendations to close the gap. Two variants of HCC are the `statement checked coverage (SCC)` and `object branch checked coverage (OBCC)`. To compute HCC, we used and extended the `JavaSlicer (https://github.com/backes/javaslicer)`. Once HCC is calculated, we compute the coverage gap from HCC and regular code coverage `(RQ1)`, where regular statement and object branch coverage are computed using the `clover` and `JaCoCo` tools.
We have shown that the gap strongly and negatively correlates with the fault detection effectiveness `(RQ2)`. We utilize the gap to generate recommendations to add more assertions to a test suite and improve the fault-detection power `(RQ3+RQ4)`.
In this replication package, we have shown how to run a time-limited end-to-end experiment and provided RQ-wise instructions to regenerate the results presented in the paper. Instructions and bash scripts to run the entire experiment are also provided.

## Setup

### Setup (VirtualBox 6.1): the easy way
Simply download and use the VirtualBox VM provided at `FIXME: final location`. It will have all relevant dependencies and environment variables already set up when you open a terminal. The username is `icse2023`, and the password is `icse2023`.

Once you start the VM, open up a terminal and follow the directions starting from `Running HCC end-to-end` to `RQ4`

### Setup on your own machine
The artifact have been tested on both `Ubuntu 20` and `Ubuntu 22`. Again, we highly recommend using the `VirtualBox VM` to familiarize yourselves with the HCC framework.
If installing on your own machine, we recommend starting with a clean machine. 

HCC framework requires the following software on your machine:

- `JDK 1.7` (https://www.oracle.com/java/technologies/javase/javase7-archive-downloads.html, https://docs.oracle.com/javase/7/docs/webnotes/install/linux/linux-jdk.html#install-64)
- `JDK 1.8` (https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)

Following commands can be run to install JDK 1.8:

        sudo apt-get update
        sudo apt-get install openjdk-8-jdk

Verify the version of the JDK:

        java -version

The output should look like this:

        openjdk version "1.8.0_312"
        OpenJDK Runtime Environment (build 1.8.0_312-8u312-b07-0ubuntu1~20.04-b07)
        OpenJDK 64-Bit Server VM (build 25.312-b07, mixed mode)

- `Apache Maven 3.6.3` (https://maven.apache.org/)  

Following commands can be run to install Maven 3.6.3:  

        sudo apt update        
        sudo apt install maven

To verify the installation, run:
        
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
To build the `HCC` support libraries:
```
cd $HCC_HOME
./scripts/install_all.sh
```

## Running `HCC` end-to-end

To make sure everything is working accurately, run the following smoke tests:
```
cd $HCC_EXPERIMENTS/scripts
./smoke-tests.sh
```

The smoke tests should take less than 15 minutes and will exercise the HCC toolset workflow end-to-end. 
You should see output that looks like the following:

```
*****************************************************************
Smoke tests for end-to-end host checked coverage computation workflow
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
total_branch, total_executed, total_missed, total_checked, total_assertion                                                                           
698,137,561,86,15                                                                                                                               
OBCC computed: OK                                                                                                    
                                                                                                                                                 
= Run recommendation evaluator =                                                       
subject,total_assertion,top_1(%),top_5(%),top_10(%)                                                                                             
project,9,55.56,100.00,100.00,                                                                                                                   
Evaluator ran successfully: OK 
```

# RQ1
To assess RQ1 (computation of SCC and OBCC, coverage gap), you first must `download` the relevant slices for all subjects. If you are running the provided VirtualBox VM, this is already done for you.

Otherwise, you can download a [zipped tar file of slices](https://drive.google.com/file/d/12ood1KRff2ZKYMM2gQ8JXEP_adzBQ1ci/view?usp=share_link). The tar file should be saved in `$HCC_EXPERIMENTS`.
To `untar`:

```
# be sure to save the downloaded file into $HCC_EXPERIMENTS
tar xvfz icse-2023-slices.tar.gz
```

Issue the command `ls slices`. You should see output of the form:

```
commons-cli          commons-codec-1.12  commons-lang-3.6  commons-validator  jackson-dataformat-xml  jfreechart  jsoup-1.10.1  xstream
commons-cli-limited  commons-csv         commons-text      gson               jaxen-1.2.0             joda-time   plexus-utils
```

To compute `SCC` and `OBCC` metrics for subjects commons-cli and commons-csv, run:

```
# this is a time-limited experiment for RQ1, this will take about 5 minutes to run
cd $HCC_EXPERIMENTS/scripts
./rq1.sh
```

The script will output `SCC` and `OBCC` data for commons-cli and commons-csv, and should look like:

```
=== Show statement checked coverage (SCC) output for each subject
commons-cli
total_stmt, total_executed, total_missed, total_checked_stmt, total_assertion
1009,836,173,559,405
commons-csv
total_stmt, total_executed, total_missed, total_checked_stmt, total_assertion
748,688,60,367,898
```
In general, data for a given subject program can be found in `$HCC_EXPERIMENTS/hcc_results/<subject>/scc.csv`

```
=== Show object-branch checked coverage (OBCC) output for each subject
commons-cli
total_branch,total_executed,total_missed,total_checked,total_criteria
698,519,179,310,405
commons-csv
total_branch,total_executed,total_missed,total_checked,total_criteria
576,507,69,234,898
```
In general, data for a given subject program can be found in `$HCC_EXPERIMENTS/hcc_results/<subject>/obcc.csv`

### For computing `SCC` and `OBCC` for all subjects, run the following commands which may take approximately 1 hour
```
# warning: can easily take 1 hr
cd $HCC_EXPERIMENTS/scripts
./rq1.sh all
```

After running `RQ1`, you may wish to run `RQ3 `next as `RQ3` makes use of the output generated by `RQ1`.

# RQ2
To quickly assess the functionality and reusuability of `RQ2`, run the following time-limited bash script:

    cd $HCC_EXPERIMENTS/scripts
    ./rq2.sh

Note: you may see some exceptions during the mutation testing, these are normal and expected. This same bash file can be used to run experiments for all subjects, however, that may take days when running a single job using multicore processor.

This should take approximately 2 minutes to generate 15 different test suites from the `commons-cli-limited` subject and run mutation test on those 15 test suites. 
Upon successful completion, the outputs are stored in the `$HCC_EXPERIMENTS/hcc_results/commons-cli-limited/rq2` directory, `result.txt` stores the statement checked coverage
gap for 15 test suites and `mutation_result.txt` stores the mutation scores. All 15 test suites are stored `$HCC_EXPERIMENTS/subjects/commons-cli-limited/rq2_test_suites` directory.

# RQ3

To quickly assess the functionality and reusuability of `RQ3`, run the following time-limited bash script:

```
cd $HCC_EXPERIMENTS/scripts
./rq3.sh 
```

This should only take 1-2 minutes to run:

```
=== Show evalution of recommendations
commons-cli
subject,total_assertion,top_1(%),top_5(%),top_10(%)
project,331,16.01,51.06,69.79,
commons-csv
subject,total_assertion,top_1(%),top_5(%),top_10(%)
project,601,69.05,84.19,90.02,
```
This output can be found in `$HCC_EXPERIMENTS/hcc_results/<subject>/evaluator/summary.csv`

To run the entire study, run the following commands which may take few minutes

```
cd $HCC_EXPERIMENTS/scripts
# for all subjects
./rq3.sh all
```


# RQ4

In RQ4, we have added additional assertions in the `$HCC_EXPERIMENTS/subjects/joda-time/src/test/java/org/joda/time/chrono` test suite based on the recommendation. The enriched test suite can be found at `$HCC_EXPERIMENTS/subjects/joda-time/rq4_enriched_testsuite`. RQ4 computes statement checked coverage for both versions of the chronology test suites. Run following commands to evaluate RQ4:

```
cd $HCC_EXPERIMENTS/scripts
./rq4.sh
```
This should only take 1-2 minutes to run. The output will display:

```
Compute SCC for original joda-time chronology package
total checked statements in class: 1546
.
.
Compute SCC for enriched joda-time chronology package
total checked statements in class: 2068
```
Meaning that additional assertions increased the total number of checked statement by 522. The detailed results should be stored in `$HCC_EXPERIMENTS/hcc_results/joda-time`, where `rq4_original_data` directory stores results for original test suite and 
`rq4_enriched_data` stores results for the enriched test suite. One can run mutation testing again to see the difference in fault-detection effectiveness, however, we skipped that part as mutation testing takes more than 10 minutes to run per test suite. 


# Other
More details about various scripts used to compute HCC can be found in the `README` of the [experiments directory](experiments/). 

# References

1. Hossain, Soneya Binta; B. Dwyer, Matthew; Elbaum, Sebastian; Nguyen-Tuong, Anh (2023): Measuring and Mitigating Gaps in Structural Testing. figshare. Preprint. https://doi.org/10.6084/m9.figshare.21932058.v5 

2. David Schuler and Andreas Zeller. 2011. Assessing Oracle Quality with Checked Coverage. In Proceedings of the 2011 Fourth IEEE International Conference on Software Testing, Verification and Validation (ICST '11). IEEE Computer Society, USA, 90–99. https://doi.org/10.1109/ICST.2011.32
