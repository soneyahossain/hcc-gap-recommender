#!/bin/bash

echo "computing slice for PropertiesConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testIncludesDefaultProperties:42:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testIncludesDefaultProperties:43:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testIncludesDefaultProperties:55:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testIncludesDefaultProperties:56:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testIncludesDefaultProperties:57:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testCanSortElements:81:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testCanSortElements:82:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/collections_traces/PropertiesConverterTest.trace com.thoughtworks.xstream.converters.collections.PropertiesConverterTest.testCanSortElements:83:*>$HCC_EXPERIMENTS/slices/xstream/collections_slices/PropertiesConverterTest/PropertiesConverterTest8.txt

#Total Asserts in com.thoughtworks.xstream.converters.collections/PropertiesConverterTest=============8
#Total Tests in com.thoughtworks.xstream.converters.collections/PropertiesConverterTest=============0
