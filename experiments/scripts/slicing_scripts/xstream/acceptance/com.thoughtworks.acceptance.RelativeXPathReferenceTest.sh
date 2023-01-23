#!/bin/bash

echo "computing slice for RelativeXPathReferenceTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testXmlContainsReferencePaths:55:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testCircularReferenceXml:73:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testCircularReferenceToSelfXml:86:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testRing:110:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testTree:142:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testCanReferenceDeserializedNullValues:169:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testCanReferenceDeserializedNullValues:170:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/RelativeXPathReferenceTest.trace com.thoughtworks.acceptance.RelativeXPathReferenceTest.testCanReferenceDeserializedNullValues:171:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/RelativeXPathReferenceTest/RelativeXPathReferenceTest8.txt

#Total Asserts in com.thoughtworks.acceptance/RelativeXPathReferenceTest=============8
#Total Tests in com.thoughtworks.acceptance/RelativeXPathReferenceTest=============0
