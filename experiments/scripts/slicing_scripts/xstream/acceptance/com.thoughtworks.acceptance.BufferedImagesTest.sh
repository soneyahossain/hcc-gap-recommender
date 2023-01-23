#!/bin/bash

echo "computing slice for BufferedImagesTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BufferedImagesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/BufferedImagesTest.trace com.thoughtworks.acceptance.BufferedImagesTest.testInBWCanBeMarshalled:63:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BufferedImagesTest/BufferedImagesTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/BufferedImagesTest.trace com.thoughtworks.acceptance.BufferedImagesTest.testInRGBACanBeMarshalled:86:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BufferedImagesTest/BufferedImagesTest2.txt

#Total Asserts in com.thoughtworks.acceptance/BufferedImagesTest=============2
#Total Tests in com.thoughtworks.acceptance/BufferedImagesTest=============0
