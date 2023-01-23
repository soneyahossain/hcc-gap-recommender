#!/bin/bash

echo "computing slice for EmailTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EmailTest.trace org.apache.commons.validator.EmailTest.testEmailWithControlChars:210:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest/EmailTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EmailTest.trace org.apache.commons.validator.EmailTest.testEmailWithControlChars:212:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest/EmailTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EmailTest.trace org.apache.commons.validator.EmailTest.testEmailAtTLD:228:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest/EmailTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EmailTest.trace org.apache.commons.validator.EmailTest.valueTest:439:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest/EmailTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EmailTest.trace org.apache.commons.validator.EmailTest.valueTest:443:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest/EmailTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EmailTest.trace org.apache.commons.validator.EmailTest.valueTest:444:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest/EmailTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/EmailTest.trace org.apache.commons.validator.EmailTest.valueTest:445:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/EmailTest/EmailTest7.txt

#Total Asserts in org.apache.commons.validator/EmailTest=============7
#Total Tests in org.apache.commons.validator/EmailTest=============0
