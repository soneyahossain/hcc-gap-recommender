#!/bin/bash

echo "computing slice for Dom4JXmlWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/Dom4JXmlWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/Dom4JXmlWriterTest.trace com.thoughtworks.xstream.io.xml.Dom4JXmlWriterTest.assertXmlProducedIs:42:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/Dom4JXmlWriterTest/Dom4JXmlWriterTest1.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/Dom4JXmlWriterTest=============1
#Total Tests in com.thoughtworks.xstream.io.xml/Dom4JXmlWriterTest=============0
