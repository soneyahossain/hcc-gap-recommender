#!/bin/bash

echo "computing slice for JDom2ReaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/JDom2ReaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/JDom2ReaderTest.trace com.thoughtworks.xstream.io.xml.JDom2ReaderTest.testCanReadFromElementOfLargerDocument:43:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/JDom2ReaderTest/JDom2ReaderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/JDom2ReaderTest.trace com.thoughtworks.xstream.io.xml.JDom2ReaderTest.testCanReadFromElementOfLargerDocument:45:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/JDom2ReaderTest/JDom2ReaderTest2.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/JDom2ReaderTest=============2
#Total Tests in com.thoughtworks.xstream.io.xml/JDom2ReaderTest=============0
