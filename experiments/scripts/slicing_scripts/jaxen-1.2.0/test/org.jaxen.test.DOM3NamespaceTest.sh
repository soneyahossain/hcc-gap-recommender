#!/bin/bash

echo "computing slice for DOM3NamespaceTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM3NamespaceTest.trace org.jaxen.test.DOM3NamespaceTest.testGetTextContent:99:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest/DOM3NamespaceTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM3NamespaceTest.trace org.jaxen.test.DOM3NamespaceTest.testSetTextContent:109:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest/DOM3NamespaceTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM3NamespaceTest.trace org.jaxen.test.DOM3NamespaceTest.testGetFeature:115:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest/DOM3NamespaceTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM3NamespaceTest.trace org.jaxen.test.DOM3NamespaceTest.testIsEqualNode:121:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest/DOM3NamespaceTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM3NamespaceTest.trace org.jaxen.test.DOM3NamespaceTest.testIsEqualNode:122:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest/DOM3NamespaceTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM3NamespaceTest.trace org.jaxen.test.DOM3NamespaceTest.testIsSameNode:126:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest/DOM3NamespaceTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM3NamespaceTest.trace org.jaxen.test.DOM3NamespaceTest.testIsSameNode:127:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM3NamespaceTest/DOM3NamespaceTest7.txt

#Total Asserts in org.jaxen.test/DOM3NamespaceTest=============7
#Total Tests in org.jaxen.test/DOM3NamespaceTest=============0
