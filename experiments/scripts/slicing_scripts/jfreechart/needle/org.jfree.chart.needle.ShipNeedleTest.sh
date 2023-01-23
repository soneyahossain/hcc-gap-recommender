#!/bin/bash

echo "computing slice for ShipNeedleTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ShipNeedleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ShipNeedleTest.trace org.jfree.chart.needle.ShipNeedleTest.testEquals:60:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ShipNeedleTest/ShipNeedleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ShipNeedleTest.trace org.jfree.chart.needle.ShipNeedleTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ShipNeedleTest/ShipNeedleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ShipNeedleTest.trace org.jfree.chart.needle.ShipNeedleTest.testCloning:71:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ShipNeedleTest/ShipNeedleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ShipNeedleTest.trace org.jfree.chart.needle.ShipNeedleTest.testCloning:72:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ShipNeedleTest/ShipNeedleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ShipNeedleTest.trace org.jfree.chart.needle.ShipNeedleTest.testCloning:73:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ShipNeedleTest/ShipNeedleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/ShipNeedleTest.trace org.jfree.chart.needle.ShipNeedleTest.testSerialization:83:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/ShipNeedleTest/ShipNeedleTest6.txt

#Total Asserts in org.jfree.chart.needle/ShipNeedleTest=============6
#Total Tests in org.jfree.chart.needle/ShipNeedleTest=============0
