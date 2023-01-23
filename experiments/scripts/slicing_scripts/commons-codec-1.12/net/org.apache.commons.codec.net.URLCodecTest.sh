#!/bin/bash

echo "computing slice for URLCodecTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testUTF8RoundTrip:71:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testUTF8RoundTrip:75:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testUTF8RoundTrip:77:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testUTF8RoundTrip:78:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testBasicEncodeDecode:87:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testBasicEncodeDecode:89:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testSafeCharEncodeDecode:100:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testSafeCharEncodeDecode:102:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testUnsafeEncodeDecode:113:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testUnsafeEncodeDecode:115:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeDecodeNull:124:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeDecodeNull:126:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDecodeInvalidContent:170:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDecodeInvalidContent:172:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeNull:182:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeUrlWithNullBitSet:192:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeUrlWithNullBitSet:194:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDecodeWithNullArray:203:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeStringWithNull:211:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDecodeStringWithNull:219:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeObjects:227:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeObjects:233:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testEncodeObjects:237:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDecodeObjects:273:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDecodeObjects:279:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDecodeObjects:283:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/net_traces/URLCodecTest.trace org.apache.commons.codec.net.URLCodecTest.testDefaultEncoding:302:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/net_slices/URLCodecTest/URLCodecTest27.txt

#Total Asserts in org.apache.commons.codec.net/URLCodecTest=============27
#Total Tests in org.apache.commons.codec.net/URLCodecTest=============0