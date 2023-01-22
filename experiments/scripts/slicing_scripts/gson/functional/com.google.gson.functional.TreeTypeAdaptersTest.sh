#!/bin/bash

echo "computing slice for TreeTypeAdaptersTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/TreeTypeAdaptersTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TreeTypeAdaptersTest.trace com.google.gson.functional.TreeTypeAdaptersTest.testSerializeId:65:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TreeTypeAdaptersTest/TreeTypeAdaptersTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TreeTypeAdaptersTest.trace com.google.gson.functional.TreeTypeAdaptersTest.testSerializeId:66:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TreeTypeAdaptersTest/TreeTypeAdaptersTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TreeTypeAdaptersTest.trace com.google.gson.functional.TreeTypeAdaptersTest.testSerializeId:67:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TreeTypeAdaptersTest/TreeTypeAdaptersTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TreeTypeAdaptersTest.trace com.google.gson.functional.TreeTypeAdaptersTest.testDeserializeId:74:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TreeTypeAdaptersTest/TreeTypeAdaptersTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TreeTypeAdaptersTest.trace com.google.gson.functional.TreeTypeAdaptersTest.testDeserializeId:75:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TreeTypeAdaptersTest/TreeTypeAdaptersTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/TreeTypeAdaptersTest.trace com.google.gson.functional.TreeTypeAdaptersTest.testDeserializeId:76:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/TreeTypeAdaptersTest/TreeTypeAdaptersTest6.txt

#Total Asserts in com.google.gson.functional/TreeTypeAdaptersTest=============6
#Total Tests in com.google.gson.functional/TreeTypeAdaptersTest=============0
