#!/bin/bash

echo "computing slice for VariableContextTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/VariableContextTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/VariableContextTest.trace org.jaxen.test.VariableContextTest.testUnresolvableVariable:99:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/VariableContextTest/VariableContextTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/VariableContextTest.trace org.jaxen.test.VariableContextTest.testGetVariableContext:106:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/VariableContextTest/VariableContextTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/VariableContextTest.trace org.jaxen.test.VariableContextTest.testSetNamespacelessVariable:112:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/VariableContextTest/VariableContextTest3.txt

#Total Asserts in org.jaxen.test/VariableContextTest=============3
#Total Tests in org.jaxen.test/VariableContextTest=============0
