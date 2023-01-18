#!/bin/bash

echo "computing slice for CosineDistanceTest"

mkdir -p slices/similarity_slices/CosineDistanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/CosineDistanceTest.trace org.apache.commons.text.similarity.CosineDistanceTest.testCosineDistance:50:*>slices/similarity_slices/CosineDistanceTest/CosineDistanceTestCosineDistanceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/CosineDistanceTest.trace org.apache.commons.text.similarity.CosineDistanceTest.testCosineDistance:51:*>slices/similarity_slices/CosineDistanceTest/CosineDistanceTestCosineDistanceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/CosineDistanceTest.trace org.apache.commons.text.similarity.CosineDistanceTest.testCosineDistance:52:*>slices/similarity_slices/CosineDistanceTest/CosineDistanceTestCosineDistanceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/CosineDistanceTest.trace org.apache.commons.text.similarity.CosineDistanceTest.testCosineDistance:53:*>slices/similarity_slices/CosineDistanceTest/CosineDistanceTestCosineDistanceTest4.txt

#Total Asserts in org.apache.commons.text.similarity/CosineDistanceTest=============4
#Total Tests in org.apache.commons.text.similarity/CosineDistanceTest=============0
