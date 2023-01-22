#!/bin/bash

echo "computing slice for PlotOrientationTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotOrientationTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotOrientationTest.trace org.jfree.chart.plot.PlotOrientationTest.testEquals:60:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotOrientationTest/PlotOrientationTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotOrientationTest.trace org.jfree.chart.plot.PlotOrientationTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotOrientationTest/PlotOrientationTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotOrientationTest.trace org.jfree.chart.plot.PlotOrientationTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotOrientationTest/PlotOrientationTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotOrientationTest.trace org.jfree.chart.plot.PlotOrientationTest.testEquals:65:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotOrientationTest/PlotOrientationTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotOrientationTest.trace org.jfree.chart.plot.PlotOrientationTest.testSerialization:78:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotOrientationTest/PlotOrientationTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/PlotOrientationTest.trace org.jfree.chart.plot.PlotOrientationTest.testSerialization:80:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/PlotOrientationTest/PlotOrientationTest6.txt

#Total Asserts in org.jfree.chart.plot/PlotOrientationTest=============6
#Total Tests in org.jfree.chart.plot/PlotOrientationTest=============0
