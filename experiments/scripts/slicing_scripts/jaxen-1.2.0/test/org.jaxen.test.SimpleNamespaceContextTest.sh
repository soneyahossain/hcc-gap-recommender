#!/bin/bash

echo "computing slice for SimpleNamespaceContextTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleNamespaceContextTest.trace org.jaxen.test.SimpleNamespaceContextTest.testMapCopy:94:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest/SimpleNamespaceContextTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleNamespaceContextTest.trace org.jaxen.test.SimpleNamespaceContextTest.testCantUseNonStringsAsValues:105:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest/SimpleNamespaceContextTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleNamespaceContextTest.trace org.jaxen.test.SimpleNamespaceContextTest.testCantUseNonStringsAsKeys:117:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest/SimpleNamespaceContextTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleNamespaceContextTest.trace org.jaxen.test.SimpleNamespaceContextTest.testContextFromElement:131:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest/SimpleNamespaceContextTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleNamespaceContextTest.trace org.jaxen.test.SimpleNamespaceContextTest.testSerialization:155:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest/SimpleNamespaceContextTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleNamespaceContextTest.trace org.jaxen.test.SimpleNamespaceContextTest.testSerialization:156:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest/SimpleNamespaceContextTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SimpleNamespaceContextTest.trace org.jaxen.test.SimpleNamespaceContextTest.testSerialization:157:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SimpleNamespaceContextTest/SimpleNamespaceContextTest7.txt

#Total Asserts in org.jaxen.test/SimpleNamespaceContextTest=============7
#Total Tests in org.jaxen.test/SimpleNamespaceContextTest=============0
