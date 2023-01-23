#!/bin/bash

echo "computing slice for DomReaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/DomReaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomReaderTest.trace com.thoughtworks.xstream.io.xml.DomReaderTest.testCanReadFromElementOfLargerDocument:56:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomReaderTest/DomReaderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomReaderTest.trace com.thoughtworks.xstream.io.xml.DomReaderTest.testCanReadFromElementOfLargerDocument:58:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomReaderTest/DomReaderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomReaderTest.trace com.thoughtworks.xstream.io.xml.DomReaderTest.testExposesAttributesKeysAndValuesByIndex:67:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomReaderTest/DomReaderTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomReaderTest.trace com.thoughtworks.xstream.io.xml.DomReaderTest.testExposesAttributesKeysAndValuesByIndex:81:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomReaderTest/DomReaderTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomReaderTest.trace com.thoughtworks.xstream.io.xml.DomReaderTest.testExposesAttributesKeysAndValuesByIndex:84:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomReaderTest/DomReaderTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/DomReaderTest.trace com.thoughtworks.xstream.io.xml.DomReaderTest.testExposesAttributesKeysAndValuesByIndex:85:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/DomReaderTest/DomReaderTest6.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/DomReaderTest=============6
#Total Tests in com.thoughtworks.xstream.io.xml/DomReaderTest=============0
