#!/bin/bash

echo "computing slice for CaseUtilsTest"

mkdir -p slices/text_slices/CaseUtilsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testConstructor:34:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testConstructor:36:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testConstructor:37:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testConstructor:38:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testConstructor:39:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:45:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:46:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:47:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:48:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:49:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:50:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:51:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:54:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:55:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:56:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:57:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:59:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:60:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:61:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:62:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:64:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:65:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:66:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:67:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:68:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:69:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:71:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:72:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:74:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CaseUtilsTest.trace org.apache.commons.text.CaseUtilsTest.testToCamelCase:75:*>slices/text_slices/CaseUtilsTest/CaseUtilsTestCaseUtilsTest30.txt

#Total Asserts in org.apache.commons.text/CaseUtilsTest=============30
#Total Tests in org.apache.commons.text/CaseUtilsTest=============0
