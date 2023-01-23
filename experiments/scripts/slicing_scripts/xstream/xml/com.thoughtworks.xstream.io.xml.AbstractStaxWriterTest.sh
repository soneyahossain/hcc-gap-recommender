#!/bin/bash

echo "computing slice for AbstractStaxWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractStaxWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/AbstractStaxWriterTest.trace >$HCC_EXPERIMENTS/slices/xstream/xml_slices/AbstractStaxWriterTest/AbstractStaxWriterTest.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/AbstractStaxWriterTest=============0
#Total Tests in com.thoughtworks.xstream.io.xml/AbstractStaxWriterTest=============0
