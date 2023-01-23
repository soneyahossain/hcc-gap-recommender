#!/bin/bash

echo "computing slice for ValuesTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgs:76:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgs:77:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgs:79:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgs:80:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgsWithValue:86:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgsWithValue:87:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgsWithValue:88:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgsWithValue:90:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgsWithValue:91:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testShortArgsWithValue:92:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testMultipleArgValues:98:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testMultipleArgValues:99:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testTwoArgValues:105:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testTwoArgValues:106:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testComplexValues:112:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testComplexValues:113:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testComplexValues:114:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testExtraArgs:120:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:127:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:128:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:129:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:130:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:132:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:133:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:134:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:135:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:137:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:138:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:139:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-cli/cli_traces/ValuesTest.trace org.apache.commons.cli.ValuesTest.testCharSeparator:140:*>$HCC_EXPERIMENTS/slices/commons-cli/cli_slices/ValuesTest/ValuesTest30.txt

#Total Asserts in org.apache.commons.cli/ValuesTest=============30
#Total Tests in org.apache.commons.cli/ValuesTest=============0