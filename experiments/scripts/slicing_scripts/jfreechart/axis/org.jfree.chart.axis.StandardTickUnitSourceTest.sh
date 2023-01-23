#!/bin/bash

echo "computing slice for StandardTickUnitSourceTest"

mkdir -p $HCC_EXPERIMENTS/slices/jfreechart/axis_slices/StandardTickUnitSourceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/StandardTickUnitSourceTest.trace org.jfree.chart.axis.StandardTickUnitSourceTest.testEquals:61:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/StandardTickUnitSourceTest/StandardTickUnitSourceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jfreechart/axis_traces/StandardTickUnitSourceTest.trace org.jfree.chart.axis.StandardTickUnitSourceTest.testSerialization:71:*>$HCC_EXPERIMENTS/slices/jfreechart/axis_slices/StandardTickUnitSourceTest/StandardTickUnitSourceTest2.txt

#Total Asserts in org.jfree.chart.axis/StandardTickUnitSourceTest=============2
#Total Tests in org.jfree.chart.axis/StandardTickUnitSourceTest=============0
