#!/bin/bash

echo "computing slice for TestSerializationAttr"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestSerializationAttr

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestSerializationAttr.trace com.fasterxml.jackson.dataformat.xml.ser.TestSerializationAttr.testSimpleNsAttr:82:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestSerializationAttr/TestSerializationAttr1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestSerializationAttr.trace com.fasterxml.jackson.dataformat.xml.ser.TestSerializationAttr.testIssue19:91:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestSerializationAttr/TestSerializationAttr2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestSerializationAttr.trace com.fasterxml.jackson.dataformat.xml.ser.TestSerializationAttr.testIssue6:98:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestSerializationAttr/TestSerializationAttr3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestSerializationAttr.trace com.fasterxml.jackson.dataformat.xml.ser.TestSerializationAttr.testIssue117AnySetterAttrs:108:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestSerializationAttr/TestSerializationAttr4.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.ser/TestSerializationAttr=============4
#Total Tests in com.fasterxml.jackson.dataformat.xml.ser/TestSerializationAttr=============0
