#!/bin/bash

echo "computing slice for ParameterTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ParameterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ParameterTest.trace org.apache.commons.validator.ParameterTest.assertParameterValue:102:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ParameterTest/ParameterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ParameterTest.trace org.apache.commons.validator.ParameterTest.assertParameterValue:103:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ParameterTest/ParameterTest2.txt

#Total Asserts in org.apache.commons.validator/ParameterTest=============2
#Total Tests in org.apache.commons.validator/ParameterTest=============0
