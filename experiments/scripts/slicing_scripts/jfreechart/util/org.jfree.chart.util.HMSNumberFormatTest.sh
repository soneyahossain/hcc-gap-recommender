#!/bin/bash

echo "computing slice for HMSNumberFormatTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/util_slices/HMSNumberFormatTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/HMSNumberFormatTest.trace org.jfree.chart.util.HMSNumberFormatTest.testGeneral:54:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/HMSNumberFormatTest/HMSNumberFormatTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/HMSNumberFormatTest.trace org.jfree.chart.util.HMSNumberFormatTest.testGeneral:55:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/HMSNumberFormatTest/HMSNumberFormatTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/HMSNumberFormatTest.trace org.jfree.chart.util.HMSNumberFormatTest.testGeneral:56:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/HMSNumberFormatTest/HMSNumberFormatTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/HMSNumberFormatTest.trace org.jfree.chart.util.HMSNumberFormatTest.testGeneral:57:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/HMSNumberFormatTest/HMSNumberFormatTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/HMSNumberFormatTest.trace org.jfree.chart.util.HMSNumberFormatTest.testGeneral:58:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/HMSNumberFormatTest/HMSNumberFormatTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/HMSNumberFormatTest.trace org.jfree.chart.util.HMSNumberFormatTest.testGeneral:59:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/HMSNumberFormatTest/HMSNumberFormatTest6.txt

#Total Asserts in org.jfree.chart.util/HMSNumberFormatTest=============6
#Total Tests in org.jfree.chart.util/HMSNumberFormatTest=============0
