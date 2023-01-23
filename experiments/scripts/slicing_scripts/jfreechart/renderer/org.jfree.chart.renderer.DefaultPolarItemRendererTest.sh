#!/bin/bash

echo "computing slice for DefaultPolarItemRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testEquals:63:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testHashcode:79:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testHashcode:82:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testCloning:93:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testCloning:94:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testCloning:95:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testCloning:98:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testCloning:100:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/DefaultPolarItemRendererTest.trace org.jfree.chart.renderer.DefaultPolarItemRendererTest.testSerialization:111:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/DefaultPolarItemRendererTest/DefaultPolarItemRendererTest11.txt

#Total Asserts in org.jfree.chart.renderer/DefaultPolarItemRendererTest=============11
#Total Tests in org.jfree.chart.renderer/DefaultPolarItemRendererTest=============0