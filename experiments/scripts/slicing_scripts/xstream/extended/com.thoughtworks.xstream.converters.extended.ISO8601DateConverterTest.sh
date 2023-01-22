#!/bin/bash

echo "computing slice for ISO8601DateConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601DateConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ISO8601DateConverterTest.trace com.thoughtworks.xstream.converters.extended.ISO8601DateConverterTest.testUnmashallsInCorrectTimeZone:51:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601DateConverterTest/ISO8601DateConverterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ISO8601DateConverterTest.trace com.thoughtworks.xstream.converters.extended.ISO8601DateConverterTest.testUnmashallsInCorrectTimeZone:52:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601DateConverterTest/ISO8601DateConverterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ISO8601DateConverterTest.trace com.thoughtworks.xstream.converters.extended.ISO8601DateConverterTest.testUnmashallsInCorrectTimeZone:53:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601DateConverterTest/ISO8601DateConverterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ISO8601DateConverterTest.trace com.thoughtworks.xstream.converters.extended.ISO8601DateConverterTest.testUnmarshallsISOFormatInUTC:64:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601DateConverterTest/ISO8601DateConverterTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ISO8601DateConverterTest.trace com.thoughtworks.xstream.converters.extended.ISO8601DateConverterTest.testUnmarshallsISOFormatInUTC:65:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601DateConverterTest/ISO8601DateConverterTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ISO8601DateConverterTest.trace com.thoughtworks.xstream.converters.extended.ISO8601DateConverterTest.testUnmarshallsISOFormatInLocalTime:76:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601DateConverterTest/ISO8601DateConverterTest6.txt

#Total Asserts in com.thoughtworks.xstream.converters.extended/ISO8601DateConverterTest=============6
#Total Tests in com.thoughtworks.xstream.converters.extended/ISO8601DateConverterTest=============0
