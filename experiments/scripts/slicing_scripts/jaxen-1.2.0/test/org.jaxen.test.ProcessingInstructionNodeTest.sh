#!/bin/bash

echo "computing slice for ProcessingInstructionNodeTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ProcessingInstructionNodeTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/ProcessingInstructionNodeTest.trace org.jaxen.test.ProcessingInstructionNodeTest.testGetText:75:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ProcessingInstructionNodeTest/ProcessingInstructionNodeTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/ProcessingInstructionNodeTest.trace org.jaxen.test.ProcessingInstructionNodeTest.testGetTextWithName:84:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ProcessingInstructionNodeTest/ProcessingInstructionNodeTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/ProcessingInstructionNodeTest.trace org.jaxen.test.ProcessingInstructionNodeTest.testGetTextWithPredicate:93:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ProcessingInstructionNodeTest/ProcessingInstructionNodeTest3.txt

#Total Asserts in org.jaxen.test/ProcessingInstructionNodeTest=============3
#Total Tests in org.jaxen.test/ProcessingInstructionNodeTest=============0
