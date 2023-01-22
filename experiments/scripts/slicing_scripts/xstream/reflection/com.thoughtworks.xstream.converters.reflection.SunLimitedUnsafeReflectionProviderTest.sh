#!/bin/bash

echo "computing slice for SunLimitedUnsafeReflectionProviderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/SunLimitedUnsafeReflectionProviderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/SunLimitedUnsafeReflectionProviderTest.trace >$HCC_EXPERIMENTS/slices/xstream/reflection_slices/SunLimitedUnsafeReflectionProviderTest/SunLimitedUnsafeReflectionProviderTest.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/SunLimitedUnsafeReflectionProviderTest=============0
#Total Tests in com.thoughtworks.xstream.converters.reflection/SunLimitedUnsafeReflectionProviderTest=============0
