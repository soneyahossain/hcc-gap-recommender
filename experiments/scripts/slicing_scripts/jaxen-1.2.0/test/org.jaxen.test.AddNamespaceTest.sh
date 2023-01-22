#!/bin/bash

echo "computing slice for AddNamespaceTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/AddNamespaceTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/AddNamespaceTest.trace org.jaxen.test.AddNamespaceTest.testDefaultContext:73:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/AddNamespaceTest/AddNamespaceTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/AddNamespaceTest.trace org.jaxen.test.AddNamespaceTest.testDefaultContext:75:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/AddNamespaceTest/AddNamespaceTest2.txt

#Total Asserts in org.jaxen.test/AddNamespaceTest=============2
#Total Tests in org.jaxen.test/AddNamespaceTest=============0
