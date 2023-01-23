#!/bin/bash

echo "computing slice for JsonParserTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testDeserializingCustomTree:65:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testDeserializingCustomTree:66:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testChangingCustomTreeAndDeserializing:119:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testChangingCustomTreeAndDeserializing:120:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testChangingCustomTreeAndDeserializing:121:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testExtraCommasInArrays:126:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testExtraCommasInArrays:127:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonParserTest.trace com.google.gson.functional.JsonParserTest.testExtraCommasInArrays:128:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonParserTest/JsonParserTest8.txt

#Total Asserts in com.google.gson.functional/JsonParserTest=============8
#Total Tests in com.google.gson.functional/JsonParserTest=============0
