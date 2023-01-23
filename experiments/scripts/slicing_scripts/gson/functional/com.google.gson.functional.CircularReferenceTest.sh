#!/bin/bash

echo "computing slice for CircularReferenceTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/CircularReferenceTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CircularReferenceTest.trace com.google.gson.functional.CircularReferenceTest.testSelfReferenceIgnoredInSerialization:64:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CircularReferenceTest/CircularReferenceTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CircularReferenceTest.trace com.google.gson.functional.CircularReferenceTest.testDirectedAcyclicGraphSerialization:104:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CircularReferenceTest/CircularReferenceTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CircularReferenceTest.trace com.google.gson.functional.CircularReferenceTest.testDirectedAcyclicGraphDeserialization:110:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CircularReferenceTest/CircularReferenceTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/CircularReferenceTest.trace com.google.gson.functional.CircularReferenceTest.testDirectedAcyclicGraphDeserialization:111:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/CircularReferenceTest/CircularReferenceTest4.txt

#Total Asserts in com.google.gson.functional/CircularReferenceTest=============4
#Total Tests in com.google.gson.functional/CircularReferenceTest=============0
