#!/bin/bash

echo "computing slice for GsonTypeAdapterTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTypeAdapterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTypeAdapterTest.trace com.google.gson.GsonTypeAdapterTest.testTypeAdapterProperlyConvertsTypes:66:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTypeAdapterTest/GsonTypeAdapterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTypeAdapterTest.trace com.google.gson.GsonTypeAdapterTest.testTypeAdapterProperlyConvertsTypes:69:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTypeAdapterTest/GsonTypeAdapterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTypeAdapterTest.trace com.google.gson.GsonTypeAdapterTest.testTypeAdapterDoesNotAffectNonAdaptedTypes:75:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTypeAdapterTest/GsonTypeAdapterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTypeAdapterTest.trace com.google.gson.GsonTypeAdapterTest.testTypeAdapterDoesNotAffectNonAdaptedTypes:78:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTypeAdapterTest/GsonTypeAdapterTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTypeAdapterTest.trace com.google.gson.GsonTypeAdapterTest.deserialize:146:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTypeAdapterTest/GsonTypeAdapterTest5.txt

#Total Asserts in com.google.gson/GsonTypeAdapterTest=============5
#Total Tests in com.google.gson/GsonTypeAdapterTest=============0
