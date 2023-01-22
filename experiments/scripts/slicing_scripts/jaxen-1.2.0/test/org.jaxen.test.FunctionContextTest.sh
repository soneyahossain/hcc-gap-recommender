#!/bin/bash

echo "computing slice for FunctionContextTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionContextTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionContextTest.trace org.jaxen.test.FunctionContextTest.testJAXEN50:105:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionContextTest/FunctionContextTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionContextTest.trace org.jaxen.test.FunctionContextTest.testUnresolvableFunction:118:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionContextTest/FunctionContextTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionContextTest.trace org.jaxen.test.FunctionContextTest.testUnresolvableFunctionExceptionMessage:132:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionContextTest/FunctionContextTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionContextTest.trace org.jaxen.test.FunctionContextTest.testGetFunctionContext:139:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionContextTest/FunctionContextTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/FunctionContextTest.trace org.jaxen.test.FunctionContextTest.testSerializeFunctionContext:153:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/FunctionContextTest/FunctionContextTest5.txt

#Total Asserts in org.jaxen.test/FunctionContextTest=============5
#Total Tests in org.jaxen.test/FunctionContextTest=============0
