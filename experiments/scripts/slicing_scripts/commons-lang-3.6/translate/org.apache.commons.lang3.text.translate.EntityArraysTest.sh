#!/bin/bash

echo "computing slice for EntityArraysTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/translate_slices/EntityArraysTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/translate_traces/EntityArraysTest.trace org.apache.commons.lang3.text.translate.EntityArraysTest.testHTML40_EXTENDED_ESCAPE:50:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/translate_slices/EntityArraysTest/EntityArraysTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/translate_traces/EntityArraysTest.trace org.apache.commons.lang3.text.translate.EntityArraysTest.testHTML40_EXTENDED_ESCAPE:51:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/translate_slices/EntityArraysTest/EntityArraysTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/translate_traces/EntityArraysTest.trace org.apache.commons.lang3.text.translate.EntityArraysTest.testISO8859_1_ESCAPE:74:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/translate_slices/EntityArraysTest/EntityArraysTest3.txt

#Total Asserts in org.apache.commons.lang3.text.translate/EntityArraysTest=============3
#Total Tests in org.apache.commons.lang3.text.translate/EntityArraysTest=============0
