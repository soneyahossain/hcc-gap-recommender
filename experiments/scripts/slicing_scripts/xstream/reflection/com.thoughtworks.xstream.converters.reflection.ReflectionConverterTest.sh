#!/bin/bash

echo "computing slice for ReflectionConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/ReflectionConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/ReflectionConverterTest.trace com.thoughtworks.xstream.converters.reflection.ReflectionConverterTest.testSerializesAllPrimitiveFieldsInACustomObject:71:*,com.thoughtworks.xstream.converters.reflection.ReflectionConverterTest.testDoesNotSerializeTransientOrStaticFields:97:*,com.thoughtworks.xstream.converters.reflection.ReflectionConverterTest.testCanBeOverloadedToDeserializeTransientFields:124:*,com.thoughtworks.xstream.converters.reflection.ReflectionConverterTest.testCustomConverterCanBeInstantiatedAndRegisteredWithDesiredPriority:156:*>$HCC_EXPERIMENTS/slices/xstream/reflection_slices/ReflectionConverterTest/ReflectionConverterTest.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/ReflectionConverterTest=============4
#Total Tests in com.thoughtworks.xstream.converters.reflection/ReflectionConverterTest=============0
