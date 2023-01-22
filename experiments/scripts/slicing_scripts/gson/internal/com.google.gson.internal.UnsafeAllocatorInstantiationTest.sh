#!/bin/bash

echo "computing slice for UnsafeAllocatorInstantiationTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/internal_slices/UnsafeAllocatorInstantiationTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/UnsafeAllocatorInstantiationTest.trace com.google.gson.internal.UnsafeAllocatorInstantiationTest.testInterfaceInstantiation:45:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/UnsafeAllocatorInstantiationTest/UnsafeAllocatorInstantiationTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/UnsafeAllocatorInstantiationTest.trace com.google.gson.internal.UnsafeAllocatorInstantiationTest.testAbstractClassInstantiation:59:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/UnsafeAllocatorInstantiationTest/UnsafeAllocatorInstantiationTest2.txt

#Total Asserts in com.google.gson.internal/UnsafeAllocatorInstantiationTest=============2
#Total Tests in com.google.gson.internal/UnsafeAllocatorInstantiationTest=============0
