#!/bin/bash

echo "computing slice for UncategorizedTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testObjectEqualButNotSameSerialization:67:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testStaticFieldsAreNotSerialized:72:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testGsonInstanceReusableForSerializationAndDeserialization:79:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testReturningDerivedClassesDuringDeserialization:91:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testReturningDerivedClassesDuringDeserialization:92:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testReturningDerivedClassesDuringDeserialization:96:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testReturningDerivedClassesDuringDeserialization:97:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/UncategorizedTest.trace com.google.gson.functional.UncategorizedTest.testTrailingWhitespace:107:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/UncategorizedTest/UncategorizedTest8.txt

#Total Asserts in com.google.gson.functional/UncategorizedTest=============8
#Total Tests in com.google.gson.functional/UncategorizedTest=============0
