#!/bin/bash

echo "computing slice for XmlHeaderAwareReaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testKeepsAllBytesInStream:31:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testKeepsAllBytesInStream:32:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testDefaultValues:38:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testDefaultValues:39:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testEvaluatesVersion:45:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testEvaluatesEncoding:51:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testValueEscaping:57:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testCanHandleImproperSizedPushbackInputStream:63:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/XmlHeaderAwareReaderTest.trace com.thoughtworks.xstream.core.util.XmlHeaderAwareReaderTest.testSkipsUtf8BOM:75:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/XmlHeaderAwareReaderTest/XmlHeaderAwareReaderTest9.txt

#Total Asserts in com.thoughtworks.xstream.core.util/XmlHeaderAwareReaderTest=============9
#Total Tests in com.thoughtworks.xstream.core.util/XmlHeaderAwareReaderTest=============0
