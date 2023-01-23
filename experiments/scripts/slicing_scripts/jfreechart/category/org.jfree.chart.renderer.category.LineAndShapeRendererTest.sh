#!/bin/bash

echo "computing slice for LineAndShapeRendererTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:76:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:79:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:81:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:84:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:86:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:89:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:91:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:94:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:96:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:99:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:101:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:104:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:106:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:109:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:111:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:114:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:116:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:119:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testEquals:121:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testHashcode:132:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testHashcode:135:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testCloning:145:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testCloning:146:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testCloning:147:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testCloning:148:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testPublicCloneable:157:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testSerialization:244:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testGetLegendItemSeriesIndex:266:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testGetLegendItemSeriesIndex:267:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testGetLegendItemSeriesIndex:268:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testFindRangeBounds:277:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testFindRangeBounds:281:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testFindRangeBounds:284:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testFindRangeBounds:287:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testFindRangeBounds:290:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testFindRangeBounds:293:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/category_traces/LineAndShapeRendererTest.trace org.jfree.chart.renderer.category.LineAndShapeRendererTest.testFindRangeBounds:296:*>$HCC_EXPERIMENTS/slices/jfreechart/category_slices/LineAndShapeRendererTest/LineAndShapeRendererTest37.txt

#Total Asserts in org.jfree.chart.renderer.category/LineAndShapeRendererTest=============37
#Total Tests in org.jfree.chart.renderer.category/LineAndShapeRendererTest=============0