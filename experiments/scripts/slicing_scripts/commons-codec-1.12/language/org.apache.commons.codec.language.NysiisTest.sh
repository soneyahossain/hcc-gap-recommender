#!/bin/bash

echo "computing slice for NysiisTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/NysiisTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/NysiisTest.trace org.apache.commons.codec.language.NysiisTest.assertEncodings:46:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/NysiisTest/NysiisTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/NysiisTest.trace org.apache.commons.codec.language.NysiisTest.encodeAll:57:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/NysiisTest/NysiisTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/NysiisTest.trace org.apache.commons.codec.language.NysiisTest.testTrueVariant:299:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/NysiisTest/NysiisTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/NysiisTest.trace org.apache.commons.codec.language.NysiisTest.testTrueVariant:300:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/NysiisTest/NysiisTest4.txt

#Total Asserts in org.apache.commons.codec.language/NysiisTest=============4
#Total Tests in org.apache.commons.codec.language/NysiisTest=============0
