#!/bin/bash

echo "computing slice for DateTitleTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:65:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:70:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testHashcode:97:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testHashcode:100:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testCloning:110:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testCloning:111:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testCloning:112:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/DateTitleTest.trace org.jfree.chart.title.DateTitleTest.testSerialization:122:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/DateTitleTest/DateTitleTest15.txt

#Total Asserts in org.jfree.chart.title/DateTitleTest=============15
#Total Tests in org.jfree.chart.title/DateTitleTest=============0
