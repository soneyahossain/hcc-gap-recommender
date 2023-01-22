#!/bin/bash

echo "computing slice for ConcatTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ConcatTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/ConcatTest.trace org.jaxen.test.ConcatTest.testConcatFunctionRequiresAtLeastTwoArguments:94:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ConcatTest/ConcatTest1.txt

#Total Asserts in org.jaxen.test/ConcatTest=============1
#Total Tests in org.jaxen.test/ConcatTest=============0
