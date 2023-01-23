#!/bin/bash

echo "computing slice for Issue274PropertyNameTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/Issue274PropertyNameTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/Issue274PropertyNameTest.trace com.fasterxml.jackson.dataformat.xml.deser.Issue274PropertyNameTest.testIssue274:63:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/Issue274PropertyNameTest/Issue274PropertyNameTest1.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.deser/Issue274PropertyNameTest=============1
#Total Tests in com.fasterxml.jackson.dataformat.xml.deser/Issue274PropertyNameTest=============0
