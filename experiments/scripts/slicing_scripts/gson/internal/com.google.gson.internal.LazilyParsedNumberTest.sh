#!/bin/bash

echo "computing slice for LazilyParsedNumberTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/internal_slices/LazilyParsedNumberTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/LazilyParsedNumberTest.trace com.google.gson.internal.LazilyParsedNumberTest.testHashCode:24:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/LazilyParsedNumberTest/LazilyParsedNumberTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/internal_traces/LazilyParsedNumberTest.trace com.google.gson.internal.LazilyParsedNumberTest.testEquals:30:*>$HCC_EXPERIMENTS/slices/gson/internal_slices/LazilyParsedNumberTest/LazilyParsedNumberTest2.txt

#Total Asserts in com.google.gson.internal/LazilyParsedNumberTest=============2
#Total Tests in com.google.gson.internal/LazilyParsedNumberTest=============0
