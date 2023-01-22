#!/bin/bash

echo "computing slice for TrueTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/TrueTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/TrueTest.trace org.jaxen.test.TrueTest.testTrueOfNumber:94:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/TrueTest/TrueTest1.txt

#Total Asserts in org.jaxen.test/TrueTest=============1
#Total Tests in org.jaxen.test/TrueTest=============0
