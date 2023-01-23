#!/bin/bash

echo "computing slice for ExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ExceptionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ExceptionTest.trace org.apache.commons.validator.ExceptionTest.testValidatorException:75:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ExceptionTest/ExceptionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ExceptionTest.trace org.apache.commons.validator.ExceptionTest.XtestCheckedException:139:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ExceptionTest/ExceptionTest2.txt

#Total Asserts in org.apache.commons.validator/ExceptionTest=============2
#Total Tests in org.apache.commons.validator/ExceptionTest=============0
