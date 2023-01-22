#!/bin/bash

echo "computing slice for EmptyListDeserTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/EmptyListDeserTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/EmptyListDeserTest.trace com.fasterxml.jackson.dataformat.xml.lists.EmptyListDeserTest.testEmptyList:41:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/EmptyListDeserTest/EmptyListDeserTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/EmptyListDeserTest.trace com.fasterxml.jackson.dataformat.xml.lists.EmptyListDeserTest.testEmptyList:42:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/EmptyListDeserTest/EmptyListDeserTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/EmptyListDeserTest.trace com.fasterxml.jackson.dataformat.xml.lists.EmptyListDeserTest.testEmptyList:43:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/EmptyListDeserTest/EmptyListDeserTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/EmptyListDeserTest.trace com.fasterxml.jackson.dataformat.xml.lists.EmptyListDeserTest.testEmptyList:44:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/EmptyListDeserTest/EmptyListDeserTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/EmptyListDeserTest.trace com.fasterxml.jackson.dataformat.xml.lists.EmptyListDeserTest.testEmptyList:45:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/EmptyListDeserTest/EmptyListDeserTest5.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/EmptyListDeserTest=============5
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/EmptyListDeserTest=============0
