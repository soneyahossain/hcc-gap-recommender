#!/bin/bash

echo "computing slice for UrlTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/UrlTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/UrlTest.trace org.apache.commons.validator.UrlTest.testIsValidScheme:65:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/UrlTest/UrlTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/UrlTest.trace org.apache.commons.validator.UrlTest.testIsValid:88:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/UrlTest/UrlTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/UrlTest.trace org.apache.commons.validator.UrlTest.testIsValid:89:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/UrlTest/UrlTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/UrlTest.trace org.apache.commons.validator.UrlTest.testIsValid:106:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/UrlTest/UrlTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/UrlTest.trace org.apache.commons.validator.UrlTest.testValidator204:138:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/UrlTest/UrlTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/UrlTest.trace org.apache.commons.validator.UrlTest.testValidateUrl:179:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/UrlTest/UrlTest6.txt

#Total Asserts in org.apache.commons.validator/UrlTest=============6
#Total Tests in org.apache.commons.validator/UrlTest=============0
