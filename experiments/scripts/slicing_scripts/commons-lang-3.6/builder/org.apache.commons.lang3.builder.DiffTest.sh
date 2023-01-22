#!/bin/bash

echo "computing slice for DiffTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/DiffTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/DiffTest.trace org.apache.commons.lang3.builder.DiffTest.testGetFieldName:65:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/DiffTest/DiffTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/DiffTest.trace org.apache.commons.lang3.builder.DiffTest.testGetType:70:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/DiffTest/DiffTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/DiffTest.trace org.apache.commons.lang3.builder.DiffTest.testToString:75:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/DiffTest/DiffTest3.txt

#Total Asserts in org.apache.commons.lang3.builder/DiffTest=============3
#Total Tests in org.apache.commons.lang3.builder/DiffTest=============0
