#!/bin/bash

echo "computing slice for Caverphone2Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/Caverphone2Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/Caverphone2Test.trace org.apache.commons.codec.language.Caverphone2Test.testIsCaverphoneEquals:347:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/Caverphone2Test/Caverphone2Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/Caverphone2Test.trace org.apache.commons.codec.language.Caverphone2Test.testIsCaverphoneEquals:348:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/Caverphone2Test/Caverphone2Test2.txt

#Total Asserts in org.apache.commons.codec.language/Caverphone2Test=============2
#Total Tests in org.apache.commons.codec.language/Caverphone2Test=============0
