#!/bin/bash

echo "computing slice for IBANCheckDigitTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/IBANCheckDigitTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/IBANCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.IBANCheckDigitTest.testOther:200:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/IBANCheckDigitTest/IBANCheckDigitTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/IBANCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.IBANCheckDigitTest.testOther:198:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/IBANCheckDigitTest/IBANCheckDigitTest2.txt

#Total Asserts in org.apache.commons.validator.routines.checkdigit/IBANCheckDigitTest=============2
#Total Tests in org.apache.commons.validator.routines.checkdigit/IBANCheckDigitTest=============0
