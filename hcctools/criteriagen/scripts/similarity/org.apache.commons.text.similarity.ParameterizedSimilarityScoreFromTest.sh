#!/bin/bash

echo "computing slice for ParameterizedSimilarityScoreFromTest"

mkdir -p slices/similarity_slices/ParameterizedSimilarityScoreFromTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/ParameterizedSimilarityScoreFromTest.trace org.apache.commons.text.similarity.ParameterizedSimilarityScoreFromTest.test:79:*>slices/similarity_slices/ParameterizedSimilarityScoreFromTest/ParameterizedSimilarityScoreFromTest1.txt

#Total Asserts in org.apache.commons.text.similarity/ParameterizedSimilarityScoreFromTest=============1
#Total Tests in org.apache.commons.text.similarity/ParameterizedSimilarityScoreFromTest=============0
