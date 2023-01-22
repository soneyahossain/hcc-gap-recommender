#!/bin/bash

echo "computing slice for CustomXYItemLabelGeneratorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/labels_slices/CustomXYItemLabelGeneratorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/CustomXYItemLabelGeneratorTest.trace org.jfree.chart.labels.CustomXYItemLabelGeneratorTest.testCloning:67:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/CustomXYItemLabelGeneratorTest/CustomXYItemLabelGeneratorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/CustomXYItemLabelGeneratorTest.trace org.jfree.chart.labels.CustomXYItemLabelGeneratorTest.testCloning:68:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/CustomXYItemLabelGeneratorTest/CustomXYItemLabelGeneratorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/CustomXYItemLabelGeneratorTest.trace org.jfree.chart.labels.CustomXYItemLabelGeneratorTest.testCloning:69:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/CustomXYItemLabelGeneratorTest/CustomXYItemLabelGeneratorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/CustomXYItemLabelGeneratorTest.trace org.jfree.chart.labels.CustomXYItemLabelGeneratorTest.testPublicCloneable:78:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/CustomXYItemLabelGeneratorTest/CustomXYItemLabelGeneratorTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/labels_traces/CustomXYItemLabelGeneratorTest.trace org.jfree.chart.labels.CustomXYItemLabelGeneratorTest.testSerialization:101:*>$HCC_EXPERIMENTS/slices/jfreechart/labels_slices/CustomXYItemLabelGeneratorTest/CustomXYItemLabelGeneratorTest5.txt

#Total Asserts in org.jfree.chart.labels/CustomXYItemLabelGeneratorTest=============5
#Total Tests in org.jfree.chart.labels/CustomXYItemLabelGeneratorTest=============0
