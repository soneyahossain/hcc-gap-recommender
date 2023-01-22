#!/bin/bash

echo "computing slice for LocalNameTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameOfNumber:101:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameWithTwoArguments:115:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameAllowsNoArguments:123:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameOfCommentIsEmptyString:132:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameOfEmptyNodeSetIsEmptyString:139:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameOfProcessingInstructionIsTarget:148:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameOfAttribute:157:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameOfTextIsEmptyString:166:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameOfNamespaceIsPrefix:173:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/LocalNameTest.trace org.jaxen.test.LocalNameTest.testLocalNameNoArguments:182:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/LocalNameTest/LocalNameTest10.txt

#Total Asserts in org.jaxen.test/LocalNameTest=============10
#Total Tests in org.jaxen.test/LocalNameTest=============0
