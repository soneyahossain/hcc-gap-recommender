#!/bin/bash

echo "computing slice for StringsComparatorTest"

mkdir -p slices/diff_slices/StringsComparatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/diff_traces/StringsComparatorTest.trace org.apache.commons.text.diff.StringsComparatorTest.testLength:40:*>slices/diff_slices/StringsComparatorTest/StringsComparatorTestStringsComparatorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/diff_traces/StringsComparatorTest.trace org.apache.commons.text.diff.StringsComparatorTest.testLongestCommonSubsequence:48:*>slices/diff_slices/StringsComparatorTest/StringsComparatorTestStringsComparatorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/diff_traces/StringsComparatorTest.trace org.apache.commons.text.diff.StringsComparatorTest.testExecution:57:*>slices/diff_slices/StringsComparatorTest/StringsComparatorTestStringsComparatorTest3.txt

#Total Asserts in org.apache.commons.text.diff/StringsComparatorTest=============3
#Total Tests in org.apache.commons.text.diff/StringsComparatorTest=============0
