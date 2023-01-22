#!/bin/bash

echo "computing slice for JavaSerializationTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/JavaSerializationTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JavaSerializationTest.trace com.google.gson.JavaSerializationTest.testMapIsSerializable:44:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JavaSerializationTest/JavaSerializationTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JavaSerializationTest.trace com.google.gson.JavaSerializationTest.testMapIsSerializable:46:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JavaSerializationTest/JavaSerializationTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JavaSerializationTest.trace com.google.gson.JavaSerializationTest.testListIsSerializable:53:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JavaSerializationTest/JavaSerializationTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JavaSerializationTest.trace com.google.gson.JavaSerializationTest.testNumberIsSerializable:60:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JavaSerializationTest/JavaSerializationTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JavaSerializationTest.trace com.google.gson.JavaSerializationTest.testNumberIsSerializable:61:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JavaSerializationTest/JavaSerializationTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JavaSerializationTest.trace com.google.gson.JavaSerializationTest.testNumberIsSerializable:62:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JavaSerializationTest/JavaSerializationTest6.txt

#Total Asserts in com.google.gson/JavaSerializationTest=============6
#Total Tests in com.google.gson/JavaSerializationTest=============0
