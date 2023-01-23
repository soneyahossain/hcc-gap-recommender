#!/bin/bash

echo "computing slice for PieChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/PieChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/PieChartTest.trace org.jfree.chart.PieChartTest.testReplaceDatasetOnPieChart:82:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/PieChartTest/PieChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/PieChartTest.trace org.jfree.chart.PieChartTest.testReplaceDatasetOnPieChart:83:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/PieChartTest/PieChartTest2.txt

#Total Asserts in org.jfree.chart/PieChartTest=============2
#Total Tests in org.jfree.chart/PieChartTest=============0
