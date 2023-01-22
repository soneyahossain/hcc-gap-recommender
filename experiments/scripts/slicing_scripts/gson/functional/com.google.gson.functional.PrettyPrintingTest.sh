#!/bin/bash

echo "computing slice for PrettyPrintingTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/PrettyPrintingTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrettyPrintingTest.trace com.google.gson.functional.PrettyPrintingTest.testPrettyPrintArrayOfPrimitives:71:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrettyPrintingTest/PrettyPrintingTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrettyPrintingTest.trace com.google.gson.functional.PrettyPrintingTest.testPrettyPrintArrayOfPrimitiveArrays:78:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrettyPrintingTest/PrettyPrintingTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrettyPrintingTest.trace com.google.gson.functional.PrettyPrintingTest.testPrettyPrintListOfPrimitiveArrays:86:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrettyPrintingTest/PrettyPrintingTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrettyPrintingTest.trace com.google.gson.functional.PrettyPrintingTest.testMap:95:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrettyPrintingTest/PrettyPrintingTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrettyPrintingTest.trace com.google.gson.functional.PrettyPrintingTest.testEmptyMapField:103:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrettyPrintingTest/PrettyPrintingTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrettyPrintingTest.trace com.google.gson.functional.PrettyPrintingTest.testMultipleArrays:115:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrettyPrintingTest/PrettyPrintingTest6.txt

#Total Asserts in com.google.gson.functional/PrettyPrintingTest=============6
#Total Tests in com.google.gson.functional/PrettyPrintingTest=============0
