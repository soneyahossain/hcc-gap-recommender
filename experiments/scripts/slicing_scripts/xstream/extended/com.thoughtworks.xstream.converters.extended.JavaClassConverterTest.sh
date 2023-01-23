#!/bin/bash

echo "computing slice for JavaClassConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/extended_slices/JavaClassConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/JavaClassConverterTest.trace com.thoughtworks.xstream.converters.extended.JavaClassConverterTest.testResolvesUnloadedClassThatIsAnArray:56:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/JavaClassConverterTest/JavaClassConverterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/JavaClassConverterTest.trace com.thoughtworks.xstream.converters.extended.JavaClassConverterTest.testResolvesUnloadedClassThatIsAnArray:57:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/JavaClassConverterTest/JavaClassConverterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/JavaClassConverterTest.trace com.thoughtworks.xstream.converters.extended.JavaClassConverterTest.testResolvesUnloadedClassThatIsAnArray:58:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/JavaClassConverterTest/JavaClassConverterTest3.txt

#Total Asserts in com.thoughtworks.xstream.converters.extended/JavaClassConverterTest=============3
#Total Tests in com.thoughtworks.xstream.converters.extended/JavaClassConverterTest=============0
