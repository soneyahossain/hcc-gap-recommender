#!/bin/bash

echo "computing slice for ReflectionToStringBuilderExcludeTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/builder_slices/ReflectionToStringBuilderExcludeTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/builder_traces/ReflectionToStringBuilderExcludeTest.trace org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.validateNonSecretField:138:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/builder_slices/ReflectionToStringBuilderExcludeTest/ReflectionToStringBuilderExcludeTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/builder_traces/ReflectionToStringBuilderExcludeTest.trace org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.validateNonSecretField:139:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/builder_slices/ReflectionToStringBuilderExcludeTest/ReflectionToStringBuilderExcludeTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/builder_traces/ReflectionToStringBuilderExcludeTest.trace org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.validateSecretFieldAbsent:143:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/builder_slices/ReflectionToStringBuilderExcludeTest/ReflectionToStringBuilderExcludeTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/builder_traces/ReflectionToStringBuilderExcludeTest.trace org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.validateSecretFieldPresent:148:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/builder_slices/ReflectionToStringBuilderExcludeTest/ReflectionToStringBuilderExcludeTest4.txt

#Total Asserts in org.apache.commons.lang3.builder/ReflectionToStringBuilderExcludeTest=============4
#Total Tests in org.apache.commons.lang3.builder/ReflectionToStringBuilderExcludeTest=============0
