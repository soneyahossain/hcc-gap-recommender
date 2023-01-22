#!/bin/bash

echo "computing slice for SortableFieldListTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SortableFieldListTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SortableFieldListTest.trace >$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SortableFieldListTest/SortableFieldListTest.txt

#Total Asserts in com.thoughtworks.acceptance/SortableFieldListTest=============0
#Total Tests in com.thoughtworks.acceptance/SortableFieldListTest=============0
