#!/bin/bash

echo "computing slice for AbstractDialLayerTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testCloning:79:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testCloning:80:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testCloning:81:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testCloning:86:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testCloning:87:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testSerialization:98:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testSerialization:103:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/AbstractDialLayerTest.trace org.jfree.chart.plot.dial.AbstractDialLayerTest.testSerialization:104:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/AbstractDialLayerTest/AbstractDialLayerTest11.txt

#Total Asserts in org.jfree.chart.plot.dial/AbstractDialLayerTest=============11
#Total Tests in org.jfree.chart.plot.dial/AbstractDialLayerTest=============0
