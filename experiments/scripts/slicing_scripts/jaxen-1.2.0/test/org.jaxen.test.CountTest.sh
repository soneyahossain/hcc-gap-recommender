#!/bin/bash

echo "computing slice for CountTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CountTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CountTest.trace org.jaxen.test.CountTest.testCount3:97:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CountTest/CountTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CountTest.trace org.jaxen.test.CountTest.testCountFunctionRequiresAtLeastOneArgument:116:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CountTest/CountTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CountTest.trace org.jaxen.test.CountTest.testCountFunctionRequiresAtMostOneArgument:131:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CountTest/CountTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CountTest.trace org.jaxen.test.CountTest.testCountRootElement:141:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CountTest/CountTest4.txt

#Total Asserts in org.jaxen.test/CountTest=============4
#Total Tests in org.jaxen.test/CountTest=============0
