#!/bin/bash

echo "computing slice for ListDeser191Test"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListDeser191Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListDeser191Test.trace com.fasterxml.jackson.dataformat.xml.lists.ListDeser191Test.testListDeser:36:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListDeser191Test/ListDeser191Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListDeser191Test.trace com.fasterxml.jackson.dataformat.xml.lists.ListDeser191Test.testListDeser:37:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListDeser191Test/ListDeser191Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListDeser191Test.trace com.fasterxml.jackson.dataformat.xml.lists.ListDeser191Test.testListDeser:38:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListDeser191Test/ListDeser191Test3.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/ListDeser191Test=============3
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/ListDeser191Test=============0
