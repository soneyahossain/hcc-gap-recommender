#!/bin/bash

echo "computing slice for TestBinaryData"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestBinaryData

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestBinaryData.trace com.fasterxml.jackson.dataformat.xml.deser.TestBinaryData.testTwoBinaryProps:42:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestBinaryData/TestBinaryData1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestBinaryData.trace com.fasterxml.jackson.dataformat.xml.deser.TestBinaryData.testTwoBinaryProps:43:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestBinaryData/TestBinaryData2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.deser/TestBinaryData=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.deser/TestBinaryData=============0
