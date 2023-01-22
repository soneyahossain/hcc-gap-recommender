#!/bin/bash

echo "computing slice for RuntimeTypeAdapterFactoryFunctionalTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/RuntimeTypeAdapterFactoryFunctionalTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RuntimeTypeAdapterFactoryFunctionalTest.trace com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.testSubclassesAutomaticallySerialized:52:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RuntimeTypeAdapterFactoryFunctionalTest/RuntimeTypeAdapterFactoryFunctionalTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RuntimeTypeAdapterFactoryFunctionalTest.trace com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.testSubclassesAutomaticallySerialized:57:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RuntimeTypeAdapterFactoryFunctionalTest/RuntimeTypeAdapterFactoryFunctionalTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/RuntimeTypeAdapterFactoryFunctionalTest.trace com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.testSubclassesAutomaticallySerialized:58:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/RuntimeTypeAdapterFactoryFunctionalTest/RuntimeTypeAdapterFactoryFunctionalTest3.txt

#Total Asserts in com.google.gson.functional/RuntimeTypeAdapterFactoryFunctionalTest=============3
#Total Tests in com.google.gson.functional/RuntimeTypeAdapterFactoryFunctionalTest=============0
