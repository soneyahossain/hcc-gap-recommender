#!/bin/bash

echo "computing slice for XYStepRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testEquals:80:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testEquals:82:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testHashcode:94:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testHashcode:97:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testCloning:107:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testCloning:108:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testCloning:109:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testPublicCloneable:118:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/XYStepRendererTest.trace org.jfree.chart.renderer.xy.XYStepRendererTest.testSerialization:129:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/XYStepRendererTest/XYStepRendererTest12.txt

#Total Asserts in org.jfree.chart.renderer.xy/XYStepRendererTest=============12
#Total Tests in org.jfree.chart.renderer.xy/XYStepRendererTest=============0
