#!/bin/bash

echo "computing slice for NotImplementedExceptionTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/lang3_slices/NotImplementedExceptionTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/lang3_traces/NotImplementedExceptionTest.trace org.apache.commons.lang3.NotImplementedExceptionTest.assertCorrect:54:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/lang3_slices/NotImplementedExceptionTest/NotImplementedExceptionTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/lang3_traces/NotImplementedExceptionTest.trace org.apache.commons.lang3.NotImplementedExceptionTest.assertCorrect:55:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/lang3_slices/NotImplementedExceptionTest/NotImplementedExceptionTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/lang3_traces/NotImplementedExceptionTest.trace org.apache.commons.lang3.NotImplementedExceptionTest.assertCorrect:56:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/lang3_slices/NotImplementedExceptionTest/NotImplementedExceptionTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/lang3_traces/NotImplementedExceptionTest.trace org.apache.commons.lang3.NotImplementedExceptionTest.assertCorrect:57:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/lang3_slices/NotImplementedExceptionTest/NotImplementedExceptionTest4.txt

#Total Asserts in org.apache.commons.lang3/NotImplementedExceptionTest=============4
#Total Tests in org.apache.commons.lang3/NotImplementedExceptionTest=============0
