#!/bin/bash

echo "computing slice for XmlParserNextXxxTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/stream_slices/XmlParserNextXxxTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/stream_traces/XmlParserNextXxxTest.trace com.fasterxml.jackson.dataformat.xml.stream.XmlParserNextXxxTest.testXmlAttributesWithNextTextValue:39:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/stream_slices/XmlParserNextXxxTest/XmlParserNextXxxTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/stream_traces/XmlParserNextXxxTest.trace com.fasterxml.jackson.dataformat.xml.stream.XmlParserNextXxxTest.testXmlAttributesWithNextTextValue:41:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/stream_slices/XmlParserNextXxxTest/XmlParserNextXxxTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/stream_traces/XmlParserNextXxxTest.trace com.fasterxml.jackson.dataformat.xml.stream.XmlParserNextXxxTest.testXmlAttributesWithNextTextValue:44:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/stream_slices/XmlParserNextXxxTest/XmlParserNextXxxTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/stream_traces/XmlParserNextXxxTest.trace com.fasterxml.jackson.dataformat.xml.stream.XmlParserNextXxxTest.testXmlAttributesWithNextTextValue:46:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/stream_slices/XmlParserNextXxxTest/XmlParserNextXxxTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/stream_traces/XmlParserNextXxxTest.trace com.fasterxml.jackson.dataformat.xml.stream.XmlParserNextXxxTest.testXmlAttributesWithNextTextValue:48:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/stream_slices/XmlParserNextXxxTest/XmlParserNextXxxTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/stream_traces/XmlParserNextXxxTest.trace com.fasterxml.jackson.dataformat.xml.stream.XmlParserNextXxxTest.testXmlAttributesWithNextTextValue:50:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/stream_slices/XmlParserNextXxxTest/XmlParserNextXxxTest6.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.stream/XmlParserNextXxxTest=============6
#Total Tests in com.fasterxml.jackson.dataformat.xml.stream/XmlParserNextXxxTest=============0
