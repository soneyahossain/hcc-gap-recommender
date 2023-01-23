#!/bin/bash

echo "computing slice for SaxWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/SaxWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/SaxWriterTest.trace com.thoughtworks.xstream.io.xml.SaxWriterTest.testMarshalsObjectToSAX:97:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/SaxWriterTest/SaxWriterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/SaxWriterTest.trace com.thoughtworks.xstream.io.xml.SaxWriterTest.testAllowsStartAndEndDocCallbacksToBeSkipped:117:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/SaxWriterTest/SaxWriterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/SaxWriterTest.trace com.thoughtworks.xstream.io.xml.SaxWriterTest.testMarshalsObjectToTrAX:136:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/SaxWriterTest/SaxWriterTest3.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/SaxWriterTest=============3
#Total Tests in com.thoughtworks.xstream.io.xml/SaxWriterTest=============0
