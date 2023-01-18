#!/bin/bash

echo "computing slice for JaroWinklerDistanceTest"

mkdir -p slices/similarity_slices/JaroWinklerDistanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:38:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:39:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:40:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:41:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:42:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:43:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:45:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaroWinklerDistanceTest.trace org.apache.commons.text.similarity.JaroWinklerDistanceTest.testGetJaroWinklerDistance_StringString:46:*>slices/similarity_slices/JaroWinklerDistanceTest/JaroWinklerDistanceTest8.txt

#Total Asserts in org.apache.commons.text.similarity/JaroWinklerDistanceTest=============8
#Total Tests in org.apache.commons.text.similarity/JaroWinklerDistanceTest=============0
