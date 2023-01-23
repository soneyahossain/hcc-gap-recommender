#!/bin/bash

echo "computing slice for XmlFriendlyMapperTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/mapper_slices/XmlFriendlyMapperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/mapper_traces/XmlFriendlyMapperTest.trace com.thoughtworks.xstream.mapper.XmlFriendlyMapperTest.testPrefixesIllegalXmlElementNamesWithValue:25:*>$HCC_EXPERIMENTS/slices/xstream/mapper_slices/XmlFriendlyMapperTest/XmlFriendlyMapperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/mapper_traces/XmlFriendlyMapperTest.trace com.thoughtworks.xstream.mapper.XmlFriendlyMapperTest.testPrefixesIllegalXmlElementNamesWithValue:27:*>$HCC_EXPERIMENTS/slices/xstream/mapper_slices/XmlFriendlyMapperTest/XmlFriendlyMapperTest2.txt

#Total Asserts in com.thoughtworks.xstream.mapper/XmlFriendlyMapperTest=============2
#Total Tests in com.thoughtworks.xstream.mapper/XmlFriendlyMapperTest=============0
