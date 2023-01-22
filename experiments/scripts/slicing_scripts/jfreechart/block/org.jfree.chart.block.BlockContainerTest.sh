#!/bin/bash

echo "computing slice for BlockContainerTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testEquals:62:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testEquals:63:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testCloning:84:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testCloning:85:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testCloning:86:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/BlockContainerTest.trace org.jfree.chart.block.BlockContainerTest.testSerialization:97:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/BlockContainerTest/BlockContainerTest10.txt

#Total Asserts in org.jfree.chart.block/BlockContainerTest=============10
#Total Tests in org.jfree.chart.block/BlockContainerTest=============0
