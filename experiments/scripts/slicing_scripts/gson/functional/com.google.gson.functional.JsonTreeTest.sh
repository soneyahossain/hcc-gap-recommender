#!/bin/bash

echo "computing slice for JsonTreeTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/JsonTreeTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonTreeTest.trace com.google.gson.functional.JsonTreeTest.testToJsonTree:32:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonTreeTest/JsonTreeTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonTreeTest.trace com.google.gson.functional.JsonTreeTest.testToJsonTree:35:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonTreeTest/JsonTreeTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonTreeTest.trace com.google.gson.functional.JsonTreeTest.testToJsonTreeObjectType:45:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonTreeTest/JsonTreeTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonTreeTest.trace com.google.gson.functional.JsonTreeTest.testToJsonTreeObjectType:48:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonTreeTest/JsonTreeTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonTreeTest.trace com.google.gson.functional.JsonTreeTest.testJsonTreeToString:60:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonTreeTest/JsonTreeTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonTreeTest.trace com.google.gson.functional.JsonTreeTest.testJsonTreeNull:66:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonTreeTest/JsonTreeTest6.txt

#Total Asserts in com.google.gson.functional/JsonTreeTest=============6
#Total Tests in com.google.gson.functional/JsonTreeTest=============0
