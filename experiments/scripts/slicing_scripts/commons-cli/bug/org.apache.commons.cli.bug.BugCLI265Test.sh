#!/bin/bash

echo "computing slice for BugCLI265Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithValue:61:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithValue:62:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithoutValue:71:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseShortOptionWithoutValue:73:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseConcatenatedShortOptions:82:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseConcatenatedShortOptions:83:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseConcatenatedShortOptions:84:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseConcatenatedShortOptions:85:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/bug_traces/BugCLI265Test.trace org.apache.commons.cli.bug.BugCLI265Test.shouldParseConcatenatedShortOptions:86:*>$HCC_EXPERIMENTS/slices/commons-cli/bug_slices/BugCLI265Test/BugCLI265Test9.txt

#Total Asserts in org.apache.commons.cli.bug/BugCLI265Test=============9
#Total Tests in org.apache.commons.cli.bug/BugCLI265Test=============0
