#!/bin/bash

echo "computing slice for TestUTCProvider"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testClass:60:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testClass:63:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testClass:64:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testGetAvailableIDs:71:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testGetAvailableIDs:72:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testGetZone_String:78:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testGetZone_String:79:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testGetZone_String:80:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestUTCProvider.trace org.joda.time.tz.TestUTCProvider.testGetZone_String:81:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestUTCProvider/TestUTCProvider9.txt

#Total Asserts in org.joda.time.tz/TestUTCProvider=============9
#Total Tests in org.joda.time.tz/TestUTCProvider=============0
