#!/bin/bash

echo "computing slice for UtilTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingHyphens:30:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingHyphens:31:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingHyphens:32:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingHyphens:33:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingAndTrailingQuotes:39:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingAndTrailingQuotes:40:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingAndTrailingQuotes:41:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingAndTrailingQuotes:42:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/UtilTest.trace org.apache.commons.cli.UtilTest.testStripLeadingAndTrailingQuotes:43:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/UtilTest/UtilTest9.txt

#Total Asserts in org.apache.commons.cli/UtilTest=============9
#Total Tests in org.apache.commons.cli/UtilTest=============0
