#!/bin/bash

echo "computing slice for SingletonListTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SingletonListTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/SingletonListTest.trace org.jaxen.test.SingletonListTest.testIndexOutOfBoundsException:64:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/SingletonListTest/SingletonListTest1.txt

#Total Asserts in org.jaxen.test/SingletonListTest=============1
#Total Tests in org.jaxen.test/SingletonListTest=============0
