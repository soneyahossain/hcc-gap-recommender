#!/bin/bash

echo "computing slice for EntityArraysTest"

mkdir -p slices/translate_slices/EntityArraysTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/EntityArraysTest.trace org.apache.commons.text.translate.EntityArraysTest.testForDuplicatedDeclaredMapKeys:60:*>slices/translate_slices/EntityArraysTest/EntityArraysTestEntityArraysTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/EntityArraysTest.trace org.apache.commons.text.translate.EntityArraysTest.testForDuplicateDeclaredMapValuesISO8859Map:68:*>slices/translate_slices/EntityArraysTest/EntityArraysTestEntityArraysTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/EntityArraysTest.trace org.apache.commons.text.translate.EntityArraysTest.testForDuplicateDeclaredMapValuesHtml40ExtendedMap:79:*>slices/translate_slices/EntityArraysTest/EntityArraysTestEntityArraysTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/EntityArraysTest.trace org.apache.commons.text.translate.EntityArraysTest.testForDuplicateDeclaredMapValuesAposMap:90:*>slices/translate_slices/EntityArraysTest/EntityArraysTestEntityArraysTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/EntityArraysTest.trace org.apache.commons.text.translate.EntityArraysTest.testForDuplicateDeclaredMapValuesBasicMap:101:*>slices/translate_slices/EntityArraysTest/EntityArraysTestEntityArraysTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/EntityArraysTest.trace org.apache.commons.text.translate.EntityArraysTest.testForDuplicateDeclaredMapValuesJavaCtrlCharsMap:112:*>slices/translate_slices/EntityArraysTest/EntityArraysTestEntityArraysTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/EntityArraysTest.trace org.apache.commons.text.translate.EntityArraysTest.testEscapeVsUnescapeMaps:126:*>slices/translate_slices/EntityArraysTest/EntityArraysTestEntityArraysTest7.txt

#Total Asserts in org.apache.commons.text.translate/EntityArraysTest=============7
#Total Tests in org.apache.commons.text.translate/EntityArraysTest=============0
