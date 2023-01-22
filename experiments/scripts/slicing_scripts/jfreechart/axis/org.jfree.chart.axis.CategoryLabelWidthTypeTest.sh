#!/bin/bash

echo "computing slice for CategoryLabelWidthTypeTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryLabelWidthTypeTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryLabelWidthTypeTest.trace org.jfree.chart.axis.CategoryLabelWidthTypeTest.testEquals:59:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryLabelWidthTypeTest/CategoryLabelWidthTypeTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryLabelWidthTypeTest.trace org.jfree.chart.axis.CategoryLabelWidthTypeTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryLabelWidthTypeTest/CategoryLabelWidthTypeTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryLabelWidthTypeTest.trace org.jfree.chart.axis.CategoryLabelWidthTypeTest.testHashCode:72:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryLabelWidthTypeTest/CategoryLabelWidthTypeTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryLabelWidthTypeTest.trace org.jfree.chart.axis.CategoryLabelWidthTypeTest.testHashCode:75:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryLabelWidthTypeTest/CategoryLabelWidthTypeTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryLabelWidthTypeTest.trace org.jfree.chart.axis.CategoryLabelWidthTypeTest.testSerialization:85:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryLabelWidthTypeTest/CategoryLabelWidthTypeTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryLabelWidthTypeTest.trace org.jfree.chart.axis.CategoryLabelWidthTypeTest.testSerialization:86:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryLabelWidthTypeTest/CategoryLabelWidthTypeTest6.txt

#Total Asserts in org.jfree.chart.axis/CategoryLabelWidthTypeTest=============6
#Total Tests in org.jfree.chart.axis/CategoryLabelWidthTypeTest=============0
