#!/bin/bash

echo "computing slice for XPathSyntaxExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/XPathSyntaxExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/XPathSyntaxExceptionTest.trace org.jaxen.test.XPathSyntaxExceptionTest.testGetXPath:74:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/XPathSyntaxExceptionTest/XPathSyntaxExceptionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/XPathSyntaxExceptionTest.trace org.jaxen.test.XPathSyntaxExceptionTest.testGetPositionMarker:86:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/XPathSyntaxExceptionTest/XPathSyntaxExceptionTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/XPathSyntaxExceptionTest.trace org.jaxen.test.XPathSyntaxExceptionTest.testGetPositionMarker:87:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/XPathSyntaxExceptionTest/XPathSyntaxExceptionTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/XPathSyntaxExceptionTest.trace org.jaxen.test.XPathSyntaxExceptionTest.testGetMultilineMessage:100:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/XPathSyntaxExceptionTest/XPathSyntaxExceptionTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/XPathSyntaxExceptionTest.trace org.jaxen.test.XPathSyntaxExceptionTest.testGetMultilineMessage:101:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/XPathSyntaxExceptionTest/XPathSyntaxExceptionTest5.txt

#Total Asserts in org.jaxen.test/XPathSyntaxExceptionTest=============5
#Total Tests in org.jaxen.test/XPathSyntaxExceptionTest=============0
