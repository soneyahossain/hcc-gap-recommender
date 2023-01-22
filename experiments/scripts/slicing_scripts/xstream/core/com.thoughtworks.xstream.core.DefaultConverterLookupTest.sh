#!/bin/bash

echo "computing slice for DefaultConverterLookupTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/core_slices/DefaultConverterLookupTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/core_traces/DefaultConverterLookupTest.trace com.thoughtworks.xstream.core.DefaultConverterLookupTest.testCanReplaceWithHigherPriority:38:*>$HCC_EXPERIMENTS/slices/xstream/core_slices/DefaultConverterLookupTest/DefaultConverterLookupTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/core_traces/DefaultConverterLookupTest.trace com.thoughtworks.xstream.core.DefaultConverterLookupTest.testCanReplaceWithHigherPriority:41:*>$HCC_EXPERIMENTS/slices/xstream/core_slices/DefaultConverterLookupTest/DefaultConverterLookupTest2.txt

#Total Asserts in com.thoughtworks.xstream.core/DefaultConverterLookupTest=============2
#Total Tests in com.thoughtworks.xstream.core/DefaultConverterLookupTest=============0
