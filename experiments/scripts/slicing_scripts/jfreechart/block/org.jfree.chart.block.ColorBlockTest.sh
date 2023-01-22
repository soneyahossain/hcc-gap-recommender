#!/bin/bash

echo "computing slice for ColorBlockTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:67:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:68:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testEquals:83:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testCloning:104:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testCloning:105:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testCloning:106:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testCloning:110:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testCloning:112:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/ColorBlockTest.trace org.jfree.chart.block.ColorBlockTest.testSerialization:124:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/ColorBlockTest/ColorBlockTest14.txt

#Total Asserts in org.jfree.chart.block/ColorBlockTest=============14
#Total Tests in org.jfree.chart.block/ColorBlockTest=============0
