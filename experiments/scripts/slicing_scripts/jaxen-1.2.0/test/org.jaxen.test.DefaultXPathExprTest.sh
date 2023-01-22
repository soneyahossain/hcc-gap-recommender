#!/bin/bash

echo "computing slice for DefaultXPathExprTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DefaultXPathExprTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DefaultXPathExprTest.trace org.jaxen.test.DefaultXPathExprTest.testJAXEN40:99:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DefaultXPathExprTest/DefaultXPathExprTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DefaultXPathExprTest.trace org.jaxen.test.DefaultXPathExprTest.testJAXEN40:100:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DefaultXPathExprTest/DefaultXPathExprTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DefaultXPathExprTest.trace org.jaxen.test.DefaultXPathExprTest.testJAXEN40:101:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DefaultXPathExprTest/DefaultXPathExprTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DefaultXPathExprTest.trace org.jaxen.test.DefaultXPathExprTest.testJAXEN160GetText:112:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DefaultXPathExprTest/DefaultXPathExprTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/DefaultXPathExprTest.trace org.jaxen.test.DefaultXPathExprTest.testJAXEN160ToString:121:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/DefaultXPathExprTest/DefaultXPathExprTest5.txt

#Total Asserts in org.jaxen.test/DefaultXPathExprTest=============5
#Total Tests in org.jaxen.test/DefaultXPathExprTest=============0
