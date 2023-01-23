#!/bin/bash

echo "computing slice for ValidatorResultsTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ValidatorResultsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ValidatorResultsTest.trace org.apache.commons.validator.ValidatorResultsTest.checkNotRun:116:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ValidatorResultsTest/ValidatorResultsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ValidatorResultsTest.trace org.apache.commons.validator.ValidatorResultsTest.checkNotRun:117:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ValidatorResultsTest/ValidatorResultsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ValidatorResultsTest.trace org.apache.commons.validator.ValidatorResultsTest.checkValidatorResult:127:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ValidatorResultsTest/ValidatorResultsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ValidatorResultsTest.trace org.apache.commons.validator.ValidatorResultsTest.checkValidatorResult:128:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ValidatorResultsTest/ValidatorResultsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/ValidatorResultsTest.trace org.apache.commons.validator.ValidatorResultsTest.checkValidatorResult:129:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/ValidatorResultsTest/ValidatorResultsTest5.txt

#Total Asserts in org.apache.commons.validator/ValidatorResultsTest=============5
#Total Tests in org.apache.commons.validator/ValidatorResultsTest=============0
