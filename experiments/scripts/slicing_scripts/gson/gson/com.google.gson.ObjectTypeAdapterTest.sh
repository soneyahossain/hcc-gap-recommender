#!/bin/bash

echo "computing slice for ObjectTypeAdapterTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testDeserialize:31:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testDeserialize:32:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testDeserialize:33:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testDeserialize:34:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testSerialize:39:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testSerializeNullValue:45:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testDeserializeNullValue:51:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ObjectTypeAdapterTest.trace com.google.gson.ObjectTypeAdapterTest.testSerializeObject:55:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ObjectTypeAdapterTest/ObjectTypeAdapterTest8.txt

#Total Asserts in com.google.gson/ObjectTypeAdapterTest=============8
#Total Tests in com.google.gson/ObjectTypeAdapterTest=============0
