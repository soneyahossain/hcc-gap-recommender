#!/bin/bash

echo "computing slice for AbstractReflectionProviderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/AbstractReflectionProviderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/AbstractReflectionProviderTest.trace >$HCC_EXPERIMENTS/slices/xstream/reflection_slices/AbstractReflectionProviderTest/AbstractReflectionProviderTest.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/AbstractReflectionProviderTest=============0
#Total Tests in com.thoughtworks.xstream.converters.reflection/AbstractReflectionProviderTest=============0
