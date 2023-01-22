#!/bin/bash

echo "computing slice for LiteralExprTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LiteralExprTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/LiteralExprTest.trace org.jaxen.test.LiteralExprTest.testStringLiteralContainsDoubleQuote:77:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LiteralExprTest/LiteralExprTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/LiteralExprTest.trace org.jaxen.test.LiteralExprTest.testStringLiteralContainsSingleQuote:86:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LiteralExprTest/LiteralExprTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/LiteralExprTest.trace org.jaxen.test.LiteralExprTest.testJaxen177:95:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/LiteralExprTest/LiteralExprTest3.txt

#Total Asserts in org.jaxen.test/LiteralExprTest=============3
#Total Tests in org.jaxen.test/LiteralExprTest=============0
