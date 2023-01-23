#!/bin/bash

echo "computing slice for DynamicProxyTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/DynamicProxyTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/DynamicProxyTest.trace com.thoughtworks.acceptance.DynamicProxyTest.testTypeCanBeAliased:78:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/DynamicProxyTest/DynamicProxyTest1.txt

#Total Asserts in com.thoughtworks.acceptance/DynamicProxyTest=============1
#Total Tests in com.thoughtworks.acceptance/DynamicProxyTest=============0
