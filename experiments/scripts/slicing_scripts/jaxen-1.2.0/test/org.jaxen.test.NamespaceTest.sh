#!/bin/bash

echo "computing slice for NamespaceTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testMultipleNamespaceAxis:89:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testNumberOfNamespaceNodes:102:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testNamespaceAxis:117:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testUnprefixedNamespaceAxis:131:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testNamespaceNodesReadFromAttributes:147:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testUnboundNamespaceUsedInXPathExpression:162:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testQueryDefaultNamespace:175:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceTest.trace org.jaxen.test.NamespaceTest.testQueryDefaultNamespaceWithContext:189:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceTest/NamespaceTest8.txt

#Total Asserts in org.jaxen.test/NamespaceTest=============8
#Total Tests in org.jaxen.test/NamespaceTest=============0
