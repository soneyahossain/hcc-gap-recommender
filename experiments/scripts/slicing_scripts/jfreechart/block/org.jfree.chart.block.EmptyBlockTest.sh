#!/bin/bash

echo "computing slice for EmptyBlockTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testEquals:63:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testEquals:64:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testCloning:91:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testCloning:92:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testCloning:93:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/EmptyBlockTest.trace org.jfree.chart.block.EmptyBlockTest.testSerialization:103:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/EmptyBlockTest/EmptyBlockTest10.txt

#Total Asserts in org.jfree.chart.block/EmptyBlockTest=============10
#Total Tests in org.jfree.chart.block/EmptyBlockTest=============0
