#!/bin/bash

echo "computing slice for SerializedNameTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/SerializedNameTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SerializedNameTest.trace com.google.gson.functional.SerializedNameTest.testFirstNameIsChosenForSerialization:29:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SerializedNameTest/SerializedNameTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SerializedNameTest.trace com.google.gson.functional.SerializedNameTest.testMultipleNamesDeserializedCorrectly:33:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SerializedNameTest/SerializedNameTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SerializedNameTest.trace com.google.gson.functional.SerializedNameTest.testMultipleNamesDeserializedCorrectly:36:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SerializedNameTest/SerializedNameTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SerializedNameTest.trace com.google.gson.functional.SerializedNameTest.testMultipleNamesDeserializedCorrectly:37:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SerializedNameTest/SerializedNameTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SerializedNameTest.trace com.google.gson.functional.SerializedNameTest.testMultipleNamesDeserializedCorrectly:38:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SerializedNameTest/SerializedNameTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SerializedNameTest.trace com.google.gson.functional.SerializedNameTest.testMultipleNamesInTheSameString:43:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SerializedNameTest/SerializedNameTest6.txt

#Total Asserts in com.google.gson.functional/SerializedNameTest=============6
#Total Tests in com.google.gson.functional/SerializedNameTest=============0
