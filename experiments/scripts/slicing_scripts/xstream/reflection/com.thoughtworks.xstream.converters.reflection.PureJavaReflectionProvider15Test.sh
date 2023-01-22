#!/bin/bash

echo "computing slice for PureJavaReflectionProvider15Test"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/PureJavaReflectionProvider15Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/PureJavaReflectionProvider15Test.trace com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider15Test.testWriteToFinalField:44:*>$HCC_EXPERIMENTS/slices/xstream/reflection_slices/PureJavaReflectionProvider15Test/PureJavaReflectionProvider15Test.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/PureJavaReflectionProvider15Test=============1
#Total Tests in com.thoughtworks.xstream.converters.reflection/PureJavaReflectionProvider15Test=============0
