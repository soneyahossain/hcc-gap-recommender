#!/bin/bash

echo "computing slice for WaterfallChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/WaterfallChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/WaterfallChartTest.trace org.jfree.chart.WaterfallChartTest.testSetSeriesToolTipGenerator:109:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/WaterfallChartTest/WaterfallChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/WaterfallChartTest.trace org.jfree.chart.WaterfallChartTest.testSetSeriesURLGenerator:124:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/WaterfallChartTest/WaterfallChartTest2.txt

#Total Asserts in org.jfree.chart/WaterfallChartTest=============2
#Total Tests in org.jfree.chart/WaterfallChartTest=============0
