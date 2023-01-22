#!/bin/bash

echo "computing slice for ModTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ModTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/ModTest.trace org.jaxen.test.ModTest.testModofNonIntegers:86:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/ModTest/ModTest1.txt

#Total Asserts in org.jaxen.test/ModTest=============1
#Total Tests in org.jaxen.test/ModTest=============0
