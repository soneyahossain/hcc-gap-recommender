#!/bin/bash

echo "computing slice for GsonTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTest.trace com.google.gson.GsonTest.testOverridesDefaultExcluder:49:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTest/GsonTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTest.trace com.google.gson.GsonTest.testOverridesDefaultExcluder:50:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTest/GsonTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTest.trace com.google.gson.GsonTest.testOverridesDefaultExcluder:51:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTest/GsonTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonTest.trace com.google.gson.GsonTest.testOverridesDefaultExcluder:52:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonTest/GsonTest4.txt

#Total Asserts in com.google.gson/GsonTest=============4
#Total Tests in com.google.gson/GsonTest=============0
