#!/bin/bash

echo "computing slice for SinglePassTranslatorTest"

mkdir -p slices/translate_slices/SinglePassTranslatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/SinglePassTranslatorTest.trace org.apache.commons.text.translate.SinglePassTranslatorTest.codePointsAreReturned:48:*>slices/translate_slices/SinglePassTranslatorTest/SinglePassTranslatorTestSinglePassTranslatorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/SinglePassTranslatorTest.trace org.apache.commons.text.translate.SinglePassTranslatorTest.codePointsAreReturned:49:*>slices/translate_slices/SinglePassTranslatorTest/SinglePassTranslatorTestSinglePassTranslatorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/SinglePassTranslatorTest.trace org.apache.commons.text.translate.SinglePassTranslatorTest.codePointsAreReturned:50:*>slices/translate_slices/SinglePassTranslatorTest/SinglePassTranslatorTestSinglePassTranslatorTest3.txt

#Total Asserts in org.apache.commons.text.translate/SinglePassTranslatorTest=============3
#Total Tests in org.apache.commons.text.translate/SinglePassTranslatorTest=============0
