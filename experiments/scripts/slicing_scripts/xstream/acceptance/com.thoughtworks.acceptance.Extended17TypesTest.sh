#!/bin/bash

echo "computing slice for Extended17TypesTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended17TypesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended17TypesTest.trace >$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended17TypesTest/Extended17TypesTest.txt

#Total Asserts in com.thoughtworks.acceptance/Extended17TypesTest=============0
#Total Tests in com.thoughtworks.acceptance/Extended17TypesTest=============0
