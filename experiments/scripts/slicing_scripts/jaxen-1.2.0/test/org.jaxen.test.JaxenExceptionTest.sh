#!/bin/bash

echo "computing slice for JaxenExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JaxenExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/JaxenExceptionTest.trace org.jaxen.test.JaxenExceptionTest.testMessageIsNonNull:71:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JaxenExceptionTest/JaxenExceptionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/JaxenExceptionTest.trace org.jaxen.test.JaxenExceptionTest.testPrintStackTrace:82:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JaxenExceptionTest/JaxenExceptionTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/JaxenExceptionTest.trace org.jaxen.test.JaxenExceptionTest.testPrintStackTrace:83:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JaxenExceptionTest/JaxenExceptionTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/JaxenExceptionTest.trace org.jaxen.test.JaxenExceptionTest.testPrintStackTrace:84:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JaxenExceptionTest/JaxenExceptionTest4.txt

#Total Asserts in org.jaxen.test/JaxenExceptionTest=============4
#Total Tests in org.jaxen.test/JaxenExceptionTest=============0
