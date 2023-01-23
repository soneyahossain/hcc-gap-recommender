#!/bin/bash

echo "computing slice for TextNodeTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testBlank:21:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testBlank:22:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testBlank:23:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testBlank:24:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testBlank:25:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testTextBean:33:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testTextBean:35:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testTextBean:38:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testTextBean:41:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testTextBean:44:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testTextBean:45:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testSplitText:53:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testSplitText:54:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testSplitText:56:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testSplitText:57:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testSplitAnEmbolden:67:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/nodes_traces/TextNodeTest.trace org.jsoup.nodes.TextNodeTest.testWithSupplementaryCharacter:73:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/nodes_slices/TextNodeTest/TextNodeTest17.txt

#Total Asserts in org.jsoup.nodes/TextNodeTest=============17
#Total Tests in org.jsoup.nodes/TextNodeTest=============0
