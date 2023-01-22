#!/bin/bash

echo "computing slice for LineBorderTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:70:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:82:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:85:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testEquals:92:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testCloning:102:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/LineBorderTest.trace org.jfree.chart.block.LineBorderTest.testSerialization:114:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/LineBorderTest/LineBorderTest10.txt

#Total Asserts in org.jfree.chart.block/LineBorderTest=============10
#Total Tests in org.jfree.chart.block/LineBorderTest=============0
