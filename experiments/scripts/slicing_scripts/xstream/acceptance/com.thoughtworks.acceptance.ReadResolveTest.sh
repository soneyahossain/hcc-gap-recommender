#!/bin/bash

echo "computing slice for ReadResolveTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ReadResolveTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ReadResolveTest.trace com.thoughtworks.acceptance.ReadResolveTest.testReadResolveWithDefaultSerialization:42:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ReadResolveTest/ReadResolveTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ReadResolveTest.trace com.thoughtworks.acceptance.ReadResolveTest.testReadResolveWithDefaultSerialization:44:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ReadResolveTest/ReadResolveTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/ReadResolveTest.trace com.thoughtworks.acceptance.ReadResolveTest.testReadResolveWithXStream:53:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/ReadResolveTest/ReadResolveTest3.txt

#Total Asserts in com.thoughtworks.acceptance/ReadResolveTest=============3
#Total Tests in com.thoughtworks.acceptance/ReadResolveTest=============0
