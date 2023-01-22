#!/bin/bash

echo "computing slice for ISBNCheckDigitTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:59:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:60:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:61:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:62:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:68:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:75:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:82:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISBNCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISBNCheckDigitTest.testInvalidLength:89:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISBNCheckDigitTest/ISBNCheckDigitTest8.txt

#Total Asserts in org.apache.commons.validator.routines.checkdigit/ISBNCheckDigitTest=============8
#Total Tests in org.apache.commons.validator.routines.checkdigit/ISBNCheckDigitTest=============0
