#!/bin/bash

echo "computing slice for WindItemRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testHashcode:74:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testHashcode:77:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testCloning:87:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testCloning:88:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testCloning:89:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testPublicCloneable:98:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/WindItemRendererTest.trace org.jfree.chart.renderer.xy.WindItemRendererTest.testSerialization:108:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/WindItemRendererTest/WindItemRendererTest8.txt

#Total Asserts in org.jfree.chart.renderer.xy/WindItemRendererTest=============8
#Total Tests in org.jfree.chart.renderer.xy/WindItemRendererTest=============0
