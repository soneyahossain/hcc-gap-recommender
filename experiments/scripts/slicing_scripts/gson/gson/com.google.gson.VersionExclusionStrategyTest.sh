#!/bin/bash

echo "computing slice for VersionExclusionStrategyTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/VersionExclusionStrategyTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/VersionExclusionStrategyTest.trace com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreAtSameVersion:33:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/VersionExclusionStrategyTest/VersionExclusionStrategyTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/VersionExclusionStrategyTest.trace com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreAtSameVersion:34:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/VersionExclusionStrategyTest/VersionExclusionStrategyTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/VersionExclusionStrategyTest.trace com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreBehindInVersion:39:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/VersionExclusionStrategyTest/VersionExclusionStrategyTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/VersionExclusionStrategyTest.trace com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreBehindInVersion:40:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/VersionExclusionStrategyTest/VersionExclusionStrategyTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/VersionExclusionStrategyTest.trace com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreAheadInVersion:45:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/VersionExclusionStrategyTest/VersionExclusionStrategyTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/VersionExclusionStrategyTest.trace com.google.gson.VersionExclusionStrategyTest.testClassAndFieldAreAheadInVersion:46:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/VersionExclusionStrategyTest/VersionExclusionStrategyTest6.txt

#Total Asserts in com.google.gson/VersionExclusionStrategyTest=============6
#Total Tests in com.google.gson/VersionExclusionStrategyTest=============0
