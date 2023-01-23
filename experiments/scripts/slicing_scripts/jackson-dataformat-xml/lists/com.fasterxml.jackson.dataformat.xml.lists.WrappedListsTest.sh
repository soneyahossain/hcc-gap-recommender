#!/bin/bash

echo "computing slice for WrappedListsTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/WrappedListsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/WrappedListsTest.trace com.fasterxml.jackson.dataformat.xml.lists.WrappedListsTest.testEmptyList:36:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/WrappedListsTest/WrappedListsTest1.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/WrappedListsTest=============1
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/WrappedListsTest=============0
