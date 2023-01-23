#!/bin/bash

echo "computing slice for LocaleTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/LocaleTest.trace org.apache.commons.validator.LocaleTest.valueTest:175:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest/LocaleTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/LocaleTest.trace org.apache.commons.validator.LocaleTest.valueTest:185:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest/LocaleTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/LocaleTest.trace org.apache.commons.validator.LocaleTest.valueTest:182:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest/LocaleTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/LocaleTest.trace org.apache.commons.validator.LocaleTest.valueTest:192:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest/LocaleTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/LocaleTest.trace org.apache.commons.validator.LocaleTest.valueTest:189:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest/LocaleTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/LocaleTest.trace org.apache.commons.validator.LocaleTest.valueTest:199:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest/LocaleTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/LocaleTest.trace org.apache.commons.validator.LocaleTest.valueTest:196:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/LocaleTest/LocaleTest7.txt

#Total Asserts in org.apache.commons.validator/LocaleTest=============7
#Total Tests in org.apache.commons.validator/LocaleTest=============0
