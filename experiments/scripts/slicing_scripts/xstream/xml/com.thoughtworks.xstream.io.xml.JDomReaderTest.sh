#!/bin/bash

echo "computing slice for JDomReaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/JDomReaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/JDomReaderTest.trace com.thoughtworks.xstream.io.xml.JDomReaderTest.testCanReadFromElementOfLargerDocument:44:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/JDomReaderTest/JDomReaderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/JDomReaderTest.trace com.thoughtworks.xstream.io.xml.JDomReaderTest.testCanReadFromElementOfLargerDocument:46:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/JDomReaderTest/JDomReaderTest2.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/JDomReaderTest=============2
#Total Tests in com.thoughtworks.xstream.io.xml/JDomReaderTest=============0
