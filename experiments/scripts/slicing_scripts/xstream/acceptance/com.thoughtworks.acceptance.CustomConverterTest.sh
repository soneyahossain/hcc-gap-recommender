#!/bin/bash

echo "computing slice for CustomConverterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomConverterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/CustomConverterTest.trace com.thoughtworks.acceptance.CustomConverterTest.testWrongObjectTypeReturned:71:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomConverterTest/CustomConverterTest1.txt

#Total Asserts in com.thoughtworks.acceptance/CustomConverterTest=============1
#Total Tests in com.thoughtworks.acceptance/CustomConverterTest=============0
