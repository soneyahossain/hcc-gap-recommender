#!/bin/bash

echo "computing slice for BugCLI133Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI133Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI133Test.trace org.apache.commons.cli.bug.BugCLI133Test.testOrder:39:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI133Test/BugCLI133Test1.txt

#Total Asserts in org.apache.commons.cli.bug/BugCLI133Test=============1
#Total Tests in org.apache.commons.cli.bug/BugCLI133Test=============0
