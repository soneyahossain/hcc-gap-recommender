#!/bin/bash

echo "computing slice for CloneablesTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testCloneOfCloneable:24:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testCloneOfNotCloneable:29:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testCloneOfUncloneable:38:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testPossibleCloneOfCloneable:45:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testCloneOfStringArray:49:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testCloneOfPrimitiveArray:56:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testCloneOfPrimitiveArray:57:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/CloneablesTest.trace com.thoughtworks.xstream.core.util.CloneablesTest.testPossibleCloneOfNotCloneable:62:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/CloneablesTest/CloneablesTest8.txt

#Total Asserts in com.thoughtworks.xstream.core.util/CloneablesTest=============8
#Total Tests in com.thoughtworks.xstream.core.util/CloneablesTest=============0
