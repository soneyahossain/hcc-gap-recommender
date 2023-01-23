#!/bin/bash

echo "computing slice for GsonTypesTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/internal_slices/GsonTypesTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/GsonTypesTest.trace com.google.gson.internal.GsonTypesTest.testNewParameterizedTypeWithoutOwner:30:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/GsonTypesTest/GsonTypesTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/GsonTypesTest.trace com.google.gson.internal.GsonTypesTest.testNewParameterizedTypeWithoutOwner:34:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/GsonTypesTest/GsonTypesTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/GsonTypesTest.trace com.google.gson.internal.GsonTypesTest.testNewParameterizedTypeWithoutOwner:46:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/GsonTypesTest/GsonTypesTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/GsonTypesTest.trace com.google.gson.internal.GsonTypesTest.testGetFirstTypeArgument:50:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/GsonTypesTest/GsonTypesTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/GsonTypesTest.trace com.google.gson.internal.GsonTypesTest.testGetFirstTypeArgument:53:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/GsonTypesTest/GsonTypesTest5.txt

#Total Asserts in com.google.gson.internal/GsonTypesTest=============5
#Total Tests in com.google.gson.internal/GsonTypesTest=============0
