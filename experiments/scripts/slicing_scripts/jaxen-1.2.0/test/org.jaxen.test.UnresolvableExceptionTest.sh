#!/bin/bash

echo "computing slice for UnresolvableExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/UnresolvableExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/UnresolvableExceptionTest.trace org.jaxen.test.UnresolvableExceptionTest.testUnresolvableVariable:90:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/UnresolvableExceptionTest/UnresolvableExceptionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/UnresolvableExceptionTest.trace org.jaxen.test.UnresolvableExceptionTest.testUnresolvableFunction:103:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/UnresolvableExceptionTest/UnresolvableExceptionTest2.txt

#Total Asserts in org.jaxen.test/UnresolvableExceptionTest=============2
#Total Tests in org.jaxen.test/UnresolvableExceptionTest=============0
