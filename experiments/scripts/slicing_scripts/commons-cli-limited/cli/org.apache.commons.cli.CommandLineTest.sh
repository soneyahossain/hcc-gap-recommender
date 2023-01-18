#!/bin/bash

echo "computing slice for CommandLineTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptionProperties:43:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptionProperties:44:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptionProperties:45:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptionProperties:46:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptionProperties:47:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptionProperties:48:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptionProperties:50:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptions:57:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptions:58:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetOptions:64:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetParsedOptionValue:76:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testGetParsedOptionValue:77:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testBuilder:89:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testBuilder:90:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli-limited/cli_traces/CommandLineTest.trace org.apache.commons.cli.CommandLineTest.testBuilder:91:*>$HCC_EXPERIMENTS/slices/commons-cli-limited/cli_slices/CommandLineTest/CommandLineTest15.txt

#Total Asserts in org.apache.commons.cli/CommandLineTest=============15
#Total Tests in org.apache.commons.cli/CommandLineTest=============0