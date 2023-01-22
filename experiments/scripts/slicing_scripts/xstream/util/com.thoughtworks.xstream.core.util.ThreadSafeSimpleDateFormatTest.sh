#!/bin/bash

echo "computing slice for ThreadSafeSimpleDateFormatTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/ThreadSafeSimpleDateFormatTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ThreadSafeSimpleDateFormatTest.trace com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormatTest.run:55:*,com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormatTest.run:95:*,com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormatTest.run:96:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ThreadSafeSimpleDateFormatTest/ThreadSafeSimpleDateFormatTest.txt

#Total Asserts in com.thoughtworks.xstream.core.util/ThreadSafeSimpleDateFormatTest=============3
#Total Tests in com.thoughtworks.xstream.core.util/ThreadSafeSimpleDateFormatTest=============0
