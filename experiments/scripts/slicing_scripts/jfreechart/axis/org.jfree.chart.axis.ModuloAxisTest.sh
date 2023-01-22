#!/bin/bash

echo "computing slice for ModuloAxisTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testCloning:64:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testCloning:65:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testCloning:66:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testHashCode:91:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testHashCode:94:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/ModuloAxisTest.trace org.jfree.chart.axis.ModuloAxisTest.testSerialization:104:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/ModuloAxisTest/ModuloAxisTest9.txt

#Total Asserts in org.jfree.chart.axis/ModuloAxisTest=============9
#Total Tests in org.jfree.chart.axis/ModuloAxisTest=============0
