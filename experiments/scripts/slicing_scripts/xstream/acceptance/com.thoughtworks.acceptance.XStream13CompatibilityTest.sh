#!/bin/bash

echo "computing slice for XStream13CompatibilityTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/XStream13CompatibilityTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/XStream13CompatibilityTest.trace com.thoughtworks.acceptance.XStream13CompatibilityTest.testCanReadOldTreeSet:34:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/XStream13CompatibilityTest/XStream13CompatibilityTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/XStream13CompatibilityTest.trace com.thoughtworks.acceptance.XStream13CompatibilityTest.testCanReadOldTreeMap:53:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/XStream13CompatibilityTest/XStream13CompatibilityTest2.txt

#Total Asserts in com.thoughtworks.acceptance/XStream13CompatibilityTest=============2
#Total Tests in com.thoughtworks.acceptance/XStream13CompatibilityTest=============0
