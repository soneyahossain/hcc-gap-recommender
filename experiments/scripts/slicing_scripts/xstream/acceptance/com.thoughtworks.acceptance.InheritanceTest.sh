#!/bin/bash

echo "computing slice for InheritanceTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/InheritanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/InheritanceTest.trace com.thoughtworks.acceptance.InheritanceTest.testInheritanceHidingPrivateFieldOfSameName:82:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/InheritanceTest/InheritanceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/InheritanceTest.trace com.thoughtworks.acceptance.InheritanceTest.testInheritanceHidingPrivateFieldOfSameName:83:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/InheritanceTest/InheritanceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/InheritanceTest.trace com.thoughtworks.acceptance.InheritanceTest.testHandlesStaticFieldInChildDoesNotHideFieldInParent:115:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/InheritanceTest/InheritanceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/InheritanceTest.trace com.thoughtworks.acceptance.InheritanceTest.testHandlesStaticFieldInChildDoesNotHideFieldInParent:116:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/InheritanceTest/InheritanceTest4.txt

#Total Asserts in com.thoughtworks.acceptance/InheritanceTest=============4
#Total Tests in com.thoughtworks.acceptance/InheritanceTest=============0
