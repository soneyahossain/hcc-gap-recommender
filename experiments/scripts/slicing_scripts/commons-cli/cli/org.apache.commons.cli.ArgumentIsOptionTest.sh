#!/bin/bash

echo "computing slice for ArgumentIsOptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionAndOptionWithArgument:50:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionAndOptionWithArgument:51:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionAndOptionWithArgument:52:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionAndOptionWithArgument:53:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionWithArgument:65:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionWithArgument:66:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionWithArgument:67:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOptionWithArgument:69:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOption:80:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOption:81:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ArgumentIsOptionTest.trace org.apache.commons.cli.ArgumentIsOptionTest.testOption:82:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ArgumentIsOptionTest/ArgumentIsOptionTest11.txt

#Total Asserts in org.apache.commons.cli/ArgumentIsOptionTest=============11
#Total Tests in org.apache.commons.cli/ArgumentIsOptionTest=============0
