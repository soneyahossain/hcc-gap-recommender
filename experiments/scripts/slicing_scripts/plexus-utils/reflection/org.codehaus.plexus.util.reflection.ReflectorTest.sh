#!/bin/bash

echo "computing slice for ReflectorTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/reflection_slices/ReflectorTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/reflection_traces/ReflectorTest.trace org.codehaus.plexus.util.reflection.ReflectorTest.testObjectPropertyFromName:47:*>$HCC_EXPERIMENTS/slices/plexus-utils/reflection_slices/ReflectorTest/ReflectorTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/reflection_traces/ReflectorTest.trace org.codehaus.plexus.util.reflection.ReflectorTest.testObjectPropertyFromBean:53:*>$HCC_EXPERIMENTS/slices/plexus-utils/reflection_slices/ReflectorTest/ReflectorTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/reflection_traces/ReflectorTest.trace org.codehaus.plexus.util.reflection.ReflectorTest.testObjectPropertyFromField:59:*>$HCC_EXPERIMENTS/slices/plexus-utils/reflection_slices/ReflectorTest/ReflectorTest3.txt

#Total Asserts in org.codehaus.plexus.util.reflection/ReflectorTest=============3
#Total Tests in org.codehaus.plexus.util.reflection/ReflectorTest=============0
