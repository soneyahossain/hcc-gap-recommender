#!/bin/bash

echo "computing slice for StringConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testOwnMapImplementationForCache:32:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testOwnMapImplementationForCache:33:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testCacheLimitationBasedOnStringLength:42:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testCacheLimitationBasedOnStringLength:43:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testNoCache:51:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testOwnMapImplementationAndStringLegnthLimitForCache:61:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testOwnMapImplementationAndStringLegnthLimitForCache:62:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/basic_traces/StringConverterTest.trace com.thoughtworks.xstream.converters.basic.StringConverterTest.testOwnMapImplementationAndStringLegnthLimitForCache:63:*>$HCC_EXPERIMENTS/slices/xstream/basic_slices/StringConverterTest/StringConverterTest8.txt

#Total Asserts in com.thoughtworks.xstream.converters.basic/StringConverterTest=============8
#Total Tests in com.thoughtworks.xstream.converters.basic/StringConverterTest=============0
