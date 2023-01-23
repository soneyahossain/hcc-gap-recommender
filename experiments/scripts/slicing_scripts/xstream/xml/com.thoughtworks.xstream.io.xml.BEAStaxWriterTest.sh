#!/bin/bash

echo "computing slice for BEAStaxWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/BEAStaxWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/BEAStaxWriterTest.trace com.thoughtworks.xstream.io.xml.BEAStaxWriterTest.assertXmlProducedIs:21:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/BEAStaxWriterTest/BEAStaxWriterTest1.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/BEAStaxWriterTest=============1
#Total Tests in com.thoughtworks.xstream.io.xml/BEAStaxWriterTest=============0
