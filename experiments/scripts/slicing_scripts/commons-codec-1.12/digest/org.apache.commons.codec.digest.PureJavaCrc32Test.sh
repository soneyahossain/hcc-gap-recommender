#!/bin/bash

echo "computing slice for PureJavaCrc32Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/PureJavaCrc32Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/digest_traces/PureJavaCrc32Test.trace org.apache.commons.codec.digest.PureJavaCrc32Test.checkSame:103:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/PureJavaCrc32Test/PureJavaCrc32Test1.txt

#Total Asserts in org.apache.commons.codec.digest/PureJavaCrc32Test=============1
#Total Tests in org.apache.commons.codec.digest/PureJavaCrc32Test=============0
