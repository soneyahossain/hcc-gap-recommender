#!/bin/bash

echo "computing slice for W3CDomTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.simpleConversion:26:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.convertsGoogle:50:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.convertsGoogle:51:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.convertsGoogle:52:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.convertsGoogle:55:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:69:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:70:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:71:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:74:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:75:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:76:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:79:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:80:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.namespacePreservation:81:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.handlesInvalidAttributeNames:90:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/helper_traces/W3CDomTest.trace org.jsoup.helper.W3CDomTest.handlesInvalidAttributeNames:91:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/helper_slices/W3CDomTest/W3CDomTest16.txt

#Total Asserts in org.jsoup.helper/W3CDomTest=============16
#Total Tests in org.jsoup.helper/W3CDomTest=============0
