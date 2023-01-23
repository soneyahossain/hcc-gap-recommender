#!/bin/bash

echo "computing slice for InnerClassExclusionStrategyTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/InnerClassExclusionStrategyTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/InnerClassExclusionStrategyTest.trace com.google.gson.InnerClassExclusionStrategyTest.testExcludeInnerClassObject:35:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/InnerClassExclusionStrategyTest/InnerClassExclusionStrategyTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/InnerClassExclusionStrategyTest.trace com.google.gson.InnerClassExclusionStrategyTest.testExcludeInnerClassField:40:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/InnerClassExclusionStrategyTest/InnerClassExclusionStrategyTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/InnerClassExclusionStrategyTest.trace com.google.gson.InnerClassExclusionStrategyTest.testIncludeStaticNestedClassObject:45:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/InnerClassExclusionStrategyTest/InnerClassExclusionStrategyTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/InnerClassExclusionStrategyTest.trace com.google.gson.InnerClassExclusionStrategyTest.testIncludeStaticNestedClassField:50:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/InnerClassExclusionStrategyTest/InnerClassExclusionStrategyTest4.txt

#Total Asserts in com.google.gson/InnerClassExclusionStrategyTest=============4
#Total Tests in com.google.gson/InnerClassExclusionStrategyTest=============0
