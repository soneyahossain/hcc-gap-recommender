#!/bin/bash

echo "computing slice for ListSerializationTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListSerializationTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListSerializationTest.trace com.fasterxml.jackson.dataformat.xml.lists.ListSerializationTest.testSimpleWrappedList:59:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListSerializationTest/ListSerializationTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListSerializationTest.trace com.fasterxml.jackson.dataformat.xml.lists.ListSerializationTest.testStringList:67:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListSerializationTest/ListSerializationTest2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/ListSerializationTest=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/ListSerializationTest=============0
