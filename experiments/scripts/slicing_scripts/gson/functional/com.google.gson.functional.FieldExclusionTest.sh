#!/bin/bash

echo "computing slice for FieldExclusionTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/FieldExclusionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldExclusionTest.trace com.google.gson.functional.FieldExclusionTest.testDefaultInnerClassExclusion:46:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldExclusionTest/FieldExclusionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldExclusionTest.trace com.google.gson.functional.FieldExclusionTest.testDefaultInnerClassExclusion:51:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldExclusionTest/FieldExclusionTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldExclusionTest.trace com.google.gson.functional.FieldExclusionTest.testInnerClassExclusion:58:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldExclusionTest/FieldExclusionTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldExclusionTest.trace com.google.gson.functional.FieldExclusionTest.testDefaultNestedStaticClassIncluded:65:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldExclusionTest/FieldExclusionTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldExclusionTest.trace com.google.gson.functional.FieldExclusionTest.testDefaultNestedStaticClassIncluded:70:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldExclusionTest/FieldExclusionTest5.txt

#Total Asserts in com.google.gson.functional/FieldExclusionTest=============5
#Total Tests in com.google.gson.functional/FieldExclusionTest=============0
