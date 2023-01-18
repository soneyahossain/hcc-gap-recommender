#!/bin/bash

echo "computing slice for ReplacementsFinderTest"

mkdir -p slices/diff_slices/ReplacementsFinderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/diff_traces/ReplacementsFinderTest.trace org.apache.commons.text.diff.ReplacementsFinderTest.testReplacementsHandler:80:*>slices/diff_slices/ReplacementsFinderTest/ReplacementsFinderTestReplacementsFinderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/diff_traces/ReplacementsFinderTest.trace org.apache.commons.text.diff.ReplacementsFinderTest.testReplacementsHandler:81:*>slices/diff_slices/ReplacementsFinderTest/ReplacementsFinderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/diff_traces/ReplacementsFinderTest.trace org.apache.commons.text.diff.ReplacementsFinderTest.testReplacementsHandler:83:*>slices/diff_slices/ReplacementsFinderTest/ReplacementsFinderTest3.txt

#Total Asserts in org.apache.commons.text.diff/ReplacementsFinderTest=============3
#Total Tests in org.apache.commons.text.diff/ReplacementsFinderTest=============0
