#!/bin/bash

echo "computing slice for VertexTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:33:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:35:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:37:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:41:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:45:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:47:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:49:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/VertexTest.trace org.codehaus.plexus.util.dag.VertexTest.testVertex:51:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/VertexTest/VertexTest8.txt

#Total Asserts in org.codehaus.plexus.util.dag/VertexTest=============8
#Total Tests in org.codehaus.plexus.util.dag/VertexTest=============0
