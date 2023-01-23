#!/bin/bash

echo "computing slice for TickUnitsTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/TickUnitsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/TickUnitsTest.trace org.jfree.chart.axis.TickUnitsTest.testSerialization:63:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/TickUnitsTest/TickUnitsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/TickUnitsTest.trace org.jfree.chart.axis.TickUnitsTest.testCloning:74:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/TickUnitsTest/TickUnitsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/TickUnitsTest.trace org.jfree.chart.axis.TickUnitsTest.testCloning:75:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/TickUnitsTest/TickUnitsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/TickUnitsTest.trace org.jfree.chart.axis.TickUnitsTest.testCloning:76:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/TickUnitsTest/TickUnitsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/TickUnitsTest.trace org.jfree.chart.axis.TickUnitsTest.testEquals:88:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/TickUnitsTest/TickUnitsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/TickUnitsTest.trace org.jfree.chart.axis.TickUnitsTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/TickUnitsTest/TickUnitsTest6.txt

#Total Asserts in org.jfree.chart.axis/TickUnitsTest=============6
#Total Tests in org.jfree.chart.axis/TickUnitsTest=============0
