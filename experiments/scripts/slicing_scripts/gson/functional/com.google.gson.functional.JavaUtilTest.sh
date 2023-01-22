#!/bin/bash

echo "computing slice for JavaUtilTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testCurrency:40:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testCurrency:42:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testCurrency:46:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testCurrency:47:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testProperties:56:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testProperties:57:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testProperties:59:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JavaUtilTest.trace com.google.gson.functional.JavaUtilTest.testProperties:60:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JavaUtilTest/JavaUtilTest8.txt

#Total Asserts in com.google.gson.functional/JavaUtilTest=============8
#Total Tests in com.google.gson.functional/JavaUtilTest=============0
