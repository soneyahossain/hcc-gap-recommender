#!/bin/bash

echo "computing slice for PlumNeedleTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/needle_slices/PlumNeedleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/PlumNeedleTest.trace org.jfree.chart.needle.PlumNeedleTest.testEquals:60:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/PlumNeedleTest/PlumNeedleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/PlumNeedleTest.trace org.jfree.chart.needle.PlumNeedleTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/PlumNeedleTest/PlumNeedleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/PlumNeedleTest.trace org.jfree.chart.needle.PlumNeedleTest.testCloning:71:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/PlumNeedleTest/PlumNeedleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/PlumNeedleTest.trace org.jfree.chart.needle.PlumNeedleTest.testCloning:72:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/PlumNeedleTest/PlumNeedleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/PlumNeedleTest.trace org.jfree.chart.needle.PlumNeedleTest.testCloning:73:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/PlumNeedleTest/PlumNeedleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/PlumNeedleTest.trace org.jfree.chart.needle.PlumNeedleTest.testSerialization:83:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/PlumNeedleTest/PlumNeedleTest6.txt

#Total Asserts in org.jfree.chart.needle/PlumNeedleTest=============6
#Total Tests in org.jfree.chart.needle/PlumNeedleTest=============0
