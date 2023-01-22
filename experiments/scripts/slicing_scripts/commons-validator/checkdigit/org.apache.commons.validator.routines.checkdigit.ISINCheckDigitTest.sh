#!/bin/bash

echo "computing slice for ISINCheckDigitTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISINCheckDigitTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/ISINCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.ISINCheckDigitTest.testVALIDATOR_345:65:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/ISINCheckDigitTest/ISINCheckDigitTest1.txt

#Total Asserts in org.apache.commons.validator.routines.checkdigit/ISINCheckDigitTest=============1
#Total Tests in org.apache.commons.validator.routines.checkdigit/ISINCheckDigitTest=============0
