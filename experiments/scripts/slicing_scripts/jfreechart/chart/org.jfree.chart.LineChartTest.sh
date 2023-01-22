#!/bin/bash

echo "computing slice for LineChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LineChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LineChartTest.trace org.jfree.chart.LineChartTest.testReplaceDataset:116:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LineChartTest/LineChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LineChartTest.trace org.jfree.chart.LineChartTest.testReplaceDataset:119:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LineChartTest/LineChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LineChartTest.trace org.jfree.chart.LineChartTest.testReplaceDataset:121:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LineChartTest/LineChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LineChartTest.trace org.jfree.chart.LineChartTest.testSetSeriesToolTipGenerator:138:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LineChartTest/LineChartTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LineChartTest.trace org.jfree.chart.LineChartTest.testSetSeriesURLGenerator:153:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LineChartTest/LineChartTest5.txt

#Total Asserts in org.jfree.chart/LineChartTest=============5
#Total Tests in org.jfree.chart/LineChartTest=============0
