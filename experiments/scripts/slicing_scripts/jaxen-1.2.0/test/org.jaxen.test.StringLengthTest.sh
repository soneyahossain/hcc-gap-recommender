#!/bin/bash

echo "computing slice for StringLengthTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthOfNumber:89:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthOfEmptyString:96:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthOfString:103:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthFunctionOperatesOnContextNode:111:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthWithPrivateUseChars:119:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthFunctionCountsUnicodeCharactersNotJavaChars:127:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthFunctionWithMalformedString:140:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/StringLengthTest.trace org.jaxen.test.StringLengthTest.testStringLengthFunctionRequiresExactlyOneArgument:155:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/StringLengthTest/StringLengthTest8.txt

#Total Asserts in org.jaxen.test/StringLengthTest=============8
#Total Tests in org.jaxen.test/StringLengthTest=============0
