#!/bin/bash

echo "computing slice for AxisTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/AxisTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/AxisTest.trace org.jaxen.test.AxisTest.testIllegalAxisNumber:72:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/AxisTest/AxisTest1.txt

#Total Asserts in org.jaxen.test/AxisTest=============1
#Total Tests in org.jaxen.test/AxisTest=============0
