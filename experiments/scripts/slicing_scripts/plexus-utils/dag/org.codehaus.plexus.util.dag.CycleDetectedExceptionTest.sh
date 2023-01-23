#!/bin/bash

echo "computing slice for CycleDetectedExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectedExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectedExceptionTest.trace org.codehaus.plexus.util.dag.CycleDetectedExceptionTest.testException:43:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectedExceptionTest/CycleDetectedExceptionTest1.txt

#Total Asserts in org.codehaus.plexus.util.dag/CycleDetectedExceptionTest=============1
#Total Tests in org.codehaus.plexus.util.dag/CycleDetectedExceptionTest=============0
