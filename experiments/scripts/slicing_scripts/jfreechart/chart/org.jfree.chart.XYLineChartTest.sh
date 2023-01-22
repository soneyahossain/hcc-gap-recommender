#!/bin/bash

echo "computing slice for XYLineChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYLineChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYLineChartTest.trace org.jfree.chart.XYLineChartTest.testReplaceDataset:118:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYLineChartTest/XYLineChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYLineChartTest.trace org.jfree.chart.XYLineChartTest.testReplaceDataset:121:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYLineChartTest/XYLineChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYLineChartTest.trace org.jfree.chart.XYLineChartTest.testReplaceDataset:123:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYLineChartTest/XYLineChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYLineChartTest.trace org.jfree.chart.XYLineChartTest.testSetSeriesToolTipGenerator:139:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYLineChartTest/XYLineChartTest4.txt

#Total Asserts in org.jfree.chart/XYLineChartTest=============4
#Total Tests in org.jfree.chart/XYLineChartTest=============0
