#!/bin/bash

echo "computing slice for DateTickUnitTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickUnitTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickUnitTest.trace org.jfree.chart.axis.DateTickUnitTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickUnitTest/DateTickUnitTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickUnitTest.trace org.jfree.chart.axis.DateTickUnitTest.testHashCode:72:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickUnitTest/DateTickUnitTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickUnitTest.trace org.jfree.chart.axis.DateTickUnitTest.testHashCode:75:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickUnitTest/DateTickUnitTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/DateTickUnitTest.trace org.jfree.chart.axis.DateTickUnitTest.testSerialization:85:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/DateTickUnitTest/DateTickUnitTest4.txt

#Total Asserts in org.jfree.chart.axis/DateTickUnitTest=============4
#Total Tests in org.jfree.chart.axis/DateTickUnitTest=============0
