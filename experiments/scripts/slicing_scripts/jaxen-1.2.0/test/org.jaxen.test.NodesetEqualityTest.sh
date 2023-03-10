#!/bin/bash

echo "computing slice for NodesetEqualityTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testEqualsTwoNodesets:117:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testNotEqualsTwoNodesets:124:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testEqualsStringNodeset:131:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testNotEqualsStringNodeset:138:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testEqualsNumberNodeset:145:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testNotEqualsNumberNodeset:152:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testEqualsBooleanNodeset1:159:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testEqualsBooleanNodeset2:167:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testNotEqualsBooleanNodeset1:175:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NodesetEqualityTest.trace org.jaxen.test.NodesetEqualityTest.testNotEqualsBooleanNodeset2:183:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NodesetEqualityTest/NodesetEqualityTest10.txt

#Total Asserts in org.jaxen.test/NodesetEqualityTest=============10
#Total Tests in org.jaxen.test/NodesetEqualityTest=============0
