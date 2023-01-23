#!/bin/bash

echo "computing slice for TreeUnmarshallerTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/core_slices/TreeUnmarshallerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/core_traces/TreeUnmarshallerTest.trace com.thoughtworks.xstream.core.TreeUnmarshallerTest.testUnmarshallingOfAliasedInterfaces:31:*>$HCC_EXPERIMENTS/slices/xstream/core_slices/TreeUnmarshallerTest/TreeUnmarshallerTest1.txt

#Total Asserts in com.thoughtworks.xstream.core/TreeUnmarshallerTest=============1
#Total Tests in com.thoughtworks.xstream.core/TreeUnmarshallerTest=============0
