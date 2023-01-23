#!/bin/bash

echo "computing slice for JsonAdapterNullSafeTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/regression_slices/JsonAdapterNullSafeTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/regression_traces/JsonAdapterNullSafeTest.trace com.google.gson.regression.JsonAdapterNullSafeTest.testNullSafeBugDeserialize:36:*>$HCC_EXPERIMENTS/slices/gson/regression_slices/JsonAdapterNullSafeTest/JsonAdapterNullSafeTest1.txt

#Total Asserts in com.google.gson.regression/JsonAdapterNullSafeTest=============1
#Total Tests in com.google.gson.regression/JsonAdapterNullSafeTest=============0
