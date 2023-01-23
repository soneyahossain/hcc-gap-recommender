#!/bin/bash

echo "computing slice for PrintFormattingTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/PrintFormattingTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrintFormattingTest.trace com.google.gson.functional.PrintFormattingTest.testJsonObjectWithNullValues:65:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrintFormattingTest/PrintFormattingTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrintFormattingTest.trace com.google.gson.functional.PrintFormattingTest.testJsonObjectWithNullValues:66:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrintFormattingTest/PrintFormattingTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrintFormattingTest.trace com.google.gson.functional.PrintFormattingTest.testJsonObjectWithNullValuesSerialized:75:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrintFormattingTest/PrintFormattingTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrintFormattingTest.trace com.google.gson.functional.PrintFormattingTest.testJsonObjectWithNullValuesSerialized:76:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrintFormattingTest/PrintFormattingTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/PrintFormattingTest.trace com.google.gson.functional.PrintFormattingTest.assertContainsNoWhiteSpace:81:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/PrintFormattingTest/PrintFormattingTest5.txt

#Total Asserts in com.google.gson.functional/PrintFormattingTest=============5
#Total Tests in com.google.gson.functional/PrintFormattingTest=============0
