#!/bin/bash

echo "computing slice for SimpleVariableContextTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testRoundTripSerialization:101:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testRoundTripSerialization:102:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testRoundTripSerialization:103:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testRoundTripSerialization:104:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testSerializationFormatHasNotChanged:118:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testSerializationFormatHasNotChanged:119:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testSerializationFormatHasNotChanged:120:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleVariableContextTest.trace org.jaxen.test.SimpleVariableContextTest.testSerializationFormatHasNotChanged:121:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleVariableContextTest/SimpleVariableContextTest8.txt

#Total Asserts in org.jaxen.test/SimpleVariableContextTest=============8
#Total Tests in org.jaxen.test/SimpleVariableContextTest=============0
