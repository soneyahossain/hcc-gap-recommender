#!/bin/bash

echo "computing slice for PureJavaCrc32CTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/PureJavaCrc32CTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/digest_traces/PureJavaCrc32CTest.trace org.apache.commons.codec.digest.PureJavaCrc32CTest.check:70:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/PureJavaCrc32CTest/PureJavaCrc32CTest1.txt

#Total Asserts in org.apache.commons.codec.digest/PureJavaCrc32CTest=============1
#Total Tests in org.apache.commons.codec.digest/PureJavaCrc32CTest=============0
