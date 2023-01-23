#!/bin/bash

echo "computing slice for Base64Codec13Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testEncoder:372:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testDecoder:391:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testBinaryEncoder:410:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testBinaryDecoder:429:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testStaticEncode:447:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testStaticDecode:465:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testStaticEncodeChunked:483:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/binary_traces/Base64Codec13Test.trace org.apache.commons.codec.binary.Base64Codec13Test.testStaticDecodeChunked:502:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/binary_slices/Base64Codec13Test/Base64Codec13Test8.txt

#Total Asserts in org.apache.commons.codec.binary/Base64Codec13Test=============8
#Total Tests in org.apache.commons.codec.binary/Base64Codec13Test=============0
