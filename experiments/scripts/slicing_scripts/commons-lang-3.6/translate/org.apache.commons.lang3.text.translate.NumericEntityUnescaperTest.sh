#!/bin/bash

echo "computing slice for NumericEntityUnescaperTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testSupplementaryUnescaping:46:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testOutOfBounds:53:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testOutOfBounds:54:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testOutOfBounds:55:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testOutOfBounds:56:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testUnfinishedEntity:67:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/NumericEntityUnescaperTest.trace org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testUnfinishedEntity:75:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/NumericEntityUnescaperTest/NumericEntityUnescaperTest7.txt

#Total Asserts in org.apache.commons.lang3.text.translate/NumericEntityUnescaperTest=============7
#Total Tests in org.apache.commons.lang3.text.translate/NumericEntityUnescaperTest=============0
