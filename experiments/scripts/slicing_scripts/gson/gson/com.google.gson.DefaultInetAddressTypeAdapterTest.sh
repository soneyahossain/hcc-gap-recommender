#!/bin/bash

echo "computing slice for DefaultInetAddressTypeAdapterTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultInetAddressTypeAdapterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultInetAddressTypeAdapterTest.trace com.google.gson.DefaultInetAddressTypeAdapterTest.testInetAddressSerializationAndDeserialization:40:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultInetAddressTypeAdapterTest/DefaultInetAddressTypeAdapterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/DefaultInetAddressTypeAdapterTest.trace com.google.gson.DefaultInetAddressTypeAdapterTest.testInetAddressSerializationAndDeserialization:43:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/DefaultInetAddressTypeAdapterTest/DefaultInetAddressTypeAdapterTest2.txt

#Total Asserts in com.google.gson/DefaultInetAddressTypeAdapterTest=============2
#Total Tests in com.google.gson/DefaultInetAddressTypeAdapterTest=============0
