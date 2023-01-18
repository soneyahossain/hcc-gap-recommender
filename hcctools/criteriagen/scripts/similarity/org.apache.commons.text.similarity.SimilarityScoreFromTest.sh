#!/bin/bash

echo "computing slice for SimilarityScoreFromTest"

mkdir -p slices/similarity_slices/SimilarityScoreFromTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/SimilarityScoreFromTest.trace org.apache.commons.text.similarity.SimilarityScoreFromTest.testApply:37:*>slices/similarity_slices/SimilarityScoreFromTest/SimilarityScoreFromTestSimilarityScoreFromTest1.txt

#Total Asserts in org.apache.commons.text.similarity/SimilarityScoreFromTest=============1
#Total Tests in org.apache.commons.text.similarity/SimilarityScoreFromTest=============0
