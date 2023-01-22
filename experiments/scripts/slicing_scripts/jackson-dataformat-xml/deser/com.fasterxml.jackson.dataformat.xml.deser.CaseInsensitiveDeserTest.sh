#!/bin/bash

echo "computing slice for CaseInsensitiveDeserTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/CaseInsensitiveDeserTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/CaseInsensitiveDeserTest.trace com.fasterxml.jackson.dataformat.xml.deser.CaseInsensitiveDeserTest.testCaseInsensitive1036:45:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/CaseInsensitiveDeserTest/CaseInsensitiveDeserTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/CaseInsensitiveDeserTest.trace com.fasterxml.jackson.dataformat.xml.deser.CaseInsensitiveDeserTest.testCaseInsensitive1036:46:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/CaseInsensitiveDeserTest/CaseInsensitiveDeserTest2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.deser/CaseInsensitiveDeserTest=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.deser/CaseInsensitiveDeserTest=============0
