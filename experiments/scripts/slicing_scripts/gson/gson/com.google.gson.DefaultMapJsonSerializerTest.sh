#!/bin/bash

echo "computing slice for DefaultMapJsonSerializerTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultMapJsonSerializerTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultMapJsonSerializerTest.trace com.google.gson.DefaultMapJsonSerializerTest.testEmptyMapNoTypeSerialization:37:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultMapJsonSerializerTest/DefaultMapJsonSerializerTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultMapJsonSerializerTest.trace com.google.gson.DefaultMapJsonSerializerTest.testEmptyMapNoTypeSerialization:39:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultMapJsonSerializerTest/DefaultMapJsonSerializerTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultMapJsonSerializerTest.trace com.google.gson.DefaultMapJsonSerializerTest.testEmptyMapSerialization:47:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultMapJsonSerializerTest/DefaultMapJsonSerializerTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultMapJsonSerializerTest.trace com.google.gson.DefaultMapJsonSerializerTest.testEmptyMapSerialization:49:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultMapJsonSerializerTest/DefaultMapJsonSerializerTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultMapJsonSerializerTest.trace com.google.gson.DefaultMapJsonSerializerTest.testNonEmptyMapSerialization:60:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultMapJsonSerializerTest/DefaultMapJsonSerializerTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultMapJsonSerializerTest.trace com.google.gson.DefaultMapJsonSerializerTest.testNonEmptyMapSerialization:62:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultMapJsonSerializerTest/DefaultMapJsonSerializerTest6.txt

#Total Asserts in com.google.gson/DefaultMapJsonSerializerTest=============6
#Total Tests in com.google.gson/DefaultMapJsonSerializerTest=============0
