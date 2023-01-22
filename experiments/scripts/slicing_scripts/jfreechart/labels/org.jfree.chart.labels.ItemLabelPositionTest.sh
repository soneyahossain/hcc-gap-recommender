#!/bin/bash

echo "computing slice for ItemLabelPositionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/labels_slices/ItemLabelPositionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/ItemLabelPositionTest.trace org.jfree.chart.labels.ItemLabelPositionTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/ItemLabelPositionTest/ItemLabelPositionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/ItemLabelPositionTest.trace org.jfree.chart.labels.ItemLabelPositionTest.testSerialization:71:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/ItemLabelPositionTest/ItemLabelPositionTest2.txt

#Total Asserts in org.jfree.chart.labels/ItemLabelPositionTest=============2
#Total Tests in org.jfree.chart.labels/ItemLabelPositionTest=============0
