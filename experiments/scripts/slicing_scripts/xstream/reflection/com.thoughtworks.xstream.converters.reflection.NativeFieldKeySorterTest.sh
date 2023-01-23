#!/bin/bash

echo "computing slice for NativeFieldKeySorterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/NativeFieldKeySorterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/NativeFieldKeySorterTest.trace com.thoughtworks.xstream.converters.reflection.NativeFieldKeySorterTest.testDoesSortInDeclarationOrderWithFieldsOfBaseClassFirst:44:*,com.thoughtworks.xstream.converters.reflection.NativeFieldKeySorterTest.testDoesSortInDeclarationOrderWithFieldsOfBaseClassFirst:46:*>$HCC_EXPERIMENTS/slices/xstream/reflection_slices/NativeFieldKeySorterTest/NativeFieldKeySorterTest.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/NativeFieldKeySorterTest=============2
#Total Tests in com.thoughtworks.xstream.converters.reflection/NativeFieldKeySorterTest=============0
