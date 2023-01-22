#!/bin/bash

echo "computing slice for LastTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LastTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/LastTest.trace org.jaxen.test.LastTest.testLastFunction:105:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LastTest/LastTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/LastTest.trace org.jaxen.test.LastTest.testLastFunction:106:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LastTest/LastTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/LastTest.trace org.jaxen.test.LastTest.testLastFunction:107:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LastTest/LastTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/LastTest.trace org.jaxen.test.LastTest.testLastFunctionAllowsNoArguments:135:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LastTest/LastTest4.txt

#Total Asserts in org.jaxen.test/LastTest=============4
#Total Tests in org.jaxen.test/LastTest=============0
