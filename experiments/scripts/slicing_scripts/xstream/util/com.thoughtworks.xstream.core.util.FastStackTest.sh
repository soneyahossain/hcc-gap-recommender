#!/bin/bash

echo "computing slice for FastStackTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/FastStackTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/FastStackTest.trace com.thoughtworks.xstream.core.util.FastStackTest.test:26:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/FastStackTest/FastStackTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/FastStackTest.trace com.thoughtworks.xstream.core.util.FastStackTest.test:27:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/FastStackTest/FastStackTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/FastStackTest.trace com.thoughtworks.xstream.core.util.FastStackTest.test:28:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/FastStackTest/FastStackTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/FastStackTest.trace com.thoughtworks.xstream.core.util.FastStackTest.test:29:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/FastStackTest/FastStackTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/FastStackTest.trace com.thoughtworks.xstream.core.util.FastStackTest.test:31:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/FastStackTest/FastStackTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/FastStackTest.trace com.thoughtworks.xstream.core.util.FastStackTest.test:32:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/FastStackTest/FastStackTest6.txt

#Total Asserts in com.thoughtworks.xstream.core.util/FastStackTest=============6
#Total Tests in com.thoughtworks.xstream.core.util/FastStackTest=============0
