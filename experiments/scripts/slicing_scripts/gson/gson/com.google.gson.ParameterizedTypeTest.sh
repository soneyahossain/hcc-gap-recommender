#!/bin/bash

echo "computing slice for ParameterizedTypeTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ParameterizedTypeTest.trace com.google.gson.ParameterizedTypeTest.testOurTypeFunctionality:45:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest/ParameterizedTypeTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ParameterizedTypeTest.trace com.google.gson.ParameterizedTypeTest.testOurTypeFunctionality:46:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest/ParameterizedTypeTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ParameterizedTypeTest.trace com.google.gson.ParameterizedTypeTest.testOurTypeFunctionality:47:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest/ParameterizedTypeTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ParameterizedTypeTest.trace com.google.gson.ParameterizedTypeTest.testOurTypeFunctionality:48:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest/ParameterizedTypeTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ParameterizedTypeTest.trace com.google.gson.ParameterizedTypeTest.testOurTypeFunctionality:49:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest/ParameterizedTypeTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ParameterizedTypeTest.trace com.google.gson.ParameterizedTypeTest.testNotEquals:54:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest/ParameterizedTypeTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/ParameterizedTypeTest.trace com.google.gson.ParameterizedTypeTest.testNotEquals:55:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/ParameterizedTypeTest/ParameterizedTypeTest7.txt

#Total Asserts in com.google.gson/ParameterizedTypeTest=============7
#Total Tests in com.google.gson/ParameterizedTypeTest=============0
