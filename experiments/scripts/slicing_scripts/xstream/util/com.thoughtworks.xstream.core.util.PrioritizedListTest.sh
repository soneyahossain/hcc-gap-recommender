#!/bin/bash

echo "computing slice for PrioritizedListTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/PrioritizedListTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/PrioritizedListTest.trace com.thoughtworks.xstream.core.util.PrioritizedListTest.assertNextEquals:21:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/PrioritizedListTest/PrioritizedListTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/PrioritizedListTest.trace com.thoughtworks.xstream.core.util.PrioritizedListTest.assertNextEquals:22:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/PrioritizedListTest/PrioritizedListTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/PrioritizedListTest.trace com.thoughtworks.xstream.core.util.PrioritizedListTest.assertNoMore:26:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/PrioritizedListTest/PrioritizedListTest3.txt

#Total Asserts in com.thoughtworks.xstream.core.util/PrioritizedListTest=============3
#Total Tests in com.thoughtworks.xstream.core.util/PrioritizedListTest=============0
