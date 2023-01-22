#!/bin/bash

echo "computing slice for JDOMXPathTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JDOMXPathTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/JDOMXPathTest.trace org.jaxen.test.JDOMXPathTest.testJaxen20AttributeNamespaceNodes:185:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JDOMXPathTest/JDOMXPathTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/JDOMXPathTest.trace org.jaxen.test.JDOMXPathTest.testNamespaceNodesAreInherited:206:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/JDOMXPathTest/JDOMXPathTest2.txt

#Total Asserts in org.jaxen.test/JDOMXPathTest=============2
#Total Tests in org.jaxen.test/JDOMXPathTest=============0
