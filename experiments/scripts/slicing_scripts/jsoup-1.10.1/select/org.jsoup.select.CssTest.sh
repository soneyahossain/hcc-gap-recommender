#!/bin/bash

echo "computing slice for CssTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.empty:171:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.empty:172:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.empty:173:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.empty:174:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyChild:180:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyChild:181:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:189:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:190:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:191:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:192:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:193:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:194:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:195:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.onlyOfType:196:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.check:200:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.check:202:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.check:203:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.root:211:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.root:212:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.root:213:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.root:216:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.root:217:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/CssTest.trace org.jsoup.select.CssTest.root:218:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/CssTest/CssTest23.txt

#Total Asserts in org.jsoup.select/CssTest=============23
#Total Tests in org.jsoup.select/CssTest=============0
