#!/bin/bash

echo "computing slice for MarkerTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetPaint:79:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetPaint:81:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetPaint:82:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetPaint:90:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetStroke:104:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetStroke:106:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetStroke:107:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetStroke:115:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlinePaint:129:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlinePaint:131:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlinePaint:132:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlinePaint:136:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlineStroke:149:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlineStroke:151:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlineStroke:152:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetOutlineStroke:156:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetAlpha:171:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetAlpha:173:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetAlpha:174:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabel:187:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabel:189:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabel:190:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabel:194:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelFont:207:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelFont:209:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelFont:210:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelFont:218:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelPaint:232:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelPaint:234:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelPaint:235:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelPaint:243:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelAnchor:257:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelAnchor:259:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelAnchor:260:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelAnchor:268:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffset:282:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffset:284:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffset:285:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffset:293:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffsetType:308:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffsetType:310:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffsetType:311:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelOffsetType:319:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelTextAnchor:334:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelTextAnchor:336:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelTextAnchor:337:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testGetSetLabelTextAnchor:345:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest47.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithCategoryPlot:361:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest48.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithCategoryPlot:364:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest49.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithCategoryPlot:368:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest50.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithCategoryPlot:370:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest51.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithXYPlot:385:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest52.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithXYPlot:388:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest53.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithXYPlot:392:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest54.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/plot_traces/MarkerTest.trace org.jfree.chart.plot.MarkerTest.testListenersWithXYPlot:394:*>$HCC_EXPERIMENTS/slices/jfreechart/plot_slices/MarkerTest/MarkerTest55.txt

#Total Asserts in org.jfree.chart.plot/MarkerTest=============55
#Total Tests in org.jfree.chart.plot/MarkerTest=============0