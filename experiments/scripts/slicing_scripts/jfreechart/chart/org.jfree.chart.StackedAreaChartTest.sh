#!/bin/bash

echo "computing slice for StackedAreaChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedAreaChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedAreaChartTest.trace org.jfree.chart.StackedAreaChartTest.testReplaceDataset:119:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedAreaChartTest/StackedAreaChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedAreaChartTest.trace org.jfree.chart.StackedAreaChartTest.testReplaceDataset:122:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedAreaChartTest/StackedAreaChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedAreaChartTest.trace org.jfree.chart.StackedAreaChartTest.testReplaceDataset:124:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedAreaChartTest/StackedAreaChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedAreaChartTest.trace org.jfree.chart.StackedAreaChartTest.testSetSeriesToolTipGenerator:141:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedAreaChartTest/StackedAreaChartTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedAreaChartTest.trace org.jfree.chart.StackedAreaChartTest.testSetSeriesURLGenerator:156:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedAreaChartTest/StackedAreaChartTest5.txt

#Total Asserts in org.jfree.chart/StackedAreaChartTest=============5
#Total Tests in org.jfree.chart/StackedAreaChartTest=============0
