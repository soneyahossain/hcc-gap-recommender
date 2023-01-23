#!/bin/bash

echo "computing slice for EncoderExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructor0:39:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructor0:40:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructorString:46:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructorString:47:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructorStringThrowable:53:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructorStringThrowable:54:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructorThrowable:60:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/codec_traces/EncoderExceptionTest.trace org.apache.commons.codec.EncoderExceptionTest.testConstructorThrowable:61:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/codec_slices/EncoderExceptionTest/EncoderExceptionTest8.txt

#Total Asserts in org.apache.commons.codec/EncoderExceptionTest=============8
#Total Tests in org.apache.commons.codec/EncoderExceptionTest=============0
