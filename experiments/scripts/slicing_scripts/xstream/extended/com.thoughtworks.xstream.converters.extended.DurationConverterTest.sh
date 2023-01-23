#!/bin/bash

echo "computing slice for DurationConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/extended_slices/DurationConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/DurationConverterTest.trace com.thoughtworks.xstream.converters.extended.DurationConverterTest.testConversion:33:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/DurationConverterTest/DurationConverterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/DurationConverterTest.trace com.thoughtworks.xstream.converters.extended.DurationConverterTest.testConversion:34:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/DurationConverterTest/DurationConverterTest2.txt

#Total Asserts in com.thoughtworks.xstream.converters.extended/DurationConverterTest=============2
#Total Tests in com.thoughtworks.xstream.converters.extended/DurationConverterTest=============0
