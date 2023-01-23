#!/bin/bash

echo "computing slice for Base64OutputStreamTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testCodec98NPE:60:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testByChunk:195:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testByChunk:203:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testByChunk:216:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte:247:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte:257:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte:268:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64OutputStreamTest.trace org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte:283:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64OutputStreamTest/Base64OutputStreamTest8.txt

#Total Asserts in org.apache.commons.codec.binary/Base64OutputStreamTest=============8
#Total Tests in org.apache.commons.codec.binary/Base64OutputStreamTest=============0
