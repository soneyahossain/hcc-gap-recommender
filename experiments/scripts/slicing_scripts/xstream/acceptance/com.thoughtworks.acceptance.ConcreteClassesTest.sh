#!/bin/bash

echo "computing slice for ConcreteClassesTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ConcreteClassesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ConcreteClassesTest.trace com.thoughtworks.acceptance.ConcreteClassesTest.testCustomInterfaceCanHaveMultipleImplementations:93:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ConcreteClassesTest/ConcreteClassesTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ConcreteClassesTest.trace com.thoughtworks.acceptance.ConcreteClassesTest.testCustomInterfaceCanHaveMultipleImplementations:96:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ConcreteClassesTest/ConcreteClassesTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ConcreteClassesTest.trace com.thoughtworks.acceptance.ConcreteClassesTest.testCustomInterfaceCanHaveMultipleImplementations:97:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ConcreteClassesTest/ConcreteClassesTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ConcreteClassesTest.trace com.thoughtworks.acceptance.ConcreteClassesTest.testCustomInterfaceCanHaveMultipleImplementations:98:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ConcreteClassesTest/ConcreteClassesTest4.txt

#Total Asserts in com.thoughtworks.acceptance/ConcreteClassesTest=============4
#Total Tests in com.thoughtworks.acceptance/ConcreteClassesTest=============0
