#!/bin/bash

echo "computing slice for DefaultNamestepTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/DefaultNamestepTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/DefaultNamestepTest.trace org.jaxen.test.DefaultNamestepTest.testIdentitySetUsageInDefaultNameStep:108:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/DefaultNamestepTest/DefaultNamestepTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/DefaultNamestepTest.trace org.jaxen.test.DefaultNamestepTest.testIdentitySetUsageInDefaultNameStep:109:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/DefaultNamestepTest/DefaultNamestepTest2.txt

#Total Asserts in org.jaxen.test/DefaultNamestepTest=============2
#Total Tests in org.jaxen.test/DefaultNamestepTest=============0
