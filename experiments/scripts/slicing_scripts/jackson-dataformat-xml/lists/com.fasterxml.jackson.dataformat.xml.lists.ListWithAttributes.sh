#!/bin/bash

echo "computing slice for ListWithAttributes"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListWithAttributes

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListWithAttributes.trace com.fasterxml.jackson.dataformat.xml.lists.ListWithAttributes.testIssue43:74:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListWithAttributes/ListWithAttributes1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListWithAttributes.trace com.fasterxml.jackson.dataformat.xml.lists.ListWithAttributes.testIssue43:75:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListWithAttributes/ListWithAttributes2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListWithAttributes.trace com.fasterxml.jackson.dataformat.xml.lists.ListWithAttributes.testListWithAttributes:88:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListWithAttributes/ListWithAttributes3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListWithAttributes.trace com.fasterxml.jackson.dataformat.xml.lists.ListWithAttributes.testListWithAttributes:89:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListWithAttributes/ListWithAttributes4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListWithAttributes.trace com.fasterxml.jackson.dataformat.xml.lists.ListWithAttributes.testIdsFromAttributes:106:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListWithAttributes/ListWithAttributes5.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/ListWithAttributes=============5
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/ListWithAttributes=============0
