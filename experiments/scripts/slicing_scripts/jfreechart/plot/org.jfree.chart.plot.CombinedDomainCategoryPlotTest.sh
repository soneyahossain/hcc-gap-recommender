#!/bin/bash

echo "computing slice for CombinedDomainCategoryPlotTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testRemoveSubplot:96:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testRemoveSubplot:97:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testEquals:107:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testCloning:118:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testCloning:119:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testCloning:120:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testSerialization:131:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testNotification:146:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainCategoryPlotTest.trace org.jfree.chart.plot.CombinedDomainCategoryPlotTest.testNotification:154:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainCategoryPlotTest/CombinedDomainCategoryPlotTest9.txt

#Total Asserts in org.jfree.chart.plot/CombinedDomainCategoryPlotTest=============9
#Total Tests in org.jfree.chart.plot/CombinedDomainCategoryPlotTest=============0
