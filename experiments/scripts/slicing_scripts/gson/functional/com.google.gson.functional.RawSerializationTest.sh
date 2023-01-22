#!/bin/bash

echo "computing slice for RawSerializationTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testCollectionOfPrimitives:44:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testCollectionOfObjects:50:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testParameterizedObject:58:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testParameterizedObject:61:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testTwoLevelParameterizedObject:69:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testTwoLevelParameterizedObject:72:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testThreeLevelParameterizedObject:80:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RawSerializationTest.trace com.google.gson.functional.RawSerializationTest.testThreeLevelParameterizedObject:83:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RawSerializationTest/RawSerializationTest8.txt

#Total Asserts in com.google.gson.functional/RawSerializationTest=============8
#Total Tests in com.google.gson.functional/RawSerializationTest=============0
