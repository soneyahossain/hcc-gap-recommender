#!/bin/bash

echo "computing slice for FuzzyScoreTest"

mkdir -p slices/similarity_slices/FuzzyScoreTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetFuzzyScore:34:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetFuzzyScore:35:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetFuzzyScore:36:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetFuzzyScore:37:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetFuzzyScore:38:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetFuzzyScore:39:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetFuzzyScore:40:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/FuzzyScoreTest.trace org.apache.commons.text.similarity.FuzzyScoreTest.testGetLocale:69:*>slices/similarity_slices/FuzzyScoreTest/FuzzyScoreTestFuzzyScoreTest8.txt

#Total Asserts in org.apache.commons.text.similarity/FuzzyScoreTest=============8
#Total Tests in org.apache.commons.text.similarity/FuzzyScoreTest=============0
