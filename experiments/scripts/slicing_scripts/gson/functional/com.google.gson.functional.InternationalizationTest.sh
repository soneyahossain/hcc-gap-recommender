#!/bin/bash

echo "computing slice for InternationalizationTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/InternationalizationTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/InternationalizationTest.trace com.google.gson.functional.InternationalizationTest.testStringsWithRawChineseCharactersDeserialization:50:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/InternationalizationTest/InternationalizationTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/InternationalizationTest.trace com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersSerialization:57:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/InternationalizationTest/InternationalizationTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/InternationalizationTest.trace com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersDeserialization:64:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/InternationalizationTest/InternationalizationTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/InternationalizationTest.trace com.google.gson.functional.InternationalizationTest.testStringsWithUnicodeChineseCharactersEscapedDeserialization:69:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/InternationalizationTest/InternationalizationTest4.txt

#Total Asserts in com.google.gson.functional/InternationalizationTest=============4
#Total Tests in com.google.gson.functional/InternationalizationTest=============0
