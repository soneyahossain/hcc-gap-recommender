#!/bin/bash

echo "computing slice for CategoryItemEntityTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testEquals:83:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testEquals:88:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testCloning:104:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testCloning:105:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testCloning:106:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/CategoryItemEntityTest.trace org.jfree.chart.entity.CategoryItemEntityTest.testSerialization:122:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/CategoryItemEntityTest/CategoryItemEntityTest11.txt

#Total Asserts in org.jfree.chart.entity/CategoryItemEntityTest=============11
#Total Tests in org.jfree.chart.entity/CategoryItemEntityTest=============0
