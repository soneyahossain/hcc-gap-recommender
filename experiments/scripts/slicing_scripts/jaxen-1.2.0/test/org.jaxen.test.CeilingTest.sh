#!/bin/bash

echo "computing slice for CeilingTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CeilingTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CeilingTest.trace org.jaxen.test.CeilingTest.testCeiling:92:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CeilingTest/CeilingTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CeilingTest.trace org.jaxen.test.CeilingTest.testNegativeCeiling:101:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CeilingTest/CeilingTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CeilingTest.trace org.jaxen.test.CeilingTest.testNaNCeilingIsNaN:108:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CeilingTest/CeilingTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CeilingTest.trace org.jaxen.test.CeilingTest.testCeilingFunctionRequiresAtLeastOneArgument:121:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CeilingTest/CeilingTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/CeilingTest.trace org.jaxen.test.CeilingTest.testCeilingFunctionRequiresAtMostOneArgument:136:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/CeilingTest/CeilingTest5.txt

#Total Asserts in org.jaxen.test/CeilingTest=============5
#Total Tests in org.jaxen.test/CeilingTest=============0
