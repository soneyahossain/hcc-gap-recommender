#!/bin/bash

echo "computing slice for DefaultXPathFactoryTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/DefaultXPathFactoryTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/DefaultXPathFactoryTest.trace org.jaxen.test.DefaultXPathFactoryTest.testBadAxis:76:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/DefaultXPathFactoryTest/DefaultXPathFactoryTest1.txt

#Total Asserts in org.jaxen.test/DefaultXPathFactoryTest=============1
#Total Tests in org.jaxen.test/DefaultXPathFactoryTest=============0
