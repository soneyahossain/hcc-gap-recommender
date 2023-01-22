#!/bin/bash

echo "computing slice for MarkerAxisBandTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:83:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:88:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:91:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testEquals:93:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testHashCode:105:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testHashCode:108:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/MarkerAxisBandTest.trace org.jfree.chart.axis.MarkerAxisBandTest.testSerialization:118:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/MarkerAxisBandTest/MarkerAxisBandTest14.txt

#Total Asserts in org.jfree.chart.axis/MarkerAxisBandTest=============14
#Total Tests in org.jfree.chart.axis/MarkerAxisBandTest=============0
