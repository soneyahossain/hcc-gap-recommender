#!/bin/bash

echo "computing slice for PrimitiveCharacterTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/PrimitiveCharacterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrimitiveCharacterTest.trace com.google.gson.functional.PrimitiveCharacterTest.testPrimitiveCharacterAutoboxedSerialization:39:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrimitiveCharacterTest/PrimitiveCharacterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrimitiveCharacterTest.trace com.google.gson.functional.PrimitiveCharacterTest.testPrimitiveCharacterAutoboxedSerialization:40:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrimitiveCharacterTest/PrimitiveCharacterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrimitiveCharacterTest.trace com.google.gson.functional.PrimitiveCharacterTest.testPrimitiveCharacterAutoboxedSerialization:41:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrimitiveCharacterTest/PrimitiveCharacterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrimitiveCharacterTest.trace com.google.gson.functional.PrimitiveCharacterTest.testPrimitiveCharacterAutoboxedDeserialization:47:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrimitiveCharacterTest/PrimitiveCharacterTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrimitiveCharacterTest.trace com.google.gson.functional.PrimitiveCharacterTest.testPrimitiveCharacterAutoboxedDeserialization:50:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrimitiveCharacterTest/PrimitiveCharacterTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrimitiveCharacterTest.trace com.google.gson.functional.PrimitiveCharacterTest.testPrimitiveCharacterAutoboxedDeserialization:53:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrimitiveCharacterTest/PrimitiveCharacterTest6.txt

#Total Asserts in com.google.gson.functional/PrimitiveCharacterTest=============6
#Total Tests in com.google.gson.functional/PrimitiveCharacterTest=============0
