#!/bin/bash

echo "computing slice for SumTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SumTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SumTest.trace org.jaxen.test.SumTest.testSumOfNumber:94:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SumTest/SumTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SumTest.trace org.jaxen.test.SumTest.testSumNoArguments:108:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SumTest/SumTest2.txt

#Total Asserts in org.jaxen.test/SumTest=============2
#Total Tests in org.jaxen.test/SumTest=============0
