#!/bin/bash

echo "computing slice for JavaUnicodeEscaperTest"

mkdir -p slices/translate_slices/JavaUnicodeEscaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/JavaUnicodeEscaperTest.trace org.apache.commons.text.translate.JavaUnicodeEscaperTest.testBelow:36:*>slices/translate_slices/JavaUnicodeEscaperTest/JavaUnicodeEscaperTestJavaUnicodeEscaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/JavaUnicodeEscaperTest.trace org.apache.commons.text.translate.JavaUnicodeEscaperTest.testBetween:46:*>slices/translate_slices/JavaUnicodeEscaperTest/JavaUnicodeEscaperTestJavaUnicodeEscaperTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/JavaUnicodeEscaperTest.trace org.apache.commons.text.translate.JavaUnicodeEscaperTest.testAbove:56:*>slices/translate_slices/JavaUnicodeEscaperTest/JavaUnicodeEscaperTestJavaUnicodeEscaperTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/JavaUnicodeEscaperTest.trace org.apache.commons.text.translate.JavaUnicodeEscaperTest.testToUtf16Escape:67:*>slices/translate_slices/JavaUnicodeEscaperTest/JavaUnicodeEscaperTestJavaUnicodeEscaperTest4.txt

#Total Asserts in org.apache.commons.text.translate/JavaUnicodeEscaperTest=============4
#Total Tests in org.apache.commons.text.translate/JavaUnicodeEscaperTest=============0
