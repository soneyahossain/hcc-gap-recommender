#!/bin/bash

echo "computing slice for CharEncodingTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/CharEncodingTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/CharEncodingTest.trace org.apache.commons.codec.CharEncodingTest.testIso8859_1:40:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/CharEncodingTest/CharEncodingTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/CharEncodingTest.trace org.apache.commons.codec.CharEncodingTest.testUsAscii:45:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/CharEncodingTest/CharEncodingTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/CharEncodingTest.trace org.apache.commons.codec.CharEncodingTest.testUtf16:50:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/CharEncodingTest/CharEncodingTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/CharEncodingTest.trace org.apache.commons.codec.CharEncodingTest.testUtf16Be:55:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/CharEncodingTest/CharEncodingTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/CharEncodingTest.trace org.apache.commons.codec.CharEncodingTest.testUtf16Le:60:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/CharEncodingTest/CharEncodingTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/CharEncodingTest.trace org.apache.commons.codec.CharEncodingTest.testUtf8:65:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/CharEncodingTest/CharEncodingTest6.txt

#Total Asserts in org.apache.commons.codec/CharEncodingTest=============6
#Total Tests in org.apache.commons.codec/CharEncodingTest=============0
