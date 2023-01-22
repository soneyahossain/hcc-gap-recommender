#!/bin/bash

echo "computing slice for FunctionCallExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionCallExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionCallExceptionTest.trace org.jaxen.test.FunctionCallExceptionTest.testMessageIsNonNull:71:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionCallExceptionTest/FunctionCallExceptionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionCallExceptionTest.trace org.jaxen.test.FunctionCallExceptionTest.testMessageIsNonNull:72:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionCallExceptionTest/FunctionCallExceptionTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionCallExceptionTest.trace org.jaxen.test.FunctionCallExceptionTest.testMessageIsSaved:80:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionCallExceptionTest/FunctionCallExceptionTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionCallExceptionTest.trace org.jaxen.test.FunctionCallExceptionTest.testMessageIsSaved:81:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionCallExceptionTest/FunctionCallExceptionTest4.txt

#Total Asserts in org.jaxen.test/FunctionCallExceptionTest=============4
#Total Tests in org.jaxen.test/FunctionCallExceptionTest=============0
