#!/bin/bash

echo "computing slice for NotTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testZeroIsFalse:92:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testZeroIsFalse:93:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testOneIsTrue:103:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testOneIsTrue:104:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testEmptyStringIsFalse:114:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testEmptyStringIsFalse:115:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testNaNIsFalse:124:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testNonEmptyStringIsTrue:134:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testNonEmptyStringIsTrue:135:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testNotFunctionRequiresOneArgument:149:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NotTest.trace org.jaxen.test.NotTest.testNotFunctionRequiresExactlyOneArgument:164:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NotTest/NotTest11.txt

#Total Asserts in org.jaxen.test/NotTest=============11
#Total Tests in org.jaxen.test/NotTest=============0
