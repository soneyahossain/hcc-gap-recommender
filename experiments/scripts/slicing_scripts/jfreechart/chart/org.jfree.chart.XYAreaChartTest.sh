#!/bin/bash

echo "computing slice for XYAreaChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYAreaChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYAreaChartTest.trace org.jfree.chart.XYAreaChartTest.testReplaceDataset:117:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYAreaChartTest/XYAreaChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYAreaChartTest.trace org.jfree.chart.XYAreaChartTest.testReplaceDataset:120:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYAreaChartTest/XYAreaChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYAreaChartTest.trace org.jfree.chart.XYAreaChartTest.testReplaceDataset:122:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYAreaChartTest/XYAreaChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYAreaChartTest.trace org.jfree.chart.XYAreaChartTest.testSetSeriesToolTipGenerator:138:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYAreaChartTest/XYAreaChartTest4.txt

#Total Asserts in org.jfree.chart/XYAreaChartTest=============4
#Total Tests in org.jfree.chart/XYAreaChartTest=============0
