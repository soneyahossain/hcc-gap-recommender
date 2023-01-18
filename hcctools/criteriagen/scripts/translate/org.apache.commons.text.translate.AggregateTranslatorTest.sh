#!/bin/bash

echo "computing slice for AggregateTranslatorTest"

mkdir -p slices/translate_slices/AggregateTranslatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/AggregateTranslatorTest.trace org.apache.commons.text.translate.AggregateTranslatorTest.testNullConstructor:37:*>slices/translate_slices/AggregateTranslatorTest/AggregateTranslatorTestAggregateTranslatorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/AggregateTranslatorTest.trace org.apache.commons.text.translate.AggregateTranslatorTest.testNullVarargConstructor:44:*>slices/translate_slices/AggregateTranslatorTest/AggregateTranslatorTestAggregateTranslatorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/AggregateTranslatorTest.trace org.apache.commons.text.translate.AggregateTranslatorTest.testNonNull:58:*>slices/translate_slices/AggregateTranslatorTest/AggregateTranslatorTestAggregateTranslatorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/AggregateTranslatorTest.trace org.apache.commons.text.translate.AggregateTranslatorTest.testNonNull:59:*>slices/translate_slices/AggregateTranslatorTest/AggregateTranslatorTestAggregateTranslatorTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/AggregateTranslatorTest.trace org.apache.commons.text.translate.AggregateTranslatorTest.testNonNull:62:*>slices/translate_slices/AggregateTranslatorTest/AggregateTranslatorTestAggregateTranslatorTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/AggregateTranslatorTest.trace org.apache.commons.text.translate.AggregateTranslatorTest.testNonNull:63:*>slices/translate_slices/AggregateTranslatorTest/AggregateTranslatorTestAggregateTranslatorTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/AggregateTranslatorTest.trace org.apache.commons.text.translate.AggregateTranslatorTest.testNonNull:64:*>slices/translate_slices/AggregateTranslatorTest/AggregateTranslatorTest7.txt

#Total Asserts in org.apache.commons.text.translate/AggregateTranslatorTest=============7
#Total Tests in org.apache.commons.text.translate/AggregateTranslatorTest=============0
