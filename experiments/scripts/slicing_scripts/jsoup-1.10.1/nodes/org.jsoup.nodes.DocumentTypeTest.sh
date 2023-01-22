#!/bin/bash

echo "computing slice for DocumentTypeTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/DocumentTypeTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/DocumentTypeTest.trace org.jsoup.nodes.DocumentTypeTest.outerHtmlGeneration:30:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/DocumentTypeTest/DocumentTypeTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/DocumentTypeTest.trace org.jsoup.nodes.DocumentTypeTest.outerHtmlGeneration:33:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/DocumentTypeTest/DocumentTypeTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/DocumentTypeTest.trace org.jsoup.nodes.DocumentTypeTest.outerHtmlGeneration:36:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/DocumentTypeTest/DocumentTypeTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/DocumentTypeTest.trace org.jsoup.nodes.DocumentTypeTest.outerHtmlGeneration:39:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/DocumentTypeTest/DocumentTypeTest4.txt

#Total Asserts in org.jsoup.nodes/DocumentTypeTest=============4
#Total Tests in org.jsoup.nodes/DocumentTypeTest=============0
