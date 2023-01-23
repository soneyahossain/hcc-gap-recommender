#!/bin/bash

echo "computing slice for MeterIntervalTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterIntervalTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterIntervalTest.trace org.jfree.chart.plot.MeterIntervalTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterIntervalTest/MeterIntervalTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterIntervalTest.trace org.jfree.chart.plot.MeterIntervalTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterIntervalTest/MeterIntervalTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterIntervalTest.trace org.jfree.chart.plot.MeterIntervalTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterIntervalTest/MeterIntervalTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterIntervalTest.trace org.jfree.chart.plot.MeterIntervalTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterIntervalTest/MeterIntervalTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterIntervalTest.trace org.jfree.chart.plot.MeterIntervalTest.testCloning:96:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterIntervalTest/MeterIntervalTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterIntervalTest.trace org.jfree.chart.plot.MeterIntervalTest.testSerialization:106:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterIntervalTest/MeterIntervalTest6.txt

#Total Asserts in org.jfree.chart.plot/MeterIntervalTest=============6
#Total Tests in org.jfree.chart.plot/MeterIntervalTest=============0
