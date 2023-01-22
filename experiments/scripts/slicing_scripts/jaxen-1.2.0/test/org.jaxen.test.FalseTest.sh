#!/bin/bash

echo "computing slice for FalseTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FalseTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FalseTest.trace org.jaxen.test.FalseTest.testFalseOfNumber:94:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FalseTest/FalseTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FalseTest.trace org.jaxen.test.FalseTest.testFalse:102:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FalseTest/FalseTest2.txt

#Total Asserts in org.jaxen.test/FalseTest=============2
#Total Tests in org.jaxen.test/FalseTest=============0
