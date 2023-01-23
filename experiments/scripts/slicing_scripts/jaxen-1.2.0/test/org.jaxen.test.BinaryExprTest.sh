#!/bin/bash

echo "computing slice for BinaryExprTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BinaryExprTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BinaryExprTest.trace org.jaxen.test.BinaryExprTest.testBooleanPrecedence:77:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BinaryExprTest/BinaryExprTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BinaryExprTest.trace org.jaxen.test.BinaryExprTest.testBooleanPrecedence:80:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BinaryExprTest/BinaryExprTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BinaryExprTest.trace org.jaxen.test.BinaryExprTest.testBooleanPrecedence:85:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BinaryExprTest/BinaryExprTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BinaryExprTest.trace org.jaxen.test.BinaryExprTest.testBooleanPrecedence:86:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BinaryExprTest/BinaryExprTest4.txt

#Total Asserts in org.jaxen.test/BinaryExprTest=============4
#Total Tests in org.jaxen.test/BinaryExprTest=============0
