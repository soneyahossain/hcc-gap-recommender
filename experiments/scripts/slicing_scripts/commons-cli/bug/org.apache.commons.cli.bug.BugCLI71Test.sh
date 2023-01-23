#!/bin/bash

echo "computing slice for BugCLI71Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI71Test.trace org.apache.commons.cli.bug.BugCLI71Test.testBasic:57:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test/BugCLI71Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI71Test.trace org.apache.commons.cli.bug.BugCLI71Test.testBasic:58:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test/BugCLI71Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI71Test.trace org.apache.commons.cli.bug.BugCLI71Test.testMistakenArgument:67:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test/BugCLI71Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI71Test.trace org.apache.commons.cli.bug.BugCLI71Test.testMistakenArgument:68:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test/BugCLI71Test4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI71Test.trace org.apache.commons.cli.bug.BugCLI71Test.testLackOfError:78:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test/BugCLI71Test5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI71Test.trace org.apache.commons.cli.bug.BugCLI71Test.testGetsDefaultIfOptional:88:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test/BugCLI71Test6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI71Test.trace org.apache.commons.cli.bug.BugCLI71Test.testGetsDefaultIfOptional:89:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI71Test/BugCLI71Test7.txt

#Total Asserts in org.apache.commons.cli.bug/BugCLI71Test=============7
#Total Tests in org.apache.commons.cli.bug/BugCLI71Test=============0
