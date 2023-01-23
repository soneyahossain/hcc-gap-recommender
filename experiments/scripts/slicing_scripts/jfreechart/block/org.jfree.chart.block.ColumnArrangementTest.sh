#!/bin/bash

echo "computing slice for ColumnArrangementTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:82:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:93:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testEquals:96:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testCloning:105:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColumnArrangementTest.trace org.jfree.chart.block.ColumnArrangementTest.testSerialization:116:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColumnArrangementTest/ColumnArrangementTest12.txt

#Total Asserts in org.jfree.chart.block/ColumnArrangementTest=============12
#Total Tests in org.jfree.chart.block/ColumnArrangementTest=============0
