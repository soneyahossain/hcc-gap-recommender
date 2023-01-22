#!/bin/bash

echo "computing slice for DefaultDateTypeAdapterTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultDateTypeAdapterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultDateTypeAdapterTest.trace com.google.gson.DefaultDateTypeAdapterTest.testDateSerialization:143:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultDateTypeAdapterTest/DefaultDateTypeAdapterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultDateTypeAdapterTest.trace com.google.gson.DefaultDateTypeAdapterTest.testDatePattern:153:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultDateTypeAdapterTest/DefaultDateTypeAdapterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultDateTypeAdapterTest.trace com.google.gson.DefaultDateTypeAdapterTest.assertFormatted:164:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultDateTypeAdapterTest/DefaultDateTypeAdapterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultDateTypeAdapterTest.trace com.google.gson.DefaultDateTypeAdapterTest.assertParsed:168:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultDateTypeAdapterTest/DefaultDateTypeAdapterTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultDateTypeAdapterTest.trace com.google.gson.DefaultDateTypeAdapterTest.assertParsed:169:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultDateTypeAdapterTest/DefaultDateTypeAdapterTest5.txt

#Total Asserts in com.google.gson/DefaultDateTypeAdapterTest=============5
#Total Tests in com.google.gson/DefaultDateTypeAdapterTest=============0
