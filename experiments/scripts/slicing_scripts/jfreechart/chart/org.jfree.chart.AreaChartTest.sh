#!/bin/bash

echo "computing slice for AreaChartTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/AreaChartTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/AreaChartTest.trace org.jfree.chart.AreaChartTest.testSetSeriesToolTipGenerator:96:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/AreaChartTest/AreaChartTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/AreaChartTest.trace org.jfree.chart.AreaChartTest.testSetSeriesURLGenerator:111:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/AreaChartTest/AreaChartTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/AreaChartTest.trace org.jfree.chart.AreaChartTest.testReplaceDataset:149:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/AreaChartTest/AreaChartTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/AreaChartTest.trace org.jfree.chart.AreaChartTest.testReplaceDataset:152:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/AreaChartTest/AreaChartTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/AreaChartTest.trace org.jfree.chart.AreaChartTest.testReplaceDataset:154:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/AreaChartTest/AreaChartTest5.txt

#Total Asserts in org.jfree.chart/AreaChartTest=============5
#Total Tests in org.jfree.chart/AreaChartTest=============0
