#!/bin/bash

echo "computing slice for ConversionExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/converters_slices/ConversionExceptionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/converters_traces/ConversionExceptionTest.trace com.thoughtworks.xstream.converters.ConversionExceptionTest.testDebugMessageIsNotNested:35:*>$HCC_EXPERIMENTS/slices/xstream/converters_slices/ConversionExceptionTest/ConversionExceptionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/converters_traces/ConversionExceptionTest.trace com.thoughtworks.xstream.converters.ConversionExceptionTest.testInfoRetainsOrder:46:*>$HCC_EXPERIMENTS/slices/xstream/converters_slices/ConversionExceptionTest/ConversionExceptionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/converters_traces/ConversionExceptionTest.trace com.thoughtworks.xstream.converters.ConversionExceptionTest.testInfoRetainsOrder:47:*>$HCC_EXPERIMENTS/slices/xstream/converters_slices/ConversionExceptionTest/ConversionExceptionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/converters_traces/ConversionExceptionTest.trace com.thoughtworks.xstream.converters.ConversionExceptionTest.testInfoRetainsOrder:48:*>$HCC_EXPERIMENTS/slices/xstream/converters_slices/ConversionExceptionTest/ConversionExceptionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/converters_traces/ConversionExceptionTest.trace com.thoughtworks.xstream.converters.ConversionExceptionTest.testInfoRetainsOrder:49:*>$HCC_EXPERIMENTS/slices/xstream/converters_slices/ConversionExceptionTest/ConversionExceptionTest5.txt

#Total Asserts in com.thoughtworks.xstream.converters/ConversionExceptionTest=============5
#Total Tests in com.thoughtworks.xstream.converters/ConversionExceptionTest=============0
