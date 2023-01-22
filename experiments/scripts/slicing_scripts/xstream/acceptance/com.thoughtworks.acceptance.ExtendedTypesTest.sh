#!/bin/bash

echo "computing slice for ExtendedTypesTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ExtendedTypesTest.trace com.thoughtworks.acceptance.ExtendedTypesTest.testFile:98:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest/ExtendedTypesTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ExtendedTypesTest.trace com.thoughtworks.acceptance.ExtendedTypesTest.testFile:105:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest/ExtendedTypesTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ExtendedTypesTest.trace com.thoughtworks.acceptance.ExtendedTypesTest.assertFilesBothWay:112:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest/ExtendedTypesTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ExtendedTypesTest.trace com.thoughtworks.acceptance.ExtendedTypesTest.assertFilesBothWay:114:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest/ExtendedTypesTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ExtendedTypesTest.trace com.thoughtworks.acceptance.ExtendedTypesTest.assertFilesBothWay:115:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest/ExtendedTypesTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ExtendedTypesTest.trace com.thoughtworks.acceptance.ExtendedTypesTest.assertFilesBothWay:118:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest/ExtendedTypesTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ExtendedTypesTest.trace com.thoughtworks.acceptance.ExtendedTypesTest.assertFilesBothWay:119:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ExtendedTypesTest/ExtendedTypesTest7.txt

#Total Asserts in com.thoughtworks.acceptance/ExtendedTypesTest=============7
#Total Tests in com.thoughtworks.acceptance/ExtendedTypesTest=============0
