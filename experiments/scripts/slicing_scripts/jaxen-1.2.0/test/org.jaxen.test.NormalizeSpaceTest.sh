#!/bin/bash

echo "computing slice for NormalizeSpaceTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NormalizeSpaceTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NormalizeSpaceTest.trace org.jaxen.test.NormalizeSpaceTest.testNormalizeSpaceUsesXMLSpaceRulesNotJavaRules:91:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NormalizeSpaceTest/NormalizeSpaceTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NormalizeSpaceTest.trace org.jaxen.test.NormalizeSpaceTest.testNormalizeSpaceUsesXMLSpaceRulesNotJavaRules2:100:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NormalizeSpaceTest/NormalizeSpaceTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NormalizeSpaceTest.trace org.jaxen.test.NormalizeSpaceTest.testNormalizeSpaceInContextNode:107:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NormalizeSpaceTest/NormalizeSpaceTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NormalizeSpaceTest.trace org.jaxen.test.NormalizeSpaceTest.testNormalizeSpaceRequiresAtMostOneArguments:120:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NormalizeSpaceTest/NormalizeSpaceTest4.txt

#Total Asserts in org.jaxen.test/NormalizeSpaceTest=============4
#Total Tests in org.jaxen.test/NormalizeSpaceTest=============0
