#!/bin/bash

echo "computing slice for UnicodeEscaperTest"

mkdir -p slices/translate_slices/UnicodeEscaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeEscaperTest.trace org.apache.commons.text.translate.UnicodeEscaperTest.testBelow:35:*>slices/translate_slices/UnicodeEscaperTest/UnicodeEscaperTestUnicodeEscaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeEscaperTest.trace org.apache.commons.text.translate.UnicodeEscaperTest.testBetween:45:*>slices/translate_slices/UnicodeEscaperTest/UnicodeEscaperTestUnicodeEscaperTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeEscaperTest.trace org.apache.commons.text.translate.UnicodeEscaperTest.testAbove:55:*>slices/translate_slices/UnicodeEscaperTest/UnicodeEscaperTestUnicodeEscaperTest3.txt

#Total Asserts in org.apache.commons.text.translate/UnicodeEscaperTest=============3
#Total Tests in org.apache.commons.text.translate/UnicodeEscaperTest=============0
