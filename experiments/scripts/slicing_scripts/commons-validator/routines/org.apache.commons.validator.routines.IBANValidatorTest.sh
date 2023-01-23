#!/bin/bash

echo "computing slice for IBANValidatorTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testValid:140:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testValid:141:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testValid:142:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testInValid:149:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testNull:155:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testHasValidator:160:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testHasValidator:161:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testGetValidator:166:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testGetValidator:167:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testSetDefaultValidator1:172:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testSetDefaultValidator2:177:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testSetValidatorLC:183:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testSetValidatorLen7:189:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testSetValidatorLen35:195:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testSetValidatorLen_1:201:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/routines_traces/IBANValidatorTest.trace org.apache.commons.validator.routines.IBANValidatorTest.testSetValidatorLen_1:202:*>$HCC_EXPERIMENTS/slices/commons-validator/routines_slices/IBANValidatorTest/IBANValidatorTest16.txt

#Total Asserts in org.apache.commons.validator.routines/IBANValidatorTest=============16
#Total Tests in org.apache.commons.validator.routines/IBANValidatorTest=============0