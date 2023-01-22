#!/bin/bash

echo "computing slice for MiddlePinNeedleTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MiddlePinNeedleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MiddlePinNeedleTest.trace org.jfree.chart.needle.MiddlePinNeedleTest.testEquals:60:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MiddlePinNeedleTest/MiddlePinNeedleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MiddlePinNeedleTest.trace org.jfree.chart.needle.MiddlePinNeedleTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MiddlePinNeedleTest/MiddlePinNeedleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MiddlePinNeedleTest.trace org.jfree.chart.needle.MiddlePinNeedleTest.testCloning:71:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MiddlePinNeedleTest/MiddlePinNeedleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MiddlePinNeedleTest.trace org.jfree.chart.needle.MiddlePinNeedleTest.testCloning:72:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MiddlePinNeedleTest/MiddlePinNeedleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MiddlePinNeedleTest.trace org.jfree.chart.needle.MiddlePinNeedleTest.testCloning:73:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MiddlePinNeedleTest/MiddlePinNeedleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MiddlePinNeedleTest.trace org.jfree.chart.needle.MiddlePinNeedleTest.testSerialization:83:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MiddlePinNeedleTest/MiddlePinNeedleTest6.txt

#Total Asserts in org.jfree.chart.needle/MiddlePinNeedleTest=============6
#Total Tests in org.jfree.chart.needle/MiddlePinNeedleTest=============0
