#!/bin/bash

echo "computing slice for RoundTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/RoundTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/RoundTest.trace org.jaxen.test.RoundTest.testRound:91:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/RoundTest/RoundTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/RoundTest.trace org.jaxen.test.RoundTest.testNegativeRound:100:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/RoundTest/RoundTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/RoundTest.trace org.jaxen.test.RoundTest.testNaNRoundIsNaN:107:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/RoundTest/RoundTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/RoundTest.trace org.jaxen.test.RoundTest.testRoundFunctionRequiresAtLeastOneArgument:120:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/RoundTest/RoundTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/RoundTest.trace org.jaxen.test.RoundTest.testRoundFunctionRequiresAtMostOneArgument:135:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/RoundTest/RoundTest5.txt

#Total Asserts in org.jaxen.test/RoundTest=============5
#Total Tests in org.jaxen.test/RoundTest=============0
