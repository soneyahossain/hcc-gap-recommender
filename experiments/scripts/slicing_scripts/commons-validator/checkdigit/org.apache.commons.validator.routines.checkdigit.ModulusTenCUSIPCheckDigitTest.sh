#!/bin/bash

echo "computing slice for ModulusTenCUSIPCheckDigitTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ModulusTenCUSIPCheckDigitTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ModulusTenCUSIPCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ModulusTenCUSIPCheckDigitTest.testVALIDATOR_336_InvalidCheckDigits:62:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ModulusTenCUSIPCheckDigitTest/ModulusTenCUSIPCheckDigitTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ModulusTenCUSIPCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ModulusTenCUSIPCheckDigitTest.testVALIDATOR_336_ValidCheckDigits:71:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ModulusTenCUSIPCheckDigitTest/ModulusTenCUSIPCheckDigitTest2.txt

#Total Asserts in org.apache.commons.validator.routines.checkdigit/ModulusTenCUSIPCheckDigitTest=============2
#Total Tests in org.apache.commons.validator.routines.checkdigit/ModulusTenCUSIPCheckDigitTest=============0
