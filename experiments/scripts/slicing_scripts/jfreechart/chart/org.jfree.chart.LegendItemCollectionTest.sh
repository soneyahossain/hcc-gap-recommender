#!/bin/bash

echo "computing slice for LegendItemCollectionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testSerialization:99:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testCloning:113:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testCloning:114:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testCloning:115:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/chart_traces/LegendItemCollectionTest.trace org.jfree.chart.LegendItemCollectionTest.testCloning:119:*>$HCC_EXPERIMENTS/slices/jfreechart/chart_slices/LegendItemCollectionTest/LegendItemCollectionTest9.txt

#Total Asserts in org.jfree.chart/LegendItemCollectionTest=============9
#Total Tests in org.jfree.chart/LegendItemCollectionTest=============0
