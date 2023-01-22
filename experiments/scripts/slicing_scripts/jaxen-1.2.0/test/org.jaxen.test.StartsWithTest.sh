#!/bin/bash

echo "computing slice for StartsWithTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithNumber:89:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithString:96:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithString3:103:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithNumber2:110:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithString2:117:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testEmptyStringStartsWithNonEmptyString:125:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testEmptyStringStartsWithEmptyString:132:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithEmptyString:139:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithFunctionRequiresAtLeastTwoArguments:152:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/StartsWithTest.trace org.jaxen.test.StartsWithTest.testStartsWithFunctionRequiresAtMostTwoArguments:167:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/StartsWithTest/StartsWithTest10.txt

#Total Asserts in org.jaxen.test/StartsWithTest=============10
#Total Tests in org.jaxen.test/StartsWithTest=============0
