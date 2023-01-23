#!/bin/bash

echo "computing slice for MoreSpecificTypeSerializationTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testSubclassFields:47:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testSubclassFields:48:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testListOfSubclassFields:57:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testListOfSubclassFields:58:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfSubclassFields:67:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfSubclassFields:69:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfSubclassFields:70:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testParameterizedSubclassFields:80:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testParameterizedSubclassFields:81:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testListOfParameterizedSubclassFields:95:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testListOfParameterizedSubclassFields:96:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfParameterizedSubclassFields:110:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfParameterizedSubclassFields:112:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest13.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/MoreSpecificTypeSerializationTest.trace com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfParameterizedSubclassFields:113:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/MoreSpecificTypeSerializationTest/MoreSpecificTypeSerializationTest14.txt

#Total Asserts in com.google.gson.functional/MoreSpecificTypeSerializationTest=============14
#Total Tests in com.google.gson.functional/MoreSpecificTypeSerializationTest=============0