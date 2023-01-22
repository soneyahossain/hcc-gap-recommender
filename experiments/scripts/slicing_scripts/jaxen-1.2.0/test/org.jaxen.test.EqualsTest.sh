#!/bin/bash

echo "computing slice for EqualsTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/EqualsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/EqualsTest.trace org.jaxen.test.EqualsTest.testEqualityAgainstNonExistentNodes:96:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/EqualsTest/EqualsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/EqualsTest.trace org.jaxen.test.EqualsTest.testOlander:114:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/EqualsTest/EqualsTest2.txt

#Total Asserts in org.jaxen.test/EqualsTest=============2
#Total Tests in org.jaxen.test/EqualsTest=============0
