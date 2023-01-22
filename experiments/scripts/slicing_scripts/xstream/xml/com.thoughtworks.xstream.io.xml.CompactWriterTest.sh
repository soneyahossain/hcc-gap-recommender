#!/bin/bash

echo "computing slice for CompactWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/CompactWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/CompactWriterTest.trace com.thoughtworks.xstream.io.xml.CompactWriterTest.assertXmlProducedIs:29:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/CompactWriterTest/CompactWriterTest1.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/CompactWriterTest=============1
#Total Tests in com.thoughtworks.xstream.io.xml/CompactWriterTest=============0
