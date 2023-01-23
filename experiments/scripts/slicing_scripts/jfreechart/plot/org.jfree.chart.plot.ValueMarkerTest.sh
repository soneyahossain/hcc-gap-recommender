#!/bin/bash

echo "computing slice for ValueMarkerTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:85:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:92:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:96:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:98:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:102:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:105:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:108:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:110:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:113:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:115:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:118:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:120:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:123:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:125:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:129:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:132:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:135:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:137:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:140:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:142:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:145:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:147:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:150:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:152:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:156:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testEquals:158:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testCloning:169:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testCloning:170:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testCloning:171:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testSerialization:181:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testGetSetValue:194:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testGetSetValue:196:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.testGetSetValue:197:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.test1802195:217:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.test1808376:235:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.test1808376:236:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.test1808376:237:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.test1808376:238:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.test1808376:239:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/ValueMarkerTest.trace org.jfree.chart.plot.ValueMarkerTest.test1808376:240:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/ValueMarkerTest/ValueMarkerTest42.txt

#Total Asserts in org.jfree.chart.plot/ValueMarkerTest=============42
#Total Tests in org.jfree.chart.plot/ValueMarkerTest=============0