#!/bin/bash

echo "computing slice for SjsxpWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/SjsxpWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/SjsxpWriterTest.trace com.thoughtworks.xstream.io.xml.SjsxpWriterTest.assertXmlProducedIs:48:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/SjsxpWriterTest/SjsxpWriterTest1.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/SjsxpWriterTest=============1
#Total Tests in com.thoughtworks.xstream.io.xml/SjsxpWriterTest=============0
