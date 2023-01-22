#!/bin/bash

echo "computing slice for SedolCheckDigitTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/SedolCheckDigitTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/checkdigit_traces/SedolCheckDigitTest.trace org.apache.commons.validator.routines.checkdigit.SedolCheckDigitTest.testVALIDATOR_346:65:*>$HCC_EXPERIMENTS/slices/commons-validator/checkdigit_slices/SedolCheckDigitTest/SedolCheckDigitTest1.txt

#Total Asserts in org.apache.commons.validator.routines.checkdigit/SedolCheckDigitTest=============1
#Total Tests in org.apache.commons.validator.routines.checkdigit/SedolCheckDigitTest=============0
