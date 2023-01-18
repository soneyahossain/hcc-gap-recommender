#!/bin/bash

echo "computing slice for ParameterizedLevenshteinDistanceTest"

mkdir -p slices/similarity_slices/ParameterizedLevenshteinDistanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/ParameterizedLevenshteinDistanceTest.trace org.apache.commons.text.similarity.ParameterizedLevenshteinDistanceTest.test:121:*>slices/similarity_slices/ParameterizedLevenshteinDistanceTest/ParameterizedLevenshteinDistanceTest1.txt

#Total Asserts in org.apache.commons.text.similarity/ParameterizedLevenshteinDistanceTest=============1
#Total Tests in org.apache.commons.text.similarity/ParameterizedLevenshteinDistanceTest=============0
