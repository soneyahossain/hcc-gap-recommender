#!/bin/bash

echo "computing slice for ImplicitArrayTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitArrayTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitArrayTest.trace com.thoughtworks.acceptance.ImplicitArrayTest.testMultipleArraysBasedOnDifferentType:311:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitArrayTest/ImplicitArrayTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitArrayTest.trace com.thoughtworks.acceptance.ImplicitArrayTest.testMultipleArraysBasedOnDifferentType:312:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitArrayTest/ImplicitArrayTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitArrayTest.trace com.thoughtworks.acceptance.ImplicitArrayTest.testArraysWithDerivedElements:348:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitArrayTest/ImplicitArrayTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitArrayTest.trace com.thoughtworks.acceptance.ImplicitArrayTest.testCanBeDeclaredOnlyForMatchingType:433:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitArrayTest/ImplicitArrayTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitArrayTest.trace com.thoughtworks.acceptance.ImplicitArrayTest.testCanBeDeclaredOnlyForMatchingComponentType:442:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitArrayTest/ImplicitArrayTest5.txt

#Total Asserts in com.thoughtworks.acceptance/ImplicitArrayTest=============5
#Total Tests in com.thoughtworks.acceptance/ImplicitArrayTest=============0
