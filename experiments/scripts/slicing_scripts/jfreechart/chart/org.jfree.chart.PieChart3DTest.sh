#!/bin/bash

echo "computing slice for PieChart3DTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/PieChart3DTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/PieChart3DTest.trace org.jfree.chart.PieChart3DTest.testReplaceDatasetOnPieChart:88:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/PieChart3DTest/PieChart3DTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/PieChart3DTest.trace org.jfree.chart.PieChart3DTest.testReplaceDatasetOnPieChart:89:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/PieChart3DTest/PieChart3DTest2.txt

#Total Asserts in org.jfree.chart/PieChart3DTest=============2
#Total Tests in org.jfree.chart/PieChart3DTest=============0
