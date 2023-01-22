#!/bin/bash

echo "computing slice for TypeVariableTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/TypeVariableTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TypeVariableTest.trace com.google.gson.functional.TypeVariableTest.testAdvancedTypeVariables:50:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TypeVariableTest/TypeVariableTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TypeVariableTest.trace com.google.gson.functional.TypeVariableTest.testTypeVariablesViaTypeParameter:59:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TypeVariableTest/TypeVariableTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TypeVariableTest.trace com.google.gson.functional.TypeVariableTest.testTypeVariablesViaTypeParameter:61:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TypeVariableTest/TypeVariableTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TypeVariableTest.trace com.google.gson.functional.TypeVariableTest.testBasicTypeVariables:70:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TypeVariableTest/TypeVariableTest4.txt

#Total Asserts in com.google.gson.functional/TypeVariableTest=============4
#Total Tests in com.google.gson.functional/TypeVariableTest=============0
