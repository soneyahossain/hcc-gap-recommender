#!/bin/bash

echo "computing slice for IncrementalWritingTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/incr_slices/IncrementalWritingTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/incr_traces/IncrementalWritingTest.trace com.fasterxml.jackson.dataformat.xml.incr.IncrementalWritingTest.testSimple:29:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/incr_slices/IncrementalWritingTest/IncrementalWritingTest1.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.incr/IncrementalWritingTest=============1
#Total Tests in com.fasterxml.jackson.dataformat.xml.incr/IncrementalWritingTest=============0
