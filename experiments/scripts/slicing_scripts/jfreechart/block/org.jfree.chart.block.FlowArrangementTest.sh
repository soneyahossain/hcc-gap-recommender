#!/bin/bash

echo "computing slice for FlowArrangementTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:82:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:93:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testEquals:96:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testCloning:106:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/FlowArrangementTest.trace org.jfree.chart.block.FlowArrangementTest.testSerialization:117:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/FlowArrangementTest/FlowArrangementTest12.txt

#Total Asserts in org.jfree.chart.block/FlowArrangementTest=============12
#Total Tests in org.jfree.chart.block/FlowArrangementTest=============0
