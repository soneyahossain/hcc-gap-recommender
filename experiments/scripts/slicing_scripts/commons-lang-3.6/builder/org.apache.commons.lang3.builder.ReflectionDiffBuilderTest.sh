#!/bin/bash

echo "computing slice for ReflectionDiffBuilderTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/ReflectionDiffBuilderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/ReflectionDiffBuilderTest.trace org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_no_differences:91:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/ReflectionDiffBuilderTest/ReflectionDiffBuilderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/ReflectionDiffBuilderTest.trace org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_primitive_difference:101:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/ReflectionDiffBuilderTest/ReflectionDiffBuilderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/ReflectionDiffBuilderTest.trace org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_array_difference:111:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/ReflectionDiffBuilderTest/ReflectionDiffBuilderTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/ReflectionDiffBuilderTest.trace org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_transient_field_difference:122:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/ReflectionDiffBuilderTest/ReflectionDiffBuilderTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/ReflectionDiffBuilderTest.trace org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_no_differences_inheritance:131:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/ReflectionDiffBuilderTest/ReflectionDiffBuilderTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/builder_traces/ReflectionDiffBuilderTest.trace org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_difference_in_inherited_field:141:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/builder_slices/ReflectionDiffBuilderTest/ReflectionDiffBuilderTest6.txt

#Total Asserts in org.apache.commons.lang3.builder/ReflectionDiffBuilderTest=============6
#Total Tests in org.apache.commons.lang3.builder/ReflectionDiffBuilderTest=============0
