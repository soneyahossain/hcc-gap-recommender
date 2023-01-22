#!/bin/bash

echo "computing slice for AttributesWithJAXBTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/AttributesWithJAXBTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/AttributesWithJAXBTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.AttributesWithJAXBTest.testTwoAttributes:48:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/AttributesWithJAXBTest/AttributesWithJAXBTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/AttributesWithJAXBTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.AttributesWithJAXBTest.testAttributeAndElement:56:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/AttributesWithJAXBTest/AttributesWithJAXBTest2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.jaxb/AttributesWithJAXBTest=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.jaxb/AttributesWithJAXBTest=============0
