#!/bin/bash

echo "computing slice for TopologicalSorterTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/TopologicalSorterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/TopologicalSorterTest.trace org.codehaus.plexus.util.dag.TopologicalSorterTest.testDfs:53:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/TopologicalSorterTest/TopologicalSorterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/TopologicalSorterTest.trace org.codehaus.plexus.util.dag.TopologicalSorterTest.testDfs:81:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/TopologicalSorterTest/TopologicalSorterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/TopologicalSorterTest.trace org.codehaus.plexus.util.dag.TopologicalSorterTest.testDfs:138:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/TopologicalSorterTest/TopologicalSorterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/TopologicalSorterTest.trace org.codehaus.plexus.util.dag.TopologicalSorterTest.testDfs:191:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/TopologicalSorterTest/TopologicalSorterTest4.txt

#Total Asserts in org.codehaus.plexus.util.dag/TopologicalSorterTest=============4
#Total Tests in org.codehaus.plexus.util.dag/TopologicalSorterTest=============0
