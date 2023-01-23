#!/bin/bash

echo "computing slice for DeviationRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testEquals:70:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testHashcode:82:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testHashcode:85:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testCloning:95:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testCloning:96:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testCloning:97:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testPublicCloneable:106:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/DeviationRendererTest.trace org.jfree.chart.renderer.xy.DeviationRendererTest.testSerialization:116:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/DeviationRendererTest/DeviationRendererTest11.txt

#Total Asserts in org.jfree.chart.renderer.xy/DeviationRendererTest=============11
#Total Tests in org.jfree.chart.renderer.xy/DeviationRendererTest=============0
