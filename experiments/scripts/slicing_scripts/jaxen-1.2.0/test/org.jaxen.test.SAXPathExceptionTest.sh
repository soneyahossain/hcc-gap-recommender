#!/bin/bash

echo "computing slice for SAXPathExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SAXPathExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SAXPathExceptionTest.trace org.jaxen.test.SAXPathExceptionTest.testMessageIsNonNull:71:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SAXPathExceptionTest/SAXPathExceptionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SAXPathExceptionTest.trace org.jaxen.test.SAXPathExceptionTest.testPrintStackTrace:81:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SAXPathExceptionTest/SAXPathExceptionTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SAXPathExceptionTest.trace org.jaxen.test.SAXPathExceptionTest.testPrintStackTrace:82:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SAXPathExceptionTest/SAXPathExceptionTest3.txt

#Total Asserts in org.jaxen.test/SAXPathExceptionTest=============3
#Total Tests in org.jaxen.test/SAXPathExceptionTest=============0
