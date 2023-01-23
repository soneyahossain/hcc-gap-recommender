#!/bin/bash

echo "computing slice for TestEnums"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestEnums

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestEnums.trace com.fasterxml.jackson.dataformat.xml.deser.TestEnums.testEnum:29:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestEnums/TestEnums1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestEnums.trace com.fasterxml.jackson.dataformat.xml.deser.TestEnums.testEnum:30:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestEnums/TestEnums2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.deser/TestEnums=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.deser/TestEnums=============0
