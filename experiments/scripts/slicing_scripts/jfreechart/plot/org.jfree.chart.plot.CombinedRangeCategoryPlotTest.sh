#!/bin/bash

echo "computing slice for CombinedRangeCategoryPlotTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testEquals:90:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testCloning:101:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testCloning:102:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testCloning:103:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testSerialization:114:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testRemoveSubplot:131:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testNotification:146:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeCategoryPlotTest.trace org.jfree.chart.plot.CombinedRangeCategoryPlotTest.testNotification:154:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeCategoryPlotTest/CombinedRangeCategoryPlotTest8.txt

#Total Asserts in org.jfree.chart.plot/CombinedRangeCategoryPlotTest=============8
#Total Tests in org.jfree.chart.plot/CombinedRangeCategoryPlotTest=============0
