#!/bin/bash

echo "computing slice for ISO8601GregorianCalendarConverter17Test"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601GregorianCalendarConverter17Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ISO8601GregorianCalendarConverter17Test.trace com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter17Test.testCanLoadTimeWithDefaultDifferentLocaleForFormat:49:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ISO8601GregorianCalendarConverter17Test/ISO8601GregorianCalendarConverter17Test1.txt

#Total Asserts in com.thoughtworks.xstream.converters.extended/ISO8601GregorianCalendarConverter17Test=============1
#Total Tests in com.thoughtworks.xstream.converters.extended/ISO8601GregorianCalendarConverter17Test=============0
