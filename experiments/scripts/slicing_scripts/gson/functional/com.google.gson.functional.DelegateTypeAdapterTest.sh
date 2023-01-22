#!/bin/bash

echo "computing slice for DelegateTypeAdapterTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/DelegateTypeAdapterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/DelegateTypeAdapterTest.trace com.google.gson.functional.DelegateTypeAdapterTest.testDelegateInvoked:60:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/DelegateTypeAdapterTest/DelegateTypeAdapterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/DelegateTypeAdapterTest.trace com.google.gson.functional.DelegateTypeAdapterTest.testDelegateInvoked:61:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/DelegateTypeAdapterTest/DelegateTypeAdapterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/DelegateTypeAdapterTest.trace com.google.gson.functional.DelegateTypeAdapterTest.testDelegateInvokedOnStrings:69:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/DelegateTypeAdapterTest/DelegateTypeAdapterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/DelegateTypeAdapterTest.trace com.google.gson.functional.DelegateTypeAdapterTest.testDelegateInvokedOnStrings:70:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/DelegateTypeAdapterTest/DelegateTypeAdapterTest4.txt

#Total Asserts in com.google.gson.functional/DelegateTypeAdapterTest=============4
#Total Tests in com.google.gson.functional/DelegateTypeAdapterTest=============0
