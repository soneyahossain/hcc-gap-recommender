#!/bin/bash

echo "computing slice for JsonNullTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/JsonNullTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JsonNullTest.trace com.google.gson.JsonNullTest.testEqualsAndHashcode:29:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JsonNullTest/JsonNullTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JsonNullTest.trace com.google.gson.JsonNullTest.testEqualsAndHashcode:30:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JsonNullTest/JsonNullTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JsonNullTest.trace com.google.gson.JsonNullTest.testEqualsAndHashcode:31:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JsonNullTest/JsonNullTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JsonNullTest.trace com.google.gson.JsonNullTest.testDeepCopy:37:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JsonNullTest/JsonNullTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/JsonNullTest.trace com.google.gson.JsonNullTest.testDeepCopy:38:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/JsonNullTest/JsonNullTest5.txt

#Total Asserts in com.google.gson/JsonNullTest=============5
#Total Tests in com.google.gson/JsonNullTest=============0
