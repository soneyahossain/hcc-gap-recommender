#!/bin/bash

echo "computing slice for JaccardSimilarityTest"

mkdir -p slices/similarity_slices/JaccardSimilarityTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:38:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:39:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:40:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:41:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:42:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:43:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:44:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:45:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:46:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:48:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:49:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:50:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/JaccardSimilarityTest.trace org.apache.commons.text.similarity.JaccardSimilarityTest.testGettingJaccardSimilarity:51:*>slices/similarity_slices/JaccardSimilarityTest/JaccardSimilarityTest13.txt

#Total Asserts in org.apache.commons.text.similarity/JaccardSimilarityTest=============13
#Total Tests in org.apache.commons.text.similarity/JaccardSimilarityTest=============0
