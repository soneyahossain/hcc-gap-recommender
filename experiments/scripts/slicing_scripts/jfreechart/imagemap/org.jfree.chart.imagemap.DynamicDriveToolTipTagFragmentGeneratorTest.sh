#!/bin/bash

echo "computing slice for DynamicDriveToolTipTagFragmentGeneratorTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/DynamicDriveToolTipTagFragmentGeneratorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/imagemap_traces/DynamicDriveToolTipTagFragmentGeneratorTest.trace org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGeneratorTest.testGenerateURLFragment:58:*>$HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/DynamicDriveToolTipTagFragmentGeneratorTest/DynamicDriveToolTipTagFragmentGeneratorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/imagemap_traces/DynamicDriveToolTipTagFragmentGeneratorTest.trace org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGeneratorTest.testGenerateURLFragment:61:*>$HCC_EXPERIMENTS/slices/jfreechart/imagemap_slices/DynamicDriveToolTipTagFragmentGeneratorTest/DynamicDriveToolTipTagFragmentGeneratorTest2.txt

#Total Asserts in org.jfree.chart.imagemap/DynamicDriveToolTipTagFragmentGeneratorTest=============2
#Total Tests in org.jfree.chart.imagemap/DynamicDriveToolTipTagFragmentGeneratorTest=============0
