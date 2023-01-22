#!/bin/bash

echo "computing slice for PriorityTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/PriorityTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/PriorityTest.trace org.jaxen.test.PriorityTest.testPriority:139:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/PriorityTest/PriorityTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/PriorityTest.trace org.jaxen.test.PriorityTest.testPriority:143:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/PriorityTest/PriorityTest2.txt

#Total Asserts in org.jaxen.test/PriorityTest=============2
#Total Tests in org.jaxen.test/PriorityTest=============0
