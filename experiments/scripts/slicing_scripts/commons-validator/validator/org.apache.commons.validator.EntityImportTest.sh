#!/bin/bash

echo "computing slice for EntityImportTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EntityImportTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EntityImportTest.trace org.apache.commons.validator.EntityImportTest.testEntityImport:40:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EntityImportTest/EntityImportTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EntityImportTest.trace org.apache.commons.validator.EntityImportTest.testParseURL:49:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EntityImportTest/EntityImportTest2.txt

#Total Asserts in org.apache.commons.validator/EntityImportTest=============2
#Total Tests in org.apache.commons.validator/EntityImportTest=============0
