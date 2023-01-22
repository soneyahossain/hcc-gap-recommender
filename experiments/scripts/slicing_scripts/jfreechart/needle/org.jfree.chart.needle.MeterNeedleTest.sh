#!/bin/bash

echo "computing slice for MeterNeedleTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:65:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:70:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:80:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:91:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:94:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:96:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:99:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/needle_traces/MeterNeedleTest.trace org.jfree.chart.needle.MeterNeedleTest.testEquals:101:*>$HCC_EXPERIMENTS/slices/jfreechart/needle_slices/MeterNeedleTest/MeterNeedleTest15.txt

#Total Asserts in org.jfree.chart.needle/MeterNeedleTest=============15
#Total Tests in org.jfree.chart.needle/MeterNeedleTest=============0
