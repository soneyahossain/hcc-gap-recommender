#!/bin/bash

echo "computing slice for ColognePhoneticTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/ColognePhoneticTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/ColognePhoneticTest.trace org.apache.commons.codec.language.ColognePhoneticTest.finishTests:83:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/ColognePhoneticTest/ColognePhoneticTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/ColognePhoneticTest.trace org.apache.commons.codec.language.ColognePhoneticTest.testIsEncodeEquals:222:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/ColognePhoneticTest/ColognePhoneticTest2.txt

#Total Asserts in org.apache.commons.codec.language/ColognePhoneticTest=============2
#Total Tests in org.apache.commons.codec.language/ColognePhoneticTest=============0
