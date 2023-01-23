#!/bin/bash

echo "computing slice for XYStepChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepChartTest.trace org.jfree.chart.XYStepChartTest.testReplaceDataset:118:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepChartTest/XYStepChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepChartTest.trace org.jfree.chart.XYStepChartTest.testReplaceDataset:121:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepChartTest/XYStepChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepChartTest.trace org.jfree.chart.XYStepChartTest.testReplaceDataset:123:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepChartTest/XYStepChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepChartTest.trace org.jfree.chart.XYStepChartTest.testSetSeriesToolTipGenerator:139:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepChartTest/XYStepChartTest4.txt

#Total Asserts in org.jfree.chart/XYStepChartTest=============4
#Total Tests in org.jfree.chart/XYStepChartTest=============0
