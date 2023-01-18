#!/bin/bash

echo "computing slice for CodePointTranslatorTest"

mkdir -p slices/translate_slices/CodePointTranslatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CodePointTranslatorTest.trace org.apache.commons.text.translate.CodePointTranslatorTest.testAboveReturningNonNull:37:*>slices/translate_slices/CodePointTranslatorTest/CodePointTranslatorTestCodePointTranslatorTest1.txt

#Total Asserts in org.apache.commons.text.translate/CodePointTranslatorTest=============1
#Total Tests in org.apache.commons.text.translate/CodePointTranslatorTest=============0
