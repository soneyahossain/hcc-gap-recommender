#!/bin/bash

echo "computing slice for DecoderExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructor0:39:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructor0:40:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructorString:46:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructorString:47:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructorStringThrowable:53:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructorStringThrowable:54:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructorThrowable:60:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/DecoderExceptionTest.trace org.apache.commons.codec.DecoderExceptionTest.testConstructorThrowable:61:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/DecoderExceptionTest/DecoderExceptionTest8.txt

#Total Asserts in org.apache.commons.codec/DecoderExceptionTest=============8
#Total Tests in org.apache.commons.codec/DecoderExceptionTest=============0
