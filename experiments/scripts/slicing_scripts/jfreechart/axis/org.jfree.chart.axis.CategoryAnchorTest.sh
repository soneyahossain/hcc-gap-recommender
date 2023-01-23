#!/bin/bash

echo "computing slice for CategoryAnchorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testEquals:63:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testEquals:65:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testHashCode:75:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testHashCode:78:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testSerialization:88:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/CategoryAnchorTest.trace org.jfree.chart.axis.CategoryAnchorTest.testSerialization:89:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/CategoryAnchorTest/CategoryAnchorTest9.txt

#Total Asserts in org.jfree.chart.axis/CategoryAnchorTest=============9
#Total Tests in org.jfree.chart.axis/CategoryAnchorTest=============0
