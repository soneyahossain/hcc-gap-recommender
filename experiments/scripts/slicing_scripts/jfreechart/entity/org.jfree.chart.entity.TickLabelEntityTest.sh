#!/bin/bash

echo "computing slice for TickLabelEntityTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testEquals:66:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testEquals:69:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testEquals:71:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testCloning:92:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testCloning:93:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testCloning:94:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/TickLabelEntityTest.trace org.jfree.chart.entity.TickLabelEntityTest.testSerialization:105:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/TickLabelEntityTest/TickLabelEntityTest11.txt

#Total Asserts in org.jfree.chart.entity/TickLabelEntityTest=============11
#Total Tests in org.jfree.chart.entity/TickLabelEntityTest=============0
