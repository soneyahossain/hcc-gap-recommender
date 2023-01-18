#!/bin/bash

echo "computing slice for LookupTranslatorTest"

mkdir -p slices/translate_slices/LookupTranslatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/LookupTranslatorTest.trace org.apache.commons.text.translate.LookupTranslatorTest.testBasicLookup:42:*>slices/translate_slices/LookupTranslatorTest/LookupTranslatorTestLookupTranslatorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/LookupTranslatorTest.trace org.apache.commons.text.translate.LookupTranslatorTest.testBasicLookup:43:*>slices/translate_slices/LookupTranslatorTest/LookupTranslatorTestLookupTranslatorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/LookupTranslatorTest.trace org.apache.commons.text.translate.LookupTranslatorTest.testLang882:54:*>slices/translate_slices/LookupTranslatorTest/LookupTranslatorTestLookupTranslatorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/LookupTranslatorTest.trace org.apache.commons.text.translate.LookupTranslatorTest.testLang882:55:*>slices/translate_slices/LookupTranslatorTest/LookupTranslatorTestLookupTranslatorTest4.txt

#Total Asserts in org.apache.commons.text.translate/LookupTranslatorTest=============4
#Total Tests in org.apache.commons.text.translate/LookupTranslatorTest=============0
