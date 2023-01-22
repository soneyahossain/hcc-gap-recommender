#!/bin/bash

echo "computing slice for SwingTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SwingTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SwingTest.trace com.thoughtworks.acceptance.SwingTest.testJTable:41:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SwingTest/SwingTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SwingTest.trace com.thoughtworks.acceptance.SwingTest.testDefaultListModel:57:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SwingTest/SwingTest2.txt

#Total Asserts in com.thoughtworks.acceptance/SwingTest=============2
#Total Tests in com.thoughtworks.acceptance/SwingTest=============0
