#!/bin/bash

echo "computing slice for GenericArrayTypeTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/GenericArrayTypeTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GenericArrayTypeTest.trace com.google.gson.GenericArrayTypeTest.testOurTypeFunctionality:47:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GenericArrayTypeTest/GenericArrayTypeTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GenericArrayTypeTest.trace com.google.gson.GenericArrayTypeTest.testOurTypeFunctionality:48:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GenericArrayTypeTest/GenericArrayTypeTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GenericArrayTypeTest.trace com.google.gson.GenericArrayTypeTest.testOurTypeFunctionality:49:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GenericArrayTypeTest/GenericArrayTypeTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GenericArrayTypeTest.trace com.google.gson.GenericArrayTypeTest.testNotEquals:54:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GenericArrayTypeTest/GenericArrayTypeTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/GenericArrayTypeTest.trace com.google.gson.GenericArrayTypeTest.testNotEquals:55:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/GenericArrayTypeTest/GenericArrayTypeTest5.txt

#Total Asserts in com.google.gson/GenericArrayTypeTest=============5
#Total Tests in com.google.gson/GenericArrayTypeTest=============0
