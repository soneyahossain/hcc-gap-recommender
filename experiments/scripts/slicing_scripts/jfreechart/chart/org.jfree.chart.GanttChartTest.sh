#!/bin/bash

echo "computing slice for GanttChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/GanttChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/GanttChartTest.trace org.jfree.chart.GanttChartTest.testReplaceDataset:125:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/GanttChartTest/GanttChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/GanttChartTest.trace org.jfree.chart.GanttChartTest.testSetSeriesToolTipGenerator:140:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/GanttChartTest/GanttChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/GanttChartTest.trace org.jfree.chart.GanttChartTest.testSetSeriesURLGenerator:155:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/GanttChartTest/GanttChartTest3.txt

#Total Asserts in org.jfree.chart/GanttChartTest=============3
#Total Tests in org.jfree.chart/GanttChartTest=============0
