#!/bin/bash

echo "computing slice for CategoryTextAnnotationTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testEquals:85:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testEquals:87:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testHashcode:99:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testHashcode:102:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testCloning:113:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testCloning:114:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testCloning:115:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testPublicCloneable:125:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/annotations_traces/CategoryTextAnnotationTest.trace org.jfree.chart.annotations.CategoryTextAnnotationTest.testSerialization:136:*>$HCC_EXPERIMENTS/slices/jfreechart/annotations_slices/CategoryTextAnnotationTest/CategoryTextAnnotationTest14.txt

#Total Asserts in org.jfree.chart.annotations/CategoryTextAnnotationTest=============14
#Total Tests in org.jfree.chart.annotations/CategoryTextAnnotationTest=============0