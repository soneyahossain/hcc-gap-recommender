#!/bin/bash

echo "computing slice for SortableFieldKeySorterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/reflection_slices/SortableFieldKeySorterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/reflection_traces/SortableFieldKeySorterTest.trace com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorterTest.testDoesNotAffectUnregisteredTypes:30:*,com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorterTest.testIgnoresUnknownFields:40:*,com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorterTest.testIgnoresUnknownFields:42:*,com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorterTest.testComplainsIfSomeFieldIsNotSpecified:53:*,com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorterTest.testSortsMapAccordingToDefinedFieldOrder:64:*,com.thoughtworks.xstream.converters.reflection.SortableFieldKeySorterTest.testSortsMapAccordingToDefinedFieldOrder:66:*>$HCC_EXPERIMENTS/slices/xstream/reflection_slices/SortableFieldKeySorterTest/SortableFieldKeySorterTest.txt

#Total Asserts in com.thoughtworks.xstream.converters.reflection/SortableFieldKeySorterTest=============6
#Total Tests in com.thoughtworks.xstream.converters.reflection/SortableFieldKeySorterTest=============0
