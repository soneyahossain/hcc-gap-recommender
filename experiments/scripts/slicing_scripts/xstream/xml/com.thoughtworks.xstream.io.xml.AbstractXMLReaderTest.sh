#!/bin/bash

echo "computing slice for AbstractXMLReaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractXMLReaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/AbstractXMLReaderTest.trace >$HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractXMLReaderTest/AbstractXMLReaderTest.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/AbstractXMLReaderTest=============0
#Total Tests in com.thoughtworks.xstream.io.xml/AbstractXMLReaderTest=============0
