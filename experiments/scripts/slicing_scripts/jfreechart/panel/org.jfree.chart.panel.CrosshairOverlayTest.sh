#!/bin/bash

echo "computing slice for CrosshairOverlayTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/panel_slices/CrosshairOverlayTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/panel_traces/CrosshairOverlayTest.trace org.jfree.chart.panel.CrosshairOverlayTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/panel_slices/CrosshairOverlayTest/CrosshairOverlayTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/panel_traces/CrosshairOverlayTest.trace org.jfree.chart.panel.CrosshairOverlayTest.testSerialization:81:*>$HCC_EXPERIMENTS/slices/jfreechart/panel_slices/CrosshairOverlayTest/CrosshairOverlayTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/panel_traces/CrosshairOverlayTest.trace org.jfree.chart.panel.CrosshairOverlayTest.testCloning:94:*>$HCC_EXPERIMENTS/slices/jfreechart/panel_slices/CrosshairOverlayTest/CrosshairOverlayTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/panel_traces/CrosshairOverlayTest.trace org.jfree.chart.panel.CrosshairOverlayTest.testCloning:95:*>$HCC_EXPERIMENTS/slices/jfreechart/panel_slices/CrosshairOverlayTest/CrosshairOverlayTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/panel_traces/CrosshairOverlayTest.trace org.jfree.chart.panel.CrosshairOverlayTest.testCloning:96:*>$HCC_EXPERIMENTS/slices/jfreechart/panel_slices/CrosshairOverlayTest/CrosshairOverlayTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/panel_traces/CrosshairOverlayTest.trace org.jfree.chart.panel.CrosshairOverlayTest.testCloning:100:*>$HCC_EXPERIMENTS/slices/jfreechart/panel_slices/CrosshairOverlayTest/CrosshairOverlayTest6.txt

#Total Asserts in org.jfree.chart.panel/CrosshairOverlayTest=============6
#Total Tests in org.jfree.chart.panel/CrosshairOverlayTest=============0
