#!/bin/bash

echo "computing slice for RectangleConstraintTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:66:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:67:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:75:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:76:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:84:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:85:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:93:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:94:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:102:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:103:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:111:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:112:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:117:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:118:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:126:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:127:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:135:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/block_traces/RectangleConstraintTest.trace org.jfree.chart.block.RectangleConstraintTest.testCalculateConstrainedSize:136:*>$HCC_EXPERIMENTS/slices/jfreechart/block_slices/RectangleConstraintTest/RectangleConstraintTest18.txt

#Total Asserts in org.jfree.chart.block/RectangleConstraintTest=============18
#Total Tests in org.jfree.chart.block/RectangleConstraintTest=============0