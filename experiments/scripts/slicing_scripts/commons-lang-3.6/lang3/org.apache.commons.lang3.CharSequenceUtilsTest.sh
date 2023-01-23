#!/bin/bash

echo "computing slice for CharSequenceUtilsTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testConstructor:47:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testConstructor:49:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testConstructor:50:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testConstructor:51:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testConstructor:52:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:61:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:62:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:63:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:67:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:68:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:69:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:70:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence:71:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest13.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequenceNegativeStart:76:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest14.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/lang3_traces/CharSequenceUtilsTest.trace org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequenceTooLong:81:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/lang3_slices/CharSequenceUtilsTest/CharSequenceUtilsTest15.txt

#Total Asserts in org.apache.commons.lang3/CharSequenceUtilsTest=============15
#Total Tests in org.apache.commons.lang3/CharSequenceUtilsTest=============0