#!/bin/bash

echo "computing slice for XXHash32Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/XXHash32Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/digest_traces/XXHash32Test.trace org.apache.commons.codec.digest.XXHash32Test.verifyChecksum:76:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/XXHash32Test/XXHash32Test1.txt

#Total Asserts in org.apache.commons.codec.digest/XXHash32Test=============1
#Total Tests in org.apache.commons.codec.digest/XXHash32Test=============0
