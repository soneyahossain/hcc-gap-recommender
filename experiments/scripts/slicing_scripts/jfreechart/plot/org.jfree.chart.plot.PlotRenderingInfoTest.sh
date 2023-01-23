#!/bin/bash

echo "computing slice for PlotRenderingInfoTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:70:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:77:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:80:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:82:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:85:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testEquals:87:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testCloning:98:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testCloning:99:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testCloning:100:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testCloning:104:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testCloning:106:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testCloning:109:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testCloning:111:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotRenderingInfoTest.trace org.jfree.chart.plot.PlotRenderingInfoTest.testSerialization:121:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotRenderingInfoTest/PlotRenderingInfoTest18.txt

#Total Asserts in org.jfree.chart.plot/PlotRenderingInfoTest=============18
#Total Tests in org.jfree.chart.plot/PlotRenderingInfoTest=============0