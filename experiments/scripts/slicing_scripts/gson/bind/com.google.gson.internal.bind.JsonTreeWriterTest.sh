#!/bin/bash

echo "computing slice for JsonTreeWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testArray:32:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testNestedArray:45:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testObject:54:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testNestedObject:70:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testSerializeNullsFalse:105:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testSerializeNullsTrue:115:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testEmptyWriter:120:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/bind_traces/JsonTreeWriterTest.trace com.google.gson.internal.bind.JsonTreeWriterTest.testLenientNansAndInfinities:131:*>$HCC_EXPERIMENTS/slices/gson/bind_slices/JsonTreeWriterTest/JsonTreeWriterTest8.txt

#Total Asserts in com.google.gson.internal.bind/JsonTreeWriterTest=============8
#Total Tests in com.google.gson.internal.bind/JsonTreeWriterTest=============0
