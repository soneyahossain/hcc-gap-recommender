#!/bin/bash

echo "computing slice for AxisSpaceTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testHashCode:91:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testHashCode:94:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testCloning:104:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testCloning:105:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/AxisSpaceTest.trace org.jfree.chart.axis.AxisSpaceTest.testCloning:106:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/AxisSpaceTest/AxisSpaceTest14.txt

#Total Asserts in org.jfree.chart.axis/AxisSpaceTest=============14
#Total Tests in org.jfree.chart.axis/AxisSpaceTest=============0
