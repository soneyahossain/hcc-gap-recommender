#!/bin/bash

echo "computing slice for SunUnsafeReflectionProviderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/SunUnsafeReflectionProviderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/SunUnsafeReflectionProviderTest.trace com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:50:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:53:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:56:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:59:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:62:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:65:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:68:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:71:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:74:*,com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProviderTest.testCanWriteFinalFields:77:*>$HCC_EXPERIMENTS/slices/xstream/reflection_slices/SunUnsafeReflectionProviderTest/SunUnsafeReflectionProviderTest.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/SunUnsafeReflectionProviderTest=============10
#Total Tests in com.thoughtworks.xstream.converters.reflection/SunUnsafeReflectionProviderTest=============0
