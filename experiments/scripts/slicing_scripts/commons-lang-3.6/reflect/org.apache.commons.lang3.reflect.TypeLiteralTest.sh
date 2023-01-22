#!/bin/bash

echo "computing slice for TypeLiteralTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/reflect_slices/TypeLiteralTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/reflect_traces/TypeLiteralTest.trace org.apache.commons.lang3.reflect.TypeLiteralTest.testBasic:38:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/reflect_slices/TypeLiteralTest/TypeLiteralTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/reflect_traces/TypeLiteralTest.trace org.apache.commons.lang3.reflect.TypeLiteralTest.testBasic:39:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/reflect_slices/TypeLiteralTest/TypeLiteralTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/reflect_traces/TypeLiteralTest.trace org.apache.commons.lang3.reflect.TypeLiteralTest.testTyped:46:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/reflect_slices/TypeLiteralTest/TypeLiteralTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/reflect_traces/TypeLiteralTest.trace org.apache.commons.lang3.reflect.TypeLiteralTest.testTyped:48:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/reflect_slices/TypeLiteralTest/TypeLiteralTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/reflect_traces/TypeLiteralTest.trace org.apache.commons.lang3.reflect.TypeLiteralTest.testEquals:53:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/reflect_slices/TypeLiteralTest/TypeLiteralTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/reflect_traces/TypeLiteralTest.trace org.apache.commons.lang3.reflect.TypeLiteralTest.testEquals:54:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/reflect_slices/TypeLiteralTest/TypeLiteralTest6.txt

#Total Asserts in org.apache.commons.lang3.reflect/TypeLiteralTest=============6
#Total Tests in org.apache.commons.lang3.reflect/TypeLiteralTest=============0
