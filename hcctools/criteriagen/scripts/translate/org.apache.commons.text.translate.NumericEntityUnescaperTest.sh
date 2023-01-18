#!/bin/bash

echo "computing slice for NumericEntityUnescaperTest"

mkdir -p slices/translate_slices/NumericEntityUnescaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testSupplementaryUnescaping:37:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testOutOfBounds:44:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testOutOfBounds:45:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testOutOfBounds:46:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testOutOfBounds:47:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testUnfinishedEntity:58:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testUnfinishedEntity:66:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testCreatesNumericEntityUnescaperOne:86:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.text.translate.NumericEntityUnescaperTest.testCreatesNumericEntityUnescaperTwo:95:*>slices/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTestNumericEntityUnescaperTest9.txt

#Total Asserts in org.apache.commons.text.translate/NumericEntityUnescaperTest=============9
#Total Tests in org.apache.commons.text.translate/NumericEntityUnescaperTest=============0
