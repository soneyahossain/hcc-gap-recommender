#!/bin/bash

echo "computing slice for StandardXYURLGeneratorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/urls_slices/StandardXYURLGeneratorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/StandardXYURLGeneratorTest.trace org.jfree.chart.urls.StandardXYURLGeneratorTest.testSerialization:65:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/StandardXYURLGeneratorTest/StandardXYURLGeneratorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/urls_traces/StandardXYURLGeneratorTest.trace org.jfree.chart.urls.StandardXYURLGeneratorTest.testPublicCloneable:75:*>$HCC_EXPERIMENTS/slices/jfreechart/urls_slices/StandardXYURLGeneratorTest/StandardXYURLGeneratorTest2.txt

#Total Asserts in org.jfree.chart.urls/StandardXYURLGeneratorTest=============2
#Total Tests in org.jfree.chart.urls/StandardXYURLGeneratorTest=============0
