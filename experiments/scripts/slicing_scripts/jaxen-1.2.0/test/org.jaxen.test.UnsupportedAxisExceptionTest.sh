#!/bin/bash

echo "computing slice for UnsupportedAxisExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/UnsupportedAxisExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/UnsupportedAxisExceptionTest.trace org.jaxen.test.UnsupportedAxisExceptionTest.testMessageIsNonNull:69:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/UnsupportedAxisExceptionTest/UnsupportedAxisExceptionTest1.txt

#Total Asserts in org.jaxen.test/UnsupportedAxisExceptionTest=============1
#Total Tests in org.jaxen.test/UnsupportedAxisExceptionTest=============0
