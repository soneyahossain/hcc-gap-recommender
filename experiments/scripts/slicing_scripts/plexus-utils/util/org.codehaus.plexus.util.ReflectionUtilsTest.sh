#!/bin/bash

echo "computing slice for ReflectionUtilsTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/util_slices/ReflectionUtilsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/ReflectionUtilsTest.trace org.codehaus.plexus.util.ReflectionUtilsTest.testSimpleVariableAccess:45:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/ReflectionUtilsTest/ReflectionUtilsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/ReflectionUtilsTest.trace org.codehaus.plexus.util.ReflectionUtilsTest.testComplexVariableAccess:55:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/ReflectionUtilsTest/ReflectionUtilsTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/ReflectionUtilsTest.trace org.codehaus.plexus.util.ReflectionUtilsTest.testComplexVariableAccess:56:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/ReflectionUtilsTest/ReflectionUtilsTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/ReflectionUtilsTest.trace org.codehaus.plexus.util.ReflectionUtilsTest.testSuperClassVariableAccess:63:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/ReflectionUtilsTest/ReflectionUtilsTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/ReflectionUtilsTest.trace org.codehaus.plexus.util.ReflectionUtilsTest.testSettingVariableValue:72:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/ReflectionUtilsTest/ReflectionUtilsTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/ReflectionUtilsTest.trace org.codehaus.plexus.util.ReflectionUtilsTest.testSettingVariableValue:77:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/ReflectionUtilsTest/ReflectionUtilsTest6.txt

#Total Asserts in org.codehaus.plexus.util/ReflectionUtilsTest=============6
#Total Tests in org.codehaus.plexus.util/ReflectionUtilsTest=============0
