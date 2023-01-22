#!/bin/bash

echo "computing slice for NameTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameOfNumber:101:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameWithTwoArguments:115:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameAllowsNoArguments:123:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameOfCommentIsEmptyString:132:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameOfProcessingInstructionIsTarget:141:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameOfAttribute:150:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameOfTextIsEmptyString:159:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameOfNamespaceIsPrefix:166:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/NameTest.trace org.jaxen.test.NameTest.testNameNoArguments:175:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/NameTest/NameTest9.txt

#Total Asserts in org.jaxen.test/NameTest=============9
#Total Tests in org.jaxen.test/NameTest=============0
