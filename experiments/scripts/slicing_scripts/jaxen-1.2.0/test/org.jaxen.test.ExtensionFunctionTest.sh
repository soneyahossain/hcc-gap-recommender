#!/bin/bash

echo "computing slice for ExtensionFunctionTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ExtensionFunctionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ExtensionFunctionTest.trace org.jaxen.test.ExtensionFunctionTest.testRegisterExtensionFunction:133:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ExtensionFunctionTest/ExtensionFunctionTest1.txt

#Total Asserts in org.jaxen.test/ExtensionFunctionTest=============1
#Total Tests in org.jaxen.test/ExtensionFunctionTest=============0
