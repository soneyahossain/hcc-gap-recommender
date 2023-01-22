#!/bin/bash

echo "computing slice for VectorRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testHashcode:85:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testHashcode:88:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testCloning:98:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testCloning:99:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testCloning:100:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testPublicCloneable:109:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/VectorRendererTest.trace org.jfree.chart.renderer.xy.VectorRendererTest.testSerialization:119:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/VectorRendererTest/VectorRendererTest11.txt

#Total Asserts in org.jfree.chart.renderer.xy/VectorRendererTest=============11
#Total Tests in org.jfree.chart.renderer.xy/VectorRendererTest=============0
