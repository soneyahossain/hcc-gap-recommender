#!/bin/bash

echo "computing slice for HierarchicalStreamCopierTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/copy_slices/HierarchicalStreamCopierTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/copy_traces/HierarchicalStreamCopierTest.trace com.thoughtworks.xstream.io.copy.HierarchicalStreamCopierTest.testSkipsValueIfEmpty:59:*>$HCC_EXPERIMENTS/slices/xstream/copy_slices/HierarchicalStreamCopierTest/HierarchicalStreamCopierTest1.txt

#Total Asserts in com.thoughtworks.xstream.io.copy/HierarchicalStreamCopierTest=============1
#Total Tests in com.thoughtworks.xstream.io.copy/HierarchicalStreamCopierTest=============0
