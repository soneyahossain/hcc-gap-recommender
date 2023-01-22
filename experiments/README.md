This repository contains all the files and scripts needed to compute SCC and OBCC metrics for various projects.
To the extent possible, projects were forked and minimal changes were applied. Changes typically consist of:
* modifying `pom.xml` to add the clover and JaCoCo plugins to compute statement and object-branch structural coverage metrics
* modifying `pom.xml` to exclude tests that fail with clover, tracing and/or slicing

# directory layout under the experiments directory
* `subjects` contains the programs/projects under test
* `specs` itemizes the list of test classes for each project
* `slices` and `traces` are automatically generated
* `scripts` contains utility scripts to run tests, record structure coverage metrics and compute SCC and OBCC metrics
* `hcc_results` contains the output files generated 
