#!/bin/bash

echo "computing slice for CustomSerializerTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/CustomSerializerTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CustomSerializerTest.trace com.google.gson.functional.CustomSerializerTest.testBaseClassSerializerInvokedForBaseClassFields:53:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CustomSerializerTest/CustomSerializerTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CustomSerializerTest.trace com.google.gson.functional.CustomSerializerTest.testSubClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances:64:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CustomSerializerTest/CustomSerializerTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CustomSerializerTest.trace com.google.gson.functional.CustomSerializerTest.testSubClassSerializerInvokedForBaseClassFieldsHoldingArrayOfSubClassInstances:77:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CustomSerializerTest/CustomSerializerTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CustomSerializerTest.trace com.google.gson.functional.CustomSerializerTest.testBaseClassSerializerInvokedForBaseClassFieldsHoldingSubClassInstances:88:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CustomSerializerTest/CustomSerializerTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CustomSerializerTest.trace com.google.gson.functional.CustomSerializerTest.testSerializerReturnsNull:100:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CustomSerializerTest/CustomSerializerTest5.txt

#Total Asserts in com.google.gson.functional/CustomSerializerTest=============5
#Total Tests in com.google.gson.functional/CustomSerializerTest=============0
