#!/bin/bash

echo "computing slice for CosineSimilarityTest"

mkdir -p slices/similarity_slices/CosineSimilarityTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/CosineSimilarityTest.trace org.apache.commons.text.similarity.CosineSimilarityTest.testCosineSimilarityWithNonEmptyMap:38:*>slices/similarity_slices/CosineSimilarityTest/CosineSimilarityTestCosineSimilarityTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/CosineSimilarityTest.trace org.apache.commons.text.similarity.CosineSimilarityTest.testCosineSimilarityReturningDoubleWhereByteValueIsZero:59:*>slices/similarity_slices/CosineSimilarityTest/CosineSimilarityTestCosineSimilarityTest2.txt

#Total Asserts in org.apache.commons.text.similarity/CosineSimilarityTest=============2
#Total Tests in org.apache.commons.text.similarity/CosineSimilarityTest=============0
