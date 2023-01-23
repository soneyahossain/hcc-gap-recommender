#!/bin/bash

echo "computing slice for OverLIBToolTipTagFragmentGeneratorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/OverLIBToolTipTagFragmentGeneratorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/imagemap_traces/OverLIBToolTipTagFragmentGeneratorTest.trace org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGeneratorTest.testGenerateURLFragment:58:*>$HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/OverLIBToolTipTagFragmentGeneratorTest/OverLIBToolTipTagFragmentGeneratorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/imagemap_traces/OverLIBToolTipTagFragmentGeneratorTest.trace org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGeneratorTest.testGenerateURLFragment:61:*>$HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/OverLIBToolTipTagFragmentGeneratorTest/OverLIBToolTipTagFragmentGeneratorTest2.txt

#Total Asserts in org.jfree.chart.imagemap/OverLIBToolTipTagFragmentGeneratorTest=============2
#Total Tests in org.jfree.chart.imagemap/OverLIBToolTipTagFragmentGeneratorTest=============0
