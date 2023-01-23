#!/bin/bash

echo "computing slice for XYPolygonAnnotationTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:85:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:88:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:96:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:99:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:107:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testEquals:110:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testHashCode:123:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testHashCode:126:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testCloning:138:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testCloning:139:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testCloning:140:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testPublicCloneable:151:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/XYPolygonAnnotationTest.trace org.jfree.chart.annotations.XYPolygonAnnotationTest.testSerialization:163:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/XYPolygonAnnotationTest/XYPolygonAnnotationTest17.txt

#Total Asserts in org.jfree.chart.annotations/XYPolygonAnnotationTest=============17
#Total Tests in org.jfree.chart.annotations/XYPolygonAnnotationTest=============0