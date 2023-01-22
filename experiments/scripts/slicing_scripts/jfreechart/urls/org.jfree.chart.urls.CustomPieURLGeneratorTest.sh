#!/bin/bash

echo "computing slice for CustomPieURLGeneratorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testCloning:88:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testCloning:89:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testCloning:90:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testCloning:96:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testPublicCloneable:105:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/CustomPieURLGeneratorTest.trace org.jfree.chart.urls.CustomPieURLGeneratorTest.testSerialization:119:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/CustomPieURLGeneratorTest/CustomPieURLGeneratorTest9.txt

#Total Asserts in org.jfree.chart.urls/CustomPieURLGeneratorTest=============9
#Total Tests in org.jfree.chart.urls/CustomPieURLGeneratorTest=============0
