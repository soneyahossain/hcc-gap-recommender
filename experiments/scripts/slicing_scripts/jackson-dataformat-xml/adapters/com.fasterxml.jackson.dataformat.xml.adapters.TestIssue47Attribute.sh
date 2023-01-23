#!/bin/bash

echo "computing slice for TestIssue47Attribute"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/adapters_slices/TestIssue47Attribute

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/adapters_traces/TestIssue47Attribute.trace com.fasterxml.jackson.dataformat.xml.adapters.TestIssue47Attribute.testEmptyStringFromElemAndAttr:30:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/adapters_slices/TestIssue47Attribute/TestIssue47Attribute1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/adapters_traces/TestIssue47Attribute.trace com.fasterxml.jackson.dataformat.xml.adapters.TestIssue47Attribute.testEmptyStringFromElemAndAttr:31:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/adapters_slices/TestIssue47Attribute/TestIssue47Attribute2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/adapters_traces/TestIssue47Attribute.trace com.fasterxml.jackson.dataformat.xml.adapters.TestIssue47Attribute.testEmptyStringFromElemAndAttr:32:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/adapters_slices/TestIssue47Attribute/TestIssue47Attribute3.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.adapters/TestIssue47Attribute=============3
#Total Tests in com.fasterxml.jackson.dataformat.xml.adapters/TestIssue47Attribute=============0
