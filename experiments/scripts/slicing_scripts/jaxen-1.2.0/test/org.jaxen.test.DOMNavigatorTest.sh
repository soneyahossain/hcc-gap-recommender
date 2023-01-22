#!/bin/bash

echo "computing slice for DOMNavigatorTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetAttributeQNameOnElement:93:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetElementQNameOnAttr:101:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetAttributeLocalNameOnElement:109:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetElementLocalNameOnAttr:117:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetAttributeNamespaceURIOnElement:125:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetElementNamespaceURIOnAttr:133:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetTargetOfNonPI:145:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOMNavigatorTest.trace org.jaxen.test.DOMNavigatorTest.testGetDataOfNonPI:158:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOMNavigatorTest/DOMNavigatorTest8.txt

#Total Asserts in org.jaxen.test/DOMNavigatorTest=============8
#Total Tests in org.jaxen.test/DOMNavigatorTest=============0
