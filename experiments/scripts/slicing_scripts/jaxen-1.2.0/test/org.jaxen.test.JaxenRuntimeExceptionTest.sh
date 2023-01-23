#!/bin/bash

echo "computing slice for JaxenRuntimeExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/JaxenRuntimeExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/JaxenRuntimeExceptionTest.trace org.jaxen.test.JaxenRuntimeExceptionTest.testMessageIsNonNull:74:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/JaxenRuntimeExceptionTest/JaxenRuntimeExceptionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/JaxenRuntimeExceptionTest.trace org.jaxen.test.JaxenRuntimeExceptionTest.testMessageIsNonNull:75:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/JaxenRuntimeExceptionTest/JaxenRuntimeExceptionTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/JaxenRuntimeExceptionTest.trace org.jaxen.test.JaxenRuntimeExceptionTest.testPrintStackTrace:86:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/JaxenRuntimeExceptionTest/JaxenRuntimeExceptionTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/JaxenRuntimeExceptionTest.trace org.jaxen.test.JaxenRuntimeExceptionTest.testPrintStackTrace:87:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/JaxenRuntimeExceptionTest/JaxenRuntimeExceptionTest4.txt

#Total Asserts in org.jaxen.test/JaxenRuntimeExceptionTest=============4
#Total Tests in org.jaxen.test/JaxenRuntimeExceptionTest=============0
