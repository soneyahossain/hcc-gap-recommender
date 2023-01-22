#!/bin/bash

echo "computing slice for BugCLI13Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI13Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI13Test.trace org.apache.commons.cli.bug.BugCLI13Test.testCLI13:49:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI13Test/BugCLI13Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI13Test.trace org.apache.commons.cli.bug.BugCLI13Test.testCLI13:50:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI13Test/BugCLI13Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI13Test.trace org.apache.commons.cli.bug.BugCLI13Test.testCLI13:51:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI13Test/BugCLI13Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI13Test.trace org.apache.commons.cli.bug.BugCLI13Test.testCLI13:52:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI13Test/BugCLI13Test4.txt

#Total Asserts in org.apache.commons.cli.bug/BugCLI13Test=============4
#Total Tests in org.apache.commons.cli.bug/BugCLI13Test=============0
