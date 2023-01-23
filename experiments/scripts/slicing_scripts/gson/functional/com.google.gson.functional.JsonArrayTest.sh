#!/bin/bash

echo "computing slice for JsonArrayTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testStringPrimitiveAddition:40:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testIntegerPrimitiveAddition:63:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testDoublePrimitiveAddition:85:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testBooleanPrimitiveAddition:98:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testCharPrimitiveAddition:112:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testMixedPrimitiveAddition:127:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testNullPrimitiveAddition:143:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonArrayTest.trace com.google.gson.functional.JsonArrayTest.testSameAddition:160:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonArrayTest/JsonArrayTest8.txt

#Total Asserts in com.google.gson.functional/JsonArrayTest=============8
#Total Tests in com.google.gson.functional/JsonArrayTest=============0
