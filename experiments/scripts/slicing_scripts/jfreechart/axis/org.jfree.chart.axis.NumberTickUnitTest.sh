#!/bin/bash

echo "computing slice for NumberTickUnitTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testEquals:65:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testHashCode:88:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testCloning:97:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/NumberTickUnitTest.trace org.jfree.chart.axis.NumberTickUnitTest.testSerialization:107:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/NumberTickUnitTest/NumberTickUnitTest9.txt

#Total Asserts in org.jfree.chart.axis/NumberTickUnitTest=============9
#Total Tests in org.jfree.chart.axis/NumberTickUnitTest=============0
