#!/bin/bash

echo "computing slice for EmptyPolymorphicTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/EmptyPolymorphicTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/EmptyPolymorphicTest.trace com.fasterxml.jackson.dataformat.xml.misc.EmptyPolymorphicTest.testEmpty:44:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/EmptyPolymorphicTest/EmptyPolymorphicTest1.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.misc/EmptyPolymorphicTest=============1
#Total Tests in com.fasterxml.jackson.dataformat.xml.misc/EmptyPolymorphicTest=============0
