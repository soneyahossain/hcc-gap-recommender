#!/bin/bash

echo "computing slice for StackedXYAreaRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testEquals:83:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testEquals:88:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testEquals:91:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testEquals:95:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testEquals:97:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testHashcode:107:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testHashcode:110:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testCloning:120:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testCloning:121:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testCloning:122:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testPublicCloneable:131:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testSerialization:144:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testFindRangeBounds:160:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/xy_traces/StackedXYAreaRendererTest.trace org.jfree.chart.renderer.xy.StackedXYAreaRendererTest.testFindRangeBounds:161:*>$HCC_EXPERIMENTS/slices/jfreechart/xy_slices/StackedXYAreaRendererTest/StackedXYAreaRendererTest15.txt

#Total Asserts in org.jfree.chart.renderer.xy/StackedXYAreaRendererTest=============15
#Total Tests in org.jfree.chart.renderer.xy/StackedXYAreaRendererTest=============0