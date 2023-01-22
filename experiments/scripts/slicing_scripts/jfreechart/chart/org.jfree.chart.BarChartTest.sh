#!/bin/bash

echo "computing slice for BarChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/BarChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/BarChartTest.trace org.jfree.chart.BarChartTest.testReplaceDataset:124:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/BarChartTest/BarChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/BarChartTest.trace org.jfree.chart.BarChartTest.testReplaceDataset:127:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/BarChartTest/BarChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/BarChartTest.trace org.jfree.chart.BarChartTest.testReplaceDataset:129:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/BarChartTest/BarChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/BarChartTest.trace org.jfree.chart.BarChartTest.testSetSeriesToolTipGenerator:146:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/BarChartTest/BarChartTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/BarChartTest.trace org.jfree.chart.BarChartTest.testSetSeriesURLGenerator:161:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/BarChartTest/BarChartTest5.txt

#Total Asserts in org.jfree.chart/BarChartTest=============5
#Total Tests in org.jfree.chart/BarChartTest=============0
