#!/bin/bash

echo "computing slice for CombinedRangeXYPlotTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testEquals:92:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testEquals:93:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testRemoveSubplot:109:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testCloning:119:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testCloning:120:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testCloning:121:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testSerialization:132:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testNotification:147:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedRangeXYPlotTest.trace org.jfree.chart.plot.CombinedRangeXYPlotTest.testNotification:155:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedRangeXYPlotTest/CombinedRangeXYPlotTest9.txt

#Total Asserts in org.jfree.chart.plot/CombinedRangeXYPlotTest=============9
#Total Tests in org.jfree.chart.plot/CombinedRangeXYPlotTest=============0
