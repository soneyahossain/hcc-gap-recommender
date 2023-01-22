#!/bin/bash

echo "computing slice for StandardEntityCollectionTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testEquals:72:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testEquals:77:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testCloning:91:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testCloning:92:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testCloning:93:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testCloning:97:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testCloning:99:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/StandardEntityCollectionTest.trace org.jfree.chart.entity.StandardEntityCollectionTest.testSerialization:114:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/StandardEntityCollectionTest/StandardEntityCollectionTest9.txt

#Total Asserts in org.jfree.chart.entity/StandardEntityCollectionTest=============9
#Total Tests in org.jfree.chart.entity/StandardEntityCollectionTest=============0
