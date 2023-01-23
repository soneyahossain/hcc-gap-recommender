#!/bin/bash

echo "computing slice for ShortTextTitleTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testEquals:65:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testHashcode:77:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testHashcode:80:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testCloning:90:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testCloning:91:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testCloning:92:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/title_traces/ShortTextTitleTest.trace org.jfree.chart.title.ShortTextTitleTest.testSerialization:102:*>$HCC_EXPERIMENTS/slices/jfreechart/title_slices/ShortTextTitleTest/ShortTextTitleTest9.txt

#Total Asserts in org.jfree.chart.title/ShortTextTitleTest=============9
#Total Tests in org.jfree.chart.title/ShortTextTitleTest=============0
