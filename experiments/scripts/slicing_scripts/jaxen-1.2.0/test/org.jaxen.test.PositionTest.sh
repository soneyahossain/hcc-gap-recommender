#!/bin/bash

echo "computing slice for PositionTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/PositionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/PositionTest.trace org.jaxen.test.PositionTest.testPositionOfNumber:94:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/PositionTest/PositionTest1.txt

#Total Asserts in org.jaxen.test/PositionTest=============1
#Total Tests in org.jaxen.test/PositionTest=============0
