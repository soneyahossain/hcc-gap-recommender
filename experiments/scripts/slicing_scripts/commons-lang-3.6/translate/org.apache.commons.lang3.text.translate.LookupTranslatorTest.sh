#!/bin/bash

echo "computing slice for LookupTranslatorTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/LookupTranslatorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/LookupTranslatorTest.trace org.apache.commons.lang3.text.translate.LookupTranslatorTest.testBasicLookup:44:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/LookupTranslatorTest/LookupTranslatorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/LookupTranslatorTest.trace org.apache.commons.lang3.text.translate.LookupTranslatorTest.testBasicLookup:45:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/LookupTranslatorTest/LookupTranslatorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/LookupTranslatorTest.trace org.apache.commons.lang3.text.translate.LookupTranslatorTest.testLang882:54:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/LookupTranslatorTest/LookupTranslatorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/LookupTranslatorTest.trace org.apache.commons.lang3.text.translate.LookupTranslatorTest.testLang882:55:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/LookupTranslatorTest/LookupTranslatorTest4.txt

#Total Asserts in org.apache.commons.lang3.text.translate/LookupTranslatorTest=============4
#Total Tests in org.apache.commons.lang3.text.translate/LookupTranslatorTest=============0
