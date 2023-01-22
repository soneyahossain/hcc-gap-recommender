#!/bin/bash

echo "computing slice for GregorianCalendarConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/extended_slices/GregorianCalendarConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/GregorianCalendarConverterTest.trace com.thoughtworks.xstream.converters.extended.GregorianCalendarConverterTest.testCalendar:32:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/GregorianCalendarConverterTest/GregorianCalendarConverterTest1.txt

#Total Asserts in com.thoughtworks.xstream.converters.extended/GregorianCalendarConverterTest=============1
#Total Tests in com.thoughtworks.xstream.converters.extended/GregorianCalendarConverterTest=============0
