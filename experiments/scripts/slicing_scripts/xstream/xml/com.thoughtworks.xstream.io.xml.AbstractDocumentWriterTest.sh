#!/bin/bash

echo "computing slice for AbstractDocumentWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractDocumentWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/AbstractDocumentWriterTest.trace >$HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractDocumentWriterTest/AbstractDocumentWriterTest.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/AbstractDocumentWriterTest=============0
#Total Tests in com.thoughtworks.xstream.io.xml/AbstractDocumentWriterTest=============0
