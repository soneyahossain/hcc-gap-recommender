#!/bin/bash

echo "computing slice for TimeSeriesChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/TimeSeriesChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/TimeSeriesChartTest.trace org.jfree.chart.TimeSeriesChartTest.testReplaceDataset:117:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/TimeSeriesChartTest/TimeSeriesChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/TimeSeriesChartTest.trace org.jfree.chart.TimeSeriesChartTest.testReplaceDataset:120:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/TimeSeriesChartTest/TimeSeriesChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/TimeSeriesChartTest.trace org.jfree.chart.TimeSeriesChartTest.testReplaceDataset:122:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/TimeSeriesChartTest/TimeSeriesChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/TimeSeriesChartTest.trace org.jfree.chart.TimeSeriesChartTest.testSetSeriesToolTipGenerator:138:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/TimeSeriesChartTest/TimeSeriesChartTest4.txt

#Total Asserts in org.jfree.chart/TimeSeriesChartTest=============4
#Total Tests in org.jfree.chart/TimeSeriesChartTest=============0
