#!/bin/bash

echo "computing slice for SymbolAxisTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testSerialization:66:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testCloning:76:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testCloning:77:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testCloning:78:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:88:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:92:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:94:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:97:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:99:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:102:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:104:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:107:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:109:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:112:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/SymbolAxisTest.trace org.jfree.chart.axis.SymbolAxisTest.testEquals:114:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/SymbolAxisTest/SymbolAxisTest16.txt

#Total Asserts in org.jfree.chart.axis/SymbolAxisTest=============16
#Total Tests in org.jfree.chart.axis/SymbolAxisTest=============0
