#!/bin/bash

echo "computing slice for OrderRetainingMapTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/OrderRetainingMapTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/OrderRetainingMapTest.trace com.thoughtworks.xstream.core.util.OrderRetainingMapTest.assertNextEquals:23:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/OrderRetainingMapTest/OrderRetainingMapTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/OrderRetainingMapTest.trace com.thoughtworks.xstream.core.util.OrderRetainingMapTest.assertNextEquals:24:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/OrderRetainingMapTest/OrderRetainingMapTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/OrderRetainingMapTest.trace com.thoughtworks.xstream.core.util.OrderRetainingMapTest.assertNextEntryEquals:28:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/OrderRetainingMapTest/OrderRetainingMapTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/OrderRetainingMapTest.trace com.thoughtworks.xstream.core.util.OrderRetainingMapTest.assertNextEntryEquals:30:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/OrderRetainingMapTest/OrderRetainingMapTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/OrderRetainingMapTest.trace com.thoughtworks.xstream.core.util.OrderRetainingMapTest.assertNextEntryEquals:31:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/OrderRetainingMapTest/OrderRetainingMapTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/OrderRetainingMapTest.trace com.thoughtworks.xstream.core.util.OrderRetainingMapTest.assertNoMore:35:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/OrderRetainingMapTest/OrderRetainingMapTest6.txt

#Total Asserts in com.thoughtworks.xstream.core.util/OrderRetainingMapTest=============6
#Total Tests in com.thoughtworks.xstream.core.util/OrderRetainingMapTest=============0
