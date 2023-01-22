#!/bin/bash

echo "computing slice for ReflectionClassesTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ReflectionClassesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ReflectionClassesTest.trace com.thoughtworks.acceptance.ReflectionClassesTest.testReflectionFieldMigrationFrom13:128:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ReflectionClassesTest/ReflectionClassesTest1.txt

#Total Asserts in com.thoughtworks.acceptance/ReflectionClassesTest=============1
#Total Tests in com.thoughtworks.acceptance/ReflectionClassesTest=============0
