#!/bin/bash

echo "computing slice for XppDomReaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/XppDomReaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/XppDomReaderTest.trace com.thoughtworks.xstream.io.xml.XppDomReaderTest.testCanReadFromElementOfLargerDocument:45:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/XppDomReaderTest/XppDomReaderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/XppDomReaderTest.trace com.thoughtworks.xstream.io.xml.XppDomReaderTest.testCanReadFromElementOfLargerDocument:49:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/XppDomReaderTest/XppDomReaderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/XppDomReaderTest.trace com.thoughtworks.xstream.io.xml.XppDomReaderTest.testExposesAttributesKeysAndValuesByIndex:58:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/XppDomReaderTest/XppDomReaderTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/XppDomReaderTest.trace com.thoughtworks.xstream.io.xml.XppDomReaderTest.testExposesAttributesKeysAndValuesByIndex:72:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/XppDomReaderTest/XppDomReaderTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/XppDomReaderTest.trace com.thoughtworks.xstream.io.xml.XppDomReaderTest.testExposesAttributesKeysAndValuesByIndex:75:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/XppDomReaderTest/XppDomReaderTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/XppDomReaderTest.trace com.thoughtworks.xstream.io.xml.XppDomReaderTest.testExposesAttributesKeysAndValuesByIndex:76:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/XppDomReaderTest/XppDomReaderTest6.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/XppDomReaderTest=============6
#Total Tests in com.thoughtworks.xstream.io.xml/XppDomReaderTest=============0
