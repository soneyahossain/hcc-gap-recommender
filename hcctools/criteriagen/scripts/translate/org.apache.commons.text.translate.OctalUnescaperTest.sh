#!/bin/bash

echo "computing slice for OctalUnescaperTest"

mkdir -p slices/translate_slices/OctalUnescaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:35:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:39:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:43:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:47:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:51:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:55:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:59:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:63:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:67:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:71:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:75:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/OctalUnescaperTest.trace org.apache.commons.text.translate.OctalUnescaperTest.testBetween:79:*>slices/translate_slices/OctalUnescaperTest/OctalUnescaperTestOctalUnescaperTest12.txt

#Total Asserts in org.apache.commons.text.translate/OctalUnescaperTest=============12
#Total Tests in org.apache.commons.text.translate/OctalUnescaperTest=============0
