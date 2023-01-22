#!/bin/bash

echo "computing slice for InterfaceTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/InterfaceTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/InterfaceTest.trace com.google.gson.functional.InterfaceTest.testSerializingObjectImplementingInterface:43:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/InterfaceTest/InterfaceTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/InterfaceTest.trace com.google.gson.functional.InterfaceTest.testSerializingInterfaceObjectField:48:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/InterfaceTest/InterfaceTest2.txt

#Total Asserts in com.google.gson.functional/InterfaceTest=============2
#Total Tests in com.google.gson.functional/InterfaceTest=============0
