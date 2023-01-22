#!/bin/bash

echo "computing slice for GsonBuilderTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/GsonBuilderTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonBuilderTest.trace com.google.gson.GsonBuilderTest.testExcludeFieldsWithModifiers:52:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonBuilderTest/GsonBuilderTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GsonBuilderTest.trace com.google.gson.GsonBuilderTest.testTransientFieldExclusion:81:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GsonBuilderTest/GsonBuilderTest2.txt

#Total Asserts in com.google.gson/GsonBuilderTest=============2
#Total Tests in com.google.gson/GsonBuilderTest=============0
