#!/bin/bash

echo "computing slice for AttributeTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/AttributeTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/AttributeTest.trace org.jsoup.nodes.AttributeTest.html:10:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/AttributeTest/AttributeTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/AttributeTest.trace org.jsoup.nodes.AttributeTest.html:11:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/AttributeTest/AttributeTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/AttributeTest.trace org.jsoup.nodes.AttributeTest.testWithSupplementaryCharacterInAttributeKeyAndValue:17:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/AttributeTest/AttributeTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/AttributeTest.trace org.jsoup.nodes.AttributeTest.testWithSupplementaryCharacterInAttributeKeyAndValue:18:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/AttributeTest/AttributeTest4.txt

#Total Asserts in org.jsoup.nodes/AttributeTest=============4
#Total Tests in org.jsoup.nodes/AttributeTest=============0
