#!/bin/bash

echo "computing slice for MapTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/MapTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/MapTest.trace com.thoughtworks.acceptance.MapTest.testLinkedHashMapRetainsOrdering:160:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/MapTest/MapTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/MapTest.trace com.thoughtworks.acceptance.MapTest.testLinkedHashMapRetainsOrdering:161:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/MapTest/MapTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/MapTest.trace com.thoughtworks.acceptance.MapTest.testLinkedHashMapRetainsOrdering:162:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/MapTest/MapTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/MapTest.trace com.thoughtworks.acceptance.MapTest.testSubclassesOfMapAreHandled:195:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/MapTest/MapTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/MapTest.trace com.thoughtworks.acceptance.MapTest.testEmptyMapIsSingleton:246:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/MapTest/MapTest5.txt

#Total Asserts in com.thoughtworks.acceptance/MapTest=============5
#Total Tests in com.thoughtworks.acceptance/MapTest=============0
