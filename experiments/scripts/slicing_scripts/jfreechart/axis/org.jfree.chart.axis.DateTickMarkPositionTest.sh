#!/bin/bash

echo "computing slice for DateTickMarkPositionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testEquals:60:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testEquals:63:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testHashCode:77:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testHashCode:80:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testSerialization:90:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickMarkPositionTest.trace org.jfree.chart.axis.DateTickMarkPositionTest.testSerialization:91:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickMarkPositionTest/DateTickMarkPositionTest10.txt

#Total Asserts in org.jfree.chart.axis/DateTickMarkPositionTest=============10
#Total Tests in org.jfree.chart.axis/DateTickMarkPositionTest=============0
