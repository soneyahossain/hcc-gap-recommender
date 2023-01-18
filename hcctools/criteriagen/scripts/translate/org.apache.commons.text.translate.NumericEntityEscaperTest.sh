#!/bin/bash

echo "computing slice for NumericEntityEscaperTest"

mkdir -p slices/translate_slices/NumericEntityEscaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityEscaperTest.trace org.apache.commons.text.translate.NumericEntityEscaperTest.testBelow:35:*>slices/translate_slices/NumericEntityEscaperTest/NumericEntityEscaperTestNumericEntityEscaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityEscaperTest.trace org.apache.commons.text.translate.NumericEntityEscaperTest.testBetween:44:*>slices/translate_slices/NumericEntityEscaperTest/NumericEntityEscaperTestNumericEntityEscaperTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityEscaperTest.trace org.apache.commons.text.translate.NumericEntityEscaperTest.testAbove:53:*>slices/translate_slices/NumericEntityEscaperTest/NumericEntityEscaperTestNumericEntityEscaperTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/NumericEntityEscaperTest.trace org.apache.commons.text.translate.NumericEntityEscaperTest.testSupplementary:64:*>slices/translate_slices/NumericEntityEscaperTest/NumericEntityEscaperTestNumericEntityEscaperTest4.txt

#Total Asserts in org.apache.commons.text.translate/NumericEntityEscaperTest=============4
#Total Tests in org.apache.commons.text.translate/NumericEntityEscaperTest=============0
