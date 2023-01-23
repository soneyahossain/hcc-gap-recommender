#!/bin/bash

echo "computing slice for LogFormatTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:77:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:82:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testHashcode:94:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testHashcode:97:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testCloning:107:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testCloning:108:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testCloning:109:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/util_traces/LogFormatTest.trace org.jfree.chart.util.LogFormatTest.testSerialization:119:*>$HCC_EXPERIMENTS/slices/jfreechart/util_slices/LogFormatTest/LogFormatTest15.txt

#Total Asserts in org.jfree.chart.util/LogFormatTest=============15
#Total Tests in org.jfree.chart.util/LogFormatTest=============0
