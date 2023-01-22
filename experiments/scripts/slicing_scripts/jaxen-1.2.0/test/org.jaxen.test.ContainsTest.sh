#!/bin/bash

echo "computing slice for ContainsTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsNumber:89:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsString:96:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsString3:103:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsNumber2:110:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsString2:117:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testEmptyStringContainsNonEmptyString:125:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testEmptyStringContainsEmptyString:132:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsEmptyString:139:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsFunctionRequiresAtLeastTwoArguments:152:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/ContainsTest.trace org.jaxen.test.ContainsTest.testContainsFunctionRequiresAtMostTwoArguments:167:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/ContainsTest/ContainsTest10.txt

#Total Asserts in org.jaxen.test/ContainsTest=============10
#Total Tests in org.jaxen.test/ContainsTest=============0
