#!/bin/bash

echo "computing slice for UnicodeUnescaperTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/translate_slices/UnicodeUnescaperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/translate_traces/UnicodeUnescaperTest.trace org.apache.commons.lang3.text.translate.UnicodeUnescaperTest.testUPlus:44:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/translate_slices/UnicodeUnescaperTest/UnicodeUnescaperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/translate_traces/UnicodeUnescaperTest.trace org.apache.commons.lang3.text.translate.UnicodeUnescaperTest.testUuuuu:53:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/translate_slices/UnicodeUnescaperTest/UnicodeUnescaperTest2.txt

#Total Asserts in org.apache.commons.lang3.text.translate/UnicodeUnescaperTest=============2
#Total Tests in org.apache.commons.lang3.text.translate/UnicodeUnescaperTest=============0
