#!/bin/bash

echo "computing slice for HammingDistanceTest"

mkdir -p slices/similarity_slices/HammingDistanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:38:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:39:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:40:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:41:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:42:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:43:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:44:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/HammingDistanceTest.trace org.apache.commons.text.similarity.HammingDistanceTest.testHammingDistance:45:*>slices/similarity_slices/HammingDistanceTest/HammingDistanceTestHammingDistanceTest8.txt

#Total Asserts in org.apache.commons.text.similarity/HammingDistanceTest=============8
#Total Tests in org.apache.commons.text.similarity/HammingDistanceTest=============0
