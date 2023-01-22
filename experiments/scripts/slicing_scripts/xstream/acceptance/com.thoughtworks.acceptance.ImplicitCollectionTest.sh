#!/bin/bash

echo "computing slice for ImplicitCollectionTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitCollectionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitCollectionTest.trace com.thoughtworks.acceptance.ImplicitCollectionTest.testDefaultCollectionBasedOnType:349:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitCollectionTest/ImplicitCollectionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitCollectionTest.trace com.thoughtworks.acceptance.ImplicitCollectionTest.testDefaultCollectionBasedOnType:350:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitCollectionTest/ImplicitCollectionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitCollectionTest.trace com.thoughtworks.acceptance.ImplicitCollectionTest.testWithEMPTY_LIST:363:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitCollectionTest/ImplicitCollectionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitCollectionTest.trace com.thoughtworks.acceptance.ImplicitCollectionTest.testWithDifferentDefaultImplementation:412:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitCollectionTest/ImplicitCollectionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitCollectionTest.trace com.thoughtworks.acceptance.ImplicitCollectionTest.testCanBeDeclaredOnlyForMatchingType:515:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitCollectionTest/ImplicitCollectionTest5.txt

#Total Asserts in com.thoughtworks.acceptance/ImplicitCollectionTest=============5
#Total Tests in com.thoughtworks.acceptance/ImplicitCollectionTest=============0
