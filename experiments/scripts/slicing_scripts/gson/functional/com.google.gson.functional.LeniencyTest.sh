#!/bin/bash

echo "computing slice for LeniencyTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/LeniencyTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/LeniencyTest.trace com.google.gson.functional.LeniencyTest.testLenientFromJson:44:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/LeniencyTest/LeniencyTest1.txt

#Total Asserts in com.google.gson.functional/LeniencyTest=============1
#Total Tests in com.google.gson.functional/LeniencyTest=============0
