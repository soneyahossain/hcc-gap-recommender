#!/bin/bash

echo "computing slice for ScatterPlotTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/ScatterPlotTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/ScatterPlotTest.trace org.jfree.chart.ScatterPlotTest.testReplaceDataset:118:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/ScatterPlotTest/ScatterPlotTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/ScatterPlotTest.trace org.jfree.chart.ScatterPlotTest.testReplaceDataset:121:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/ScatterPlotTest/ScatterPlotTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/ScatterPlotTest.trace org.jfree.chart.ScatterPlotTest.testReplaceDataset:123:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/ScatterPlotTest/ScatterPlotTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/ScatterPlotTest.trace org.jfree.chart.ScatterPlotTest.testSetSeriesToolTipGenerator:139:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/ScatterPlotTest/ScatterPlotTest4.txt

#Total Asserts in org.jfree.chart/ScatterPlotTest=============4
#Total Tests in org.jfree.chart/ScatterPlotTest=============0
