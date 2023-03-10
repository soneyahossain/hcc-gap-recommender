This repository contains all the files and scripts needed to compute SCC and OBCC metrics for various projects.
To the extent possible, projects were cloned with minimal changes were applied. Changes typically consist of:
* modifying `pom.xml` to add the clover and JaCoCo plugins to compute statement and object-branch structural coverage metrics
* modifying `pom.xml` to exclude tests that fail with clover, tracing and/or slicing

# directory layout under the experiments directory
* `subjects` contains the programs/projects under test
* `specs` itemizes the list of test classes for each project
* `slices` and `traces` are automatically generated
* `scripts` contains utility scripts to run tests, record structure coverage metrics and compute SCC and OBCC metrics
* `hcc_results` contains output files generated, organized by subject programs
  * `hcc_results/<subject>/clover` contains statement coverage info generated with Clover
  * `hcc_results/<subject>/jacoco` contains object-branch coverage info generated with JaCoCo
  * `hcc_results/<subject>/scc.csv` provides SCC information and is generated by `scripts/compute_hcc.stmt.sh`
  * `hcc_results/<subject>/obcc.csv` provides OBCC information and is generated by `scripts/compute_hcc.ob.sh`

# descriptions of the major scripts under the experiments/scripts directory
Note that various environment variables must be set. These can be found in the file `setenv`.
* `smoke-tests.sh` runs the HCC workflow end-to-end on `commons-cli` configured with only a few tests
* `rq1.sh, rq2.sh, rq3.sh, rq4.sh` demonstrates the 4 major research questions highlighted in our ICSE 2023 paper
* `*build*.sh` are scripts to build the subject programs
* `trace.sh <subject>` yields traces from running unit tests
* `autogen-slicer.sh <subject>` automatically generates the slicing scripts needed by `slice.sh`
* `slice.sh <subject>` runs the scripts inside of `slicing_scripts` to generate slices on a per assertion basis
* `compute_hcc.stmt.sh <subject>` computes SCC
* `compute_hcc.ob.sh <subject>` computes OBCC
* `evaluate.sh <subject>` evaluates the recommendations generated by HCC
* `end-to-end.sh <subject>` runs the entire workflow for a given subject program

# caveats
* Traces can be very large (on the order of 50+ GBs), while slicing can consume lots of memory.
* Obtaining traces and slices for a subject can take a long time (days) as this process is currently sequential. 
  * Both tracing and slicing are parallelizable. Parallelizing both would increase performance dramatically. We welcome pull requests :)
* HCC relies on JavaSlicer and inherits its strengths and weaknesses (https://github.com/backes/javaslicer). 
  * Its main strength is that it works fairly robustly.
  * Its most visible weakness is that only Java 1.7 is supported. To broaden the impact of HCC, we would welcome the incorporation of a robust dynamic slicer that supports more recent Java versions.
