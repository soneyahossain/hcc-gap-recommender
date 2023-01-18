#!/bin/bash

echo "computing slice for ParameterizedEditDistanceFromTest"

mkdir -p slices/similarity_slices/ParameterizedEditDistanceFromTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/ParameterizedEditDistanceFromTest.trace org.apache.commons.text.similarity.ParameterizedEditDistanceFromTest.test:87:*>slices/similarity_slices/ParameterizedEditDistanceFromTest/ParameterizedEditDistanceFromTest1.txt

#Total Asserts in org.apache.commons.text.similarity/ParameterizedEditDistanceFromTest=============1
#Total Tests in org.apache.commons.text.similarity/ParameterizedEditDistanceFromTest=============0
