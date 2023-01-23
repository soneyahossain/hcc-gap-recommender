#!/bin/bash

echo "computing slice for StringEncoderComparatorTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/StringEncoderComparatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/StringEncoderComparatorTest.trace org.apache.commons.codec.StringEncoderComparatorTest.testComparatorWithSoundex:43:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/StringEncoderComparatorTest/StringEncoderComparatorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/StringEncoderComparatorTest.trace org.apache.commons.codec.StringEncoderComparatorTest.testComparatorWithDoubleMetaphone:63:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/StringEncoderComparatorTest/StringEncoderComparatorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/StringEncoderComparatorTest.trace org.apache.commons.codec.StringEncoderComparatorTest.testComparatorWithDoubleMetaphoneAndInvalidInput:73:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/StringEncoderComparatorTest/StringEncoderComparatorTest3.txt

#Total Asserts in org.apache.commons.codec/StringEncoderComparatorTest=============3
#Total Tests in org.apache.commons.codec/StringEncoderComparatorTest=============0
