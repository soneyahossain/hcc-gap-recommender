#!/bin/bash

echo "computing slice for LayeredBarRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testHashcode:79:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testHashcode:82:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testCloning:92:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testCloning:93:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testCloning:94:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testPublicCloneable:103:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LayeredBarRendererTest.trace org.jfree.chart.renderer.category.LayeredBarRendererTest.testSerialization:113:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LayeredBarRendererTest/LayeredBarRendererTest8.txt

#Total Asserts in org.jfree.chart.renderer.category/LayeredBarRendererTest=============8
#Total Tests in org.jfree.chart.renderer.category/LayeredBarRendererTest=============0
