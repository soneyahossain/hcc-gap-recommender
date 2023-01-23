#!/bin/bash

echo "computing slice for SecurityTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/SecurityTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SecurityTest.trace com.google.gson.functional.SecurityTest.testNonExecutableJsonSerialization:47:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SecurityTest/SecurityTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SecurityTest.trace com.google.gson.functional.SecurityTest.testNonExecutableJsonDeserialization:54:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SecurityTest/SecurityTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SecurityTest.trace com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenSerialization:60:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SecurityTest/SecurityTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SecurityTest.trace com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithRegularGsonDeserialization:71:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SecurityTest/SecurityTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SecurityTest.trace com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization:83:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SecurityTest/SecurityTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/SecurityTest.trace com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization:84:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/SecurityTest/SecurityTest6.txt

#Total Asserts in com.google.gson.functional/SecurityTest=============6
#Total Tests in com.google.gson.functional/SecurityTest=============0
