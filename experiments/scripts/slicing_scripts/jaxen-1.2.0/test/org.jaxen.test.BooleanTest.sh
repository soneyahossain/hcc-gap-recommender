#!/bin/bash

echo "computing slice for BooleanTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testNonEmptyNodeSetsAreTrue:105:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testNonEmptyNodeSetsAreTrue:106:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testEmptyNodeSetsAreFalse:129:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testEmptyNodeSetsAreFalse:130:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testZeroIsFalse:141:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testZeroIsFalse:142:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testEmptyStringIsFalse:153:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testEmptyStringIsFalse:154:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testNaNIsFalse:163:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testNonEmptyStringIsTrue:174:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testNonEmptyStringIsTrue:175:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testBooleanFunctionRequiresOneArgument:190:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/BooleanTest.trace org.jaxen.test.BooleanTest.testBooleanFunctionRequiresExactlyOneArgument:206:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/BooleanTest/BooleanTest13.txt

#Total Asserts in org.jaxen.test/BooleanTest=============13
#Total Tests in org.jaxen.test/BooleanTest=============0
