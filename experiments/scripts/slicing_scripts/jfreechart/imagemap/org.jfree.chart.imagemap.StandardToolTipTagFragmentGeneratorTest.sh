#!/bin/bash

echo "computing slice for StandardToolTipTagFragmentGeneratorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/StandardToolTipTagFragmentGeneratorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/imagemap_traces/StandardToolTipTagFragmentGeneratorTest.trace org.jfree.chart.imagemap.StandardToolTipTagFragmentGeneratorTest.testGenerateURLFragment:58:*>$HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/StandardToolTipTagFragmentGeneratorTest/StandardToolTipTagFragmentGeneratorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/imagemap_traces/StandardToolTipTagFragmentGeneratorTest.trace org.jfree.chart.imagemap.StandardToolTipTagFragmentGeneratorTest.testGenerateURLFragment:60:*>$HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/StandardToolTipTagFragmentGeneratorTest/StandardToolTipTagFragmentGeneratorTest2.txt

#Total Asserts in org.jfree.chart.imagemap/StandardToolTipTagFragmentGeneratorTest=============2
#Total Tests in org.jfree.chart.imagemap/StandardToolTipTagFragmentGeneratorTest=============0
