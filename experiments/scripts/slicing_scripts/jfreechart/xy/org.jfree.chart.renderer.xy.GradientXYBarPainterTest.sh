#!/bin/bash

echo "computing slice for GradientXYBarPainterTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testEquals:77:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testHashcode:89:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testHashcode:92:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testCloning:102:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testCloning:103:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/GradientXYBarPainterTest.trace org.jfree.chart.renderer.xy.GradientXYBarPainterTest.testSerialization:114:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/GradientXYBarPainterTest/GradientXYBarPainterTest12.txt

#Total Asserts in org.jfree.chart.renderer.xy/GradientXYBarPainterTest=============12
#Total Tests in org.jfree.chart.renderer.xy/GradientXYBarPainterTest=============0