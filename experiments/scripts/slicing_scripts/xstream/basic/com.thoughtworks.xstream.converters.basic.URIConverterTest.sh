#!/bin/bash

echo "computing slice for URIConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/basic_slices/URIConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/URIConverterTest.trace com.thoughtworks.xstream.converters.basic.URIConverterTest.setUp:34:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/URIConverterTest/URIConverterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/URIConverterTest.trace com.thoughtworks.xstream.converters.basic.URIConverterTest.setUp:35:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/URIConverterTest/URIConverterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/URIConverterTest.trace com.thoughtworks.xstream.converters.basic.URIConverterTest.testCanConvert:46:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/URIConverterTest/URIConverterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/URIConverterTest.trace com.thoughtworks.xstream.converters.basic.URIConverterTest.testFromString:56:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/URIConverterTest/URIConverterTest4.txt

#Total Asserts in com.thoughtworks.xstream.converters.basic/URIConverterTest=============4
#Total Tests in com.thoughtworks.xstream.converters.basic/URIConverterTest=============0
