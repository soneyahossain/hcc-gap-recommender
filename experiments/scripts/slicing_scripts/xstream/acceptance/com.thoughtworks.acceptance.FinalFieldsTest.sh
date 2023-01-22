#!/bin/bash

echo "computing slice for FinalFieldsTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/FinalFieldsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/FinalFieldsTest.trace com.thoughtworks.acceptance.FinalFieldsTest.testExceptionThrownUponSerializationIfNotSupport:47:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/FinalFieldsTest/FinalFieldsTest1.txt

#Total Asserts in com.thoughtworks.acceptance/FinalFieldsTest=============1
#Total Tests in com.thoughtworks.acceptance/FinalFieldsTest=============0
