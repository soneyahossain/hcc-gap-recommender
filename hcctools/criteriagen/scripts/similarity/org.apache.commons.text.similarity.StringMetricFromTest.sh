#!/bin/bash

echo "computing slice for StringMetricFromTest"

mkdir -p slices/similarity_slices/StringMetricFromTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/StringMetricFromTest.trace org.apache.commons.text.similarity.StringMetricFromTest.testEquivalence:37:*>slices/similarity_slices/StringMetricFromTest/StringMetricFromTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/StringMetricFromTest.trace org.apache.commons.text.similarity.StringMetricFromTest.testEquivalence:38:*>slices/similarity_slices/StringMetricFromTest/StringMetricFromTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/StringMetricFromTest.trace org.apache.commons.text.similarity.StringMetricFromTest.testJavadocExample:57:*>slices/similarity_slices/StringMetricFromTest/StringMetricFromTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/StringMetricFromTest.trace org.apache.commons.text.similarity.StringMetricFromTest.testJavadocExample:58:*>slices/similarity_slices/StringMetricFromTest/StringMetricFromTest4.txt

#Total Asserts in org.apache.commons.text.similarity/StringMetricFromTest=============4
#Total Tests in org.apache.commons.text.similarity/StringMetricFromTest=============0
