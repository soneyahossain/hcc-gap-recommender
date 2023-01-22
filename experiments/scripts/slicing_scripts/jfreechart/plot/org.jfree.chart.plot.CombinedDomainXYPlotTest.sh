#!/bin/bash

echo "computing slice for CombinedDomainXYPlotTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testConstructor1:91:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testRemoveSubplot:107:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testEquals:117:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testEquals:118:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testCloning:128:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testCloning:129:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testCloning:130:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testSerialization:141:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testNotification:156:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/CombinedDomainXYPlotTest.trace org.jfree.chart.plot.CombinedDomainXYPlotTest.testNotification:164:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/CombinedDomainXYPlotTest/CombinedDomainXYPlotTest10.txt

#Total Asserts in org.jfree.chart.plot/CombinedDomainXYPlotTest=============10
#Total Tests in org.jfree.chart.plot/CombinedDomainXYPlotTest=============0
