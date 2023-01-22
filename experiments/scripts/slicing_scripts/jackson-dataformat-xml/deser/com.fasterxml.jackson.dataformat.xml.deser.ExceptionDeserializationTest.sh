#!/bin/bash

echo "computing slice for ExceptionDeserializationTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/ExceptionDeserializationTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/ExceptionDeserializationTest.trace com.fasterxml.jackson.dataformat.xml.deser.ExceptionDeserializationTest.testEmptyString162:24:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/ExceptionDeserializationTest/ExceptionDeserializationTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/ExceptionDeserializationTest.trace com.fasterxml.jackson.dataformat.xml.deser.ExceptionDeserializationTest.testEmptyString162:25:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/ExceptionDeserializationTest/ExceptionDeserializationTest2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.deser/ExceptionDeserializationTest=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.deser/ExceptionDeserializationTest=============0
