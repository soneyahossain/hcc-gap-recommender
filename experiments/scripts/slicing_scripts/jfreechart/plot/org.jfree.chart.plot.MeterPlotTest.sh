#!/bin/bash

echo "computing slice for MeterPlotTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:74:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:78:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:80:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:90:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:92:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:97:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:100:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:104:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:106:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:111:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:114:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:119:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:122:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:127:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:130:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:134:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:136:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:141:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:144:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:148:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:150:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:154:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:156:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:160:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:162:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:166:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:168:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:172:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:174:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:178:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:180:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:184:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:186:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:190:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testEquals:192:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:203:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:204:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:205:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:208:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:213:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:215:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:218:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testCloning:220:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testSerialization1:241:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MeterPlotTest.trace org.jfree.chart.plot.MeterPlotTest.testSerialization2:251:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MeterPlotTest/MeterPlotTest47.txt

#Total Asserts in org.jfree.chart.plot/MeterPlotTest=============47
#Total Tests in org.jfree.chart.plot/MeterPlotTest=============0