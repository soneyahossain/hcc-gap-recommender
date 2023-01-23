#!/bin/bash

echo "computing slice for BugCLI266Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI266Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI266Test.trace org.apache.commons.cli.bug.BugCLI266Test.testOptionComparatorDefaultOrder:46:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI266Test/BugCLI266Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI266Test.trace org.apache.commons.cli.bug.BugCLI266Test.testOptionComparatorInsertedOrder:56:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI266Test/BugCLI266Test2.txt

#Total Asserts in org.apache.commons.cli.bug/BugCLI266Test=============2
#Total Tests in org.apache.commons.cli.bug/BugCLI266Test=============0
