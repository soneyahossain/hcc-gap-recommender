#!/bin/bash

echo "computing slice for XPathTestBase"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathTestBase

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathTestBase.trace org.jaxen.test.XPathTestBase.assertCountXPath2:125:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathTestBase/XPathTestBase1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathTestBase.trace org.jaxen.test.XPathTestBase.assertValueOfXPath:173:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathTestBase/XPathTestBase2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathTestBase.trace org.jaxen.test.XPathTestBase.assertExprGetTextIdempotent:181:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathTestBase/XPathTestBase3.txt

#Total Asserts in org.jaxen.test/XPathTestBase=============3
#Total Tests in org.jaxen.test/XPathTestBase=============0
