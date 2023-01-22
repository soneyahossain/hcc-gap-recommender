#!/bin/bash

echo "computing slice for StandardXYBarPainterTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StandardXYBarPainterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StandardXYBarPainterTest.trace org.jfree.chart.renderer.xy.StandardXYBarPainterTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StandardXYBarPainterTest/StandardXYBarPainterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StandardXYBarPainterTest.trace org.jfree.chart.renderer.xy.StandardXYBarPainterTest.testHashcode:74:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StandardXYBarPainterTest/StandardXYBarPainterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StandardXYBarPainterTest.trace org.jfree.chart.renderer.xy.StandardXYBarPainterTest.testHashcode:77:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StandardXYBarPainterTest/StandardXYBarPainterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StandardXYBarPainterTest.trace org.jfree.chart.renderer.xy.StandardXYBarPainterTest.testCloning:87:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StandardXYBarPainterTest/StandardXYBarPainterTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StandardXYBarPainterTest.trace org.jfree.chart.renderer.xy.StandardXYBarPainterTest.testCloning:88:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StandardXYBarPainterTest/StandardXYBarPainterTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StandardXYBarPainterTest.trace org.jfree.chart.renderer.xy.StandardXYBarPainterTest.testSerialization:99:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StandardXYBarPainterTest/StandardXYBarPainterTest6.txt

#Total Asserts in org.jfree.chart.renderer.xy/StandardXYBarPainterTest=============6
#Total Tests in org.jfree.chart.renderer.xy/StandardXYBarPainterTest=============0
