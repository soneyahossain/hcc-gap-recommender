#!/bin/bash

echo "computing slice for NumberTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testNumberFunctionOperatesOnFirstNodeInDocumentOrder:108:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testNumberFunctionOperatesOnFirstNodeInDocumentOrder:109:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testNumberFunctionOperatesOnContextNode:122:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testBooleanConvertedToNumber:129:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testBooleanConvertedToNumber:130:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testBooleanConvertedToNumber:131:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testBooleanConvertedToNumber:132:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testNumberFunctionRequiresAtMostOneArgument:146:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testNumberFunctionAppliedToNonNumericString:158:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NumberTest.trace org.jaxen.test.NumberTest.testIsNan:163:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NumberTest/NumberTest10.txt

#Total Asserts in org.jaxen.test/NumberTest=============10
#Total Tests in org.jaxen.test/NumberTest=============0
