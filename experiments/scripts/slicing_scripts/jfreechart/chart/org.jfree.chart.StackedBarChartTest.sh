#!/bin/bash

echo "computing slice for StackedBarChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedBarChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedBarChartTest.trace org.jfree.chart.StackedBarChartTest.testReplaceDataset:125:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedBarChartTest/StackedBarChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedBarChartTest.trace org.jfree.chart.StackedBarChartTest.testReplaceDataset:128:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedBarChartTest/StackedBarChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedBarChartTest.trace org.jfree.chart.StackedBarChartTest.testReplaceDataset:130:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedBarChartTest/StackedBarChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedBarChartTest.trace org.jfree.chart.StackedBarChartTest.testSetSeriesToolTipGenerator:147:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedBarChartTest/StackedBarChartTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/StackedBarChartTest.trace org.jfree.chart.StackedBarChartTest.testSetSeriesURLGenerator:162:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/StackedBarChartTest/StackedBarChartTest5.txt

#Total Asserts in org.jfree.chart/StackedBarChartTest=============5
#Total Tests in org.jfree.chart/StackedBarChartTest=============0
