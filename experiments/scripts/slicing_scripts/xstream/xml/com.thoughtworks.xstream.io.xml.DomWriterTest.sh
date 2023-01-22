#!/bin/bash

echo "computing slice for DomWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/DomWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomWriterTest.trace com.thoughtworks.xstream.io.xml.DomWriterTest.testCanWriteIntoArbitraryNode:58:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomWriterTest/DomWriterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomWriterTest.trace com.thoughtworks.xstream.io.xml.DomWriterTest.testCanWriteIntoArbitraryNodeAgain:78:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomWriterTest/DomWriterTest2.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/DomWriterTest=============2
#Total Tests in com.thoughtworks.xstream.io.xml/DomWriterTest=============0
