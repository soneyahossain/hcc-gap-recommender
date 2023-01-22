#!/bin/bash

echo "computing slice for ThrowableConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/extended_slices/ThrowableConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ThrowableConverterTest.trace com.thoughtworks.xstream.converters.extended.ThrowableConverterTest.testSerializesWithNoSelfReferenceForUninitializedCauseInJdk14:93:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ThrowableConverterTest/ThrowableConverterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ThrowableConverterTest.trace com.thoughtworks.xstream.converters.extended.ThrowableConverterTest.testSerializesWithNoSelfReferenceForUninitializedCauseInJdk14:94:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ThrowableConverterTest/ThrowableConverterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ThrowableConverterTest.trace com.thoughtworks.xstream.converters.extended.ThrowableConverterTest.testSerializesWithInitializedCauseInJdk14:105:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ThrowableConverterTest/ThrowableConverterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ThrowableConverterTest.trace com.thoughtworks.xstream.converters.extended.ThrowableConverterTest.testSerializesWithInitializedCauseInJdk14:106:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ThrowableConverterTest/ThrowableConverterTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/extended_traces/ThrowableConverterTest.trace com.thoughtworks.xstream.converters.extended.ThrowableConverterTest.assertArrayEquals:134:*>$HCC_EXPERIMENTS/slices/xstream/extended_slices/ThrowableConverterTest/ThrowableConverterTest5.txt

#Total Asserts in com.thoughtworks.xstream.converters.extended/ThrowableConverterTest=============5
#Total Tests in com.thoughtworks.xstream.converters.extended/ThrowableConverterTest=============0
