#!/bin/bash

echo "computing slice for AreaRendererEndTypeTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/AreaRendererEndTypeTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/AreaRendererEndTypeTest.trace org.jfree.chart.renderer.AreaRendererEndTypeTest.testEquals:58:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/AreaRendererEndTypeTest/AreaRendererEndTypeTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/AreaRendererEndTypeTest.trace org.jfree.chart.renderer.AreaRendererEndTypeTest.testEquals:59:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/AreaRendererEndTypeTest/AreaRendererEndTypeTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/AreaRendererEndTypeTest.trace org.jfree.chart.renderer.AreaRendererEndTypeTest.testEquals:60:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/AreaRendererEndTypeTest/AreaRendererEndTypeTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/AreaRendererEndTypeTest.trace org.jfree.chart.renderer.AreaRendererEndTypeTest.testSerialization:72:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/AreaRendererEndTypeTest/AreaRendererEndTypeTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/renderer_traces/AreaRendererEndTypeTest.trace org.jfree.chart.renderer.AreaRendererEndTypeTest.testSerialization:74:*>$HCC_EXPERIMENTS/slices/jfreechart/renderer_slices/AreaRendererEndTypeTest/AreaRendererEndTypeTest5.txt

#Total Asserts in org.jfree.chart.renderer/AreaRendererEndTypeTest=============5
#Total Tests in org.jfree.chart.renderer/AreaRendererEndTypeTest=============0
