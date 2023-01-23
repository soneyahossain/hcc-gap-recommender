#!/bin/bash

echo "computing slice for PureJavaReflectionProviderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/PureJavaReflectionProviderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/PureJavaReflectionProviderTest.trace >$HCC_EXPERIMENTS/slices/xstream/reflection_slices/PureJavaReflectionProviderTest/PureJavaReflectionProviderTest.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/PureJavaReflectionProviderTest=============0
#Total Tests in com.thoughtworks.xstream.converters.reflection/PureJavaReflectionProviderTest=============0
