#!/bin/bash

echo "computing slice for ItemLabelAnchorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/labels_slices/ItemLabelAnchorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/ItemLabelAnchorTest.trace org.jfree.chart.labels.ItemLabelAnchorTest.testEquals:59:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/ItemLabelAnchorTest/ItemLabelAnchorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/ItemLabelAnchorTest.trace org.jfree.chart.labels.ItemLabelAnchorTest.testEquals:60:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/ItemLabelAnchorTest/ItemLabelAnchorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/ItemLabelAnchorTest.trace org.jfree.chart.labels.ItemLabelAnchorTest.testSerialization:70:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/ItemLabelAnchorTest/ItemLabelAnchorTest3.txt

#Total Asserts in org.jfree.chart.labels/ItemLabelAnchorTest=============3
#Total Tests in org.jfree.chart.labels/ItemLabelAnchorTest=============0
