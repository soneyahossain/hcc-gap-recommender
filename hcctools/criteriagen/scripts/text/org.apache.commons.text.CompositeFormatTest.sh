#!/bin/bash

echo "computing slice for CompositeFormatTest"

mkdir -p slices/text_slices/CompositeFormatTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CompositeFormatTest.trace org.apache.commons.text.CompositeFormatTest.parseObject:73:*>slices/text_slices/CompositeFormatTest/CompositeFormatTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CompositeFormatTest.trace org.apache.commons.text.CompositeFormatTest.parseObject:74:*>slices/text_slices/CompositeFormatTest/CompositeFormatTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CompositeFormatTest.trace org.apache.commons.text.CompositeFormatTest.testUsage:83:*>slices/text_slices/CompositeFormatTest/CompositeFormatTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CompositeFormatTest.trace org.apache.commons.text.CompositeFormatTest.testUsage:84:*>slices/text_slices/CompositeFormatTest/CompositeFormatTest4.txt

#Total Asserts in org.apache.commons.text/CompositeFormatTest=============4
#Total Tests in org.apache.commons.text/CompositeFormatTest=============0
