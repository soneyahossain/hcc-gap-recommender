#!/bin/bash

echo "computing slice for QuickWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/QuickWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/QuickWriterTest.trace com.thoughtworks.xstream.core.util.QuickWriterTest.testUnbuffered:27:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/QuickWriterTest/QuickWriterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/QuickWriterTest.trace com.thoughtworks.xstream.core.util.QuickWriterTest.testUnbuffered:29:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/QuickWriterTest/QuickWriterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/QuickWriterTest.trace com.thoughtworks.xstream.core.util.QuickWriterTest.testUnbuffered:31:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/QuickWriterTest/QuickWriterTest3.txt

#Total Asserts in com.thoughtworks.xstream.core.util/QuickWriterTest=============3
#Total Tests in com.thoughtworks.xstream.core.util/QuickWriterTest=============0
