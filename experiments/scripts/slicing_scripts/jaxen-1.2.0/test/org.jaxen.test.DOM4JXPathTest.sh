#!/bin/bash

echo "computing slice for DOM4JXPathTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testSelection:100:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testSelection:102:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testSelection:104:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testSelection:106:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testSelection:108:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testAsBoolean:118:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testAsBoolean:121:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testJaxen20AttributeNamespaceNodes:136:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testJaxen16:149:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testNamespaceNodesAreInherited:169:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DOM4JXPathTest.trace org.jaxen.test.DOM4JXPathTest.testSyntaxException:181:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DOM4JXPathTest/DOM4JXPathTest11.txt

#Total Asserts in org.jaxen.test/DOM4JXPathTest=============11
#Total Tests in org.jaxen.test/DOM4JXPathTest=============0
