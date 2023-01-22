#!/bin/bash

echo "computing slice for AbstractXMLWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractXMLWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/AbstractXMLWriterTest.trace >$HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractXMLWriterTest/AbstractXMLWriterTest.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/AbstractXMLWriterTest=============0
#Total Tests in com.thoughtworks.xstream.io.xml/AbstractXMLWriterTest=============0
