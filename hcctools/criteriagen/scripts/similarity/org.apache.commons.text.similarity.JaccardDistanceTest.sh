#!/bin/bash

echo "computing slice for JaccardDistanceTest"

mkdir -p slices/similarity_slices/JaccardDistanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:38:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:39:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:40:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:41:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:42:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:43:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:44:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:45:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:46:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:48:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:49:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:50:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardDistanceTest.trace org.apache.commons.text.similarity.JaccardDistanceTest.testGettingJaccardDistance:51:*>slices/similarity_slices/JaccardDistanceTest/JaccardDistanceTest13.txt

#Total Asserts in org.apache.commons.text.similarity/JaccardDistanceTest=============13
#Total Tests in org.apache.commons.text.similarity/JaccardDistanceTest=============0
