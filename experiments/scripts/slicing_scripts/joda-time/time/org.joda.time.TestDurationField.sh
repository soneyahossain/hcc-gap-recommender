#!/bin/bash

echo "computing slice for TestDurationField"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestDurationField

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestDurationField.trace org.joda.time.TestDurationField.test_subtract:56:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestDurationField/TestDurationField1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestDurationField.trace org.joda.time.TestDurationField.test_subtract:57:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestDurationField/TestDurationField2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestDurationField.trace org.joda.time.TestDurationField.test_subtract:58:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestDurationField/TestDurationField3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestDurationField.trace org.joda.time.TestDurationField.test_subtract:59:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestDurationField/TestDurationField4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestDurationField.trace org.joda.time.TestDurationField.test_subtract:60:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestDurationField/TestDurationField5.txt

#Total Asserts in org.joda.time/TestDurationField=============5
#Total Tests in org.joda.time/TestDurationField=============0
