#!/bin/bash

echo "computing slice for PieSectionEntityTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:70:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:73:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:75:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:80:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:83:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:85:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:88:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:90:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:93:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:95:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:98:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:100:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:103:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testEquals:105:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testCloning:117:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testCloning:118:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testCloning:119:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/entity_traces/PieSectionEntityTest.trace org.jfree.chart.entity.PieSectionEntityTest.testSerialization:131:*>$HCC_EXPERIMENTS/slices/jfreechart/entity_slices/PieSectionEntityTest/PieSectionEntityTest19.txt

#Total Asserts in org.jfree.chart.entity/PieSectionEntityTest=============19
#Total Tests in org.jfree.chart.entity/PieSectionEntityTest=============0