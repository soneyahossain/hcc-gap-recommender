#!/bin/bash

echo "computing slice for UnicodeUnescaperTest"

mkdir -p slices/translate_slices/UnicodeUnescaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnescaperTest.trace org.apache.commons.text.translate.UnicodeUnescaperTest.testUPlus:36:*>slices/translate_slices/UnicodeUnescaperTest/UnicodeUnescaperTestUnicodeUnescaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnescaperTest.trace org.apache.commons.text.translate.UnicodeUnescaperTest.testUuuuu:45:*>slices/translate_slices/UnicodeUnescaperTest/UnicodeUnescaperTestUnicodeUnescaperTest2.txt

#Total Asserts in org.apache.commons.text.translate/UnicodeUnescaperTest=============2
#Total Tests in org.apache.commons.text.translate/UnicodeUnescaperTest=============0
