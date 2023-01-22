#!/bin/bash

echo "computing slice for Base32OutputStreamTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base32OutputStreamTest.trace org.apache.commons.codec.binary.Base32OutputStreamTest.testByChunk:186:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest/Base32OutputStreamTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base32OutputStreamTest.trace org.apache.commons.codec.binary.Base32OutputStreamTest.testByChunk:194:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest/Base32OutputStreamTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base32OutputStreamTest.trace org.apache.commons.codec.binary.Base32OutputStreamTest.testByChunk:207:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest/Base32OutputStreamTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base32OutputStreamTest.trace org.apache.commons.codec.binary.Base32OutputStreamTest.testByteByByte:238:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest/Base32OutputStreamTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base32OutputStreamTest.trace org.apache.commons.codec.binary.Base32OutputStreamTest.testByteByByte:248:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest/Base32OutputStreamTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base32OutputStreamTest.trace org.apache.commons.codec.binary.Base32OutputStreamTest.testByteByByte:259:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest/Base32OutputStreamTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base32OutputStreamTest.trace org.apache.commons.codec.binary.Base32OutputStreamTest.testByteByByte:274:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base32OutputStreamTest/Base32OutputStreamTest7.txt

#Total Asserts in org.apache.commons.codec.binary/Base32OutputStreamTest=============7
#Total Tests in org.apache.commons.codec.binary/Base32OutputStreamTest=============0
