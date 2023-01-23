#!/bin/bash

echo "computing slice for XStreamerTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/XStreamerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/XStreamerTest.trace com.thoughtworks.acceptance.XStreamerTest.testDetectsSelfMarshalling:58:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/XStreamerTest/XStreamerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/XStreamerTest.trace com.thoughtworks.acceptance.XStreamerTest.testCanConvertAnotherInstance:70:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/XStreamerTest/XStreamerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/XStreamerTest.trace com.thoughtworks.acceptance.XStreamerTest.testCanSerializeSelfContained:89:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/XStreamerTest/XStreamerTest3.txt

#Total Asserts in com.thoughtworks.acceptance/XStreamerTest=============3
#Total Tests in com.thoughtworks.acceptance/XStreamerTest=============0
