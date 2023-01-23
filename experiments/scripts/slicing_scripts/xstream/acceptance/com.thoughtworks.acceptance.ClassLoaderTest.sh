#!/bin/bash

echo "computing slice for ClassLoaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ClassLoaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ClassLoaderTest.trace com.thoughtworks.acceptance.ClassLoaderTest.testAllowsClassLoaderToBeOverriden:32:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ClassLoaderTest/ClassLoaderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ClassLoaderTest.trace com.thoughtworks.acceptance.ClassLoaderTest.testAllowsClassLoaderToBeOverriden:45:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ClassLoaderTest/ClassLoaderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ClassLoaderTest.trace com.thoughtworks.acceptance.ClassLoaderTest.testAllowsClassLoaderToBeOverriden:51:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ClassLoaderTest/ClassLoaderTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ClassLoaderTest.trace com.thoughtworks.acceptance.ClassLoaderTest.testAllowsClassLoaderToBeOverriden:59:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ClassLoaderTest/ClassLoaderTest4.txt

#Total Asserts in com.thoughtworks.acceptance/ClassLoaderTest=============4
#Total Tests in com.thoughtworks.acceptance/ClassLoaderTest=============0
