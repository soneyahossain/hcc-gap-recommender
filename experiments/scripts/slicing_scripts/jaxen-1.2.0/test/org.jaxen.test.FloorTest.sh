#!/bin/bash

echo "computing slice for FloorTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testFloor:92:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testNegativeFloor:101:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testNaNFloorIsNaN:108:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testInfFloorIsInf:114:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testInfFloorIsInf:115:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testNegativeInfFloorIsNegativeInf:121:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testNegativeInfFloorIsNegativeInf:122:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testFloorFunctionRequiresAtLeastArgument:135:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/FloorTest.trace org.jaxen.test.FloorTest.testBooleanFunctionRequiresExactlyOneArgument:150:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/FloorTest/FloorTest9.txt

#Total Asserts in org.jaxen.test/FloorTest=============9
#Total Tests in org.jaxen.test/FloorTest=============0
