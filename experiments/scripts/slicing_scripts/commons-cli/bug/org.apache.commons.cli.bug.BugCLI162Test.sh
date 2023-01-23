#!/bin/bash

echo "computing slice for BugCLI162Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI162Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI162Test.trace org.apache.commons.cli.bug.BugCLI162Test.testInfiniteLoop:63:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI162Test/BugCLI162Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI162Test.trace org.apache.commons.cli.bug.BugCLI162Test.testPrintHelpLongLines:310:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI162Test/BugCLI162Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI162Test.trace org.apache.commons.cli.bug.BugCLI162Test.testLongLineChunking:342:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI162Test/BugCLI162Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI162Test.trace org.apache.commons.cli.bug.BugCLI162Test.testLongLineChunkingIndentIgnored:360:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI162Test/BugCLI162Test4.txt

#Total Asserts in org.apache.commons.cli.bug/BugCLI162Test=============4
#Total Tests in org.apache.commons.cli.bug/BugCLI162Test=============0
