#!/bin/bash

echo "computing slice for TestSerialization"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestSerialization.trace org.joda.time.TestSerialization.testTest:153:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization/TestSerialization1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestSerialization.trace org.joda.time.TestSerialization.testTest:154:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization/TestSerialization2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestSerialization.trace org.joda.time.TestSerialization.testTest:155:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization/TestSerialization3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestSerialization.trace org.joda.time.TestSerialization.loadAndCompare:331:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization/TestSerialization4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestSerialization.trace org.joda.time.TestSerialization.loadAndCompare:329:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization/TestSerialization5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestSerialization.trace org.joda.time.TestSerialization.inlineCompare:362:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization/TestSerialization6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestSerialization.trace org.joda.time.TestSerialization.inlineCompare:360:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestSerialization/TestSerialization7.txt

#Total Asserts in org.joda.time/TestSerialization=============7
#Total Tests in org.joda.time/TestSerialization=============0
