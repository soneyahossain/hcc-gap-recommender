#!/bin/bash

echo "computing slice for WriteReplaceTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/WriteReplaceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/WriteReplaceTest.trace com.thoughtworks.acceptance.WriteReplaceTest.testReplacesAndResolves:69:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/WriteReplaceTest/WriteReplaceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/WriteReplaceTest.trace com.thoughtworks.acceptance.WriteReplaceTest.testAllowsDifferentTypeToBeSubstitutedWithNonExistingClass:174:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/WriteReplaceTest/WriteReplaceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/WriteReplaceTest.trace com.thoughtworks.acceptance.WriteReplaceTest.testAllowsDifferentTypeToBeSubstitutedWithNonExistingClassInList:191:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/WriteReplaceTest/WriteReplaceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/WriteReplaceTest.trace com.thoughtworks.acceptance.WriteReplaceTest.testAllowsDifferentTypeToBeSubstitutedWithNonExistingClassAsMember:209:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/WriteReplaceTest/WriteReplaceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/WriteReplaceTest.trace com.thoughtworks.acceptance.WriteReplaceTest.testAllowsDifferentTypeToBeSubstitutedWithNonExistingClassInExternalizable:227:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/WriteReplaceTest/WriteReplaceTest5.txt

#Total Asserts in com.thoughtworks.acceptance/WriteReplaceTest=============5
#Total Tests in com.thoughtworks.acceptance/WriteReplaceTest=============0
