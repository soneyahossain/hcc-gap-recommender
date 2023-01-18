#!/bin/bash

echo "computing slice for LevenshteinResultsTest"

mkdir -p slices/similarity_slices/LevenshteinResultsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinResultsTest.trace org.apache.commons.text.similarity.LevenshteinResultsTest.testEqualsReturningFalse:34:*>slices/similarity_slices/LevenshteinResultsTest/LevenshteinResultsTestLevenshteinResultsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinResultsTest.trace org.apache.commons.text.similarity.LevenshteinResultsTest.testEqualsWithNonNull:43:*>slices/similarity_slices/LevenshteinResultsTest/LevenshteinResultsTestLevenshteinResultsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinResultsTest.trace org.apache.commons.text.similarity.LevenshteinResultsTest.testEqualsWithNull:51:*>slices/similarity_slices/LevenshteinResultsTest/LevenshteinResultsTestLevenshteinResultsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinResultsTest.trace org.apache.commons.text.similarity.LevenshteinResultsTest.testEqualsDifferenceInSubstitutionCount:60:*>slices/similarity_slices/LevenshteinResultsTest/LevenshteinResultsTestLevenshteinResultsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinResultsTest.trace org.apache.commons.text.similarity.LevenshteinResultsTest.testEqualsSameObject:68:*>slices/similarity_slices/LevenshteinResultsTest/LevenshteinResultsTestLevenshteinResultsTest5.txt

#Total Asserts in org.apache.commons.text.similarity/LevenshteinResultsTest=============5
#Total Tests in org.apache.commons.text.similarity/LevenshteinResultsTest=============0
