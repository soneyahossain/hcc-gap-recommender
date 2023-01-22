#!/bin/bash

echo "computing slice for IterableAxisTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/IterableAxisTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/IterableAxisTest.trace org.jaxen.test.IterableAxisTest.testIterableSelfNamedAxis:73:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/IterableAxisTest/IterableAxisTest1.txt

#Total Asserts in org.jaxen.test/IterableAxisTest=============1
#Total Tests in org.jaxen.test/IterableAxisTest=============0
