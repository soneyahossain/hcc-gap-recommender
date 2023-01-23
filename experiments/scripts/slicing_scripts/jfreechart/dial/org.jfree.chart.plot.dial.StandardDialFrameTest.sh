#!/bin/bash

echo "computing slice for StandardDialFrameTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:93:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:95:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:99:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testEquals:101:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testHashCode:111:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testHashCode:114:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testCloning:124:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testCloning:125:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testCloning:126:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testCloning:131:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testCloning:132:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/dial_traces/StandardDialFrameTest.trace org.jfree.chart.plot.dial.StandardDialFrameTest.testSerialization:142:*>$HCC_EXPERIMENTS/slices/jfreechart/dial_slices/StandardDialFrameTest/StandardDialFrameTest19.txt

#Total Asserts in org.jfree.chart.plot.dial/StandardDialFrameTest=============19
#Total Tests in org.jfree.chart.plot.dial/StandardDialFrameTest=============0