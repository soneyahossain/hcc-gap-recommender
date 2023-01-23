#!/bin/bash

echo "computing slice for CompositeFormatTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/text_slices/CompositeFormatTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/text_traces/CompositeFormatTest.trace org.apache.commons.lang3.text.CompositeFormatTest.parseObject:81:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/text_slices/CompositeFormatTest/CompositeFormatTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/text_traces/CompositeFormatTest.trace org.apache.commons.lang3.text.CompositeFormatTest.parseObject:82:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/text_slices/CompositeFormatTest/CompositeFormatTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/text_traces/CompositeFormatTest.trace org.apache.commons.lang3.text.CompositeFormatTest.testUsage:91:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/text_slices/CompositeFormatTest/CompositeFormatTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/text_traces/CompositeFormatTest.trace org.apache.commons.lang3.text.CompositeFormatTest.testUsage:92:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/text_slices/CompositeFormatTest/CompositeFormatTest4.txt

#Total Asserts in org.apache.commons.lang3.text/CompositeFormatTest=============4
#Total Tests in org.apache.commons.lang3.text/CompositeFormatTest=============0
