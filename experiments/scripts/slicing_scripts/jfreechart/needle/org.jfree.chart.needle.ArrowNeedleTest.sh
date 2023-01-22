#!/bin/bash

echo "computing slice for ArrowNeedleTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testEquals:65:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testCloning:77:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testCloning:78:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testCloning:79:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ArrowNeedleTest.trace org.jfree.chart.needle.ArrowNeedleTest.testSerialization:89:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ArrowNeedleTest/ArrowNeedleTest8.txt

#Total Asserts in org.jfree.chart.needle/ArrowNeedleTest=============8
#Total Tests in org.jfree.chart.needle/ArrowNeedleTest=============0
