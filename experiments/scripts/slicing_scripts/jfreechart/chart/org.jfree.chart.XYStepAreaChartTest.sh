#!/bin/bash

echo "computing slice for XYStepAreaChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepAreaChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepAreaChartTest.trace org.jfree.chart.XYStepAreaChartTest.testReplaceDataset:117:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepAreaChartTest/XYStepAreaChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepAreaChartTest.trace org.jfree.chart.XYStepAreaChartTest.testReplaceDataset:120:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepAreaChartTest/XYStepAreaChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepAreaChartTest.trace org.jfree.chart.XYStepAreaChartTest.testReplaceDataset:122:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepAreaChartTest/XYStepAreaChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/XYStepAreaChartTest.trace org.jfree.chart.XYStepAreaChartTest.testSetSeriesToolTipGenerator:138:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/XYStepAreaChartTest/XYStepAreaChartTest4.txt

#Total Asserts in org.jfree.chart/XYStepAreaChartTest=============4
#Total Tests in org.jfree.chart/XYStepAreaChartTest=============0
