#!/bin/bash

echo "computing slice for ImplicitMapTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitMapTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ImplicitMapTest.trace com.thoughtworks.acceptance.ImplicitMapTest.testWithEMPTY_MAP:321:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ImplicitMapTest/ImplicitMapTest1.txt

#Total Asserts in com.thoughtworks.acceptance/ImplicitMapTest=============1
#Total Tests in com.thoughtworks.acceptance/ImplicitMapTest=============0
