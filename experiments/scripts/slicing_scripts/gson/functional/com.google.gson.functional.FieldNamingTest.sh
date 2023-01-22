#!/bin/bash

echo "computing slice for FieldNamingTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/FieldNamingTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldNamingTest.trace com.google.gson.functional.FieldNamingTest.testIdentity:34:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldNamingTest/FieldNamingTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldNamingTest.trace com.google.gson.functional.FieldNamingTest.testUpperCamelCase:42:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldNamingTest/FieldNamingTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldNamingTest.trace com.google.gson.functional.FieldNamingTest.testUpperCamelCaseWithSpaces:50:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldNamingTest/FieldNamingTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldNamingTest.trace com.google.gson.functional.FieldNamingTest.testLowerCaseWithUnderscores:58:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldNamingTest/FieldNamingTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/FieldNamingTest.trace com.google.gson.functional.FieldNamingTest.testLowerCaseWithDashes:66:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/FieldNamingTest/FieldNamingTest5.txt

#Total Asserts in com.google.gson.functional/FieldNamingTest=============5
#Total Tests in com.google.gson.functional/FieldNamingTest=============0
