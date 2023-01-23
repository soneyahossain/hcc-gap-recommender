#!/bin/bash

echo "computing slice for DateTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/DateTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/DateTest.trace org.apache.commons.validator.DateTest.valueTest:102:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/DateTest/DateTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/DateTest.trace org.apache.commons.validator.DateTest.valueTest:106:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/DateTest/DateTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/DateTest.trace org.apache.commons.validator.DateTest.valueTest:107:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/DateTest/DateTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/DateTest.trace org.apache.commons.validator.DateTest.valueTest:108:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/DateTest/DateTest4.txt

#Total Asserts in org.apache.commons.validator/DateTest=============4
#Total Tests in org.apache.commons.validator/DateTest=============0
