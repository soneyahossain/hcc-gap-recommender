#!/bin/bash

echo "computing slice for TestCachedDateTimeZone"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestCachedDateTimeZone

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestCachedDateTimeZone.trace org.joda.time.tz.TestCachedDateTimeZone.test_caching:68:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestCachedDateTimeZone/TestCachedDateTimeZone1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestCachedDateTimeZone.trace org.joda.time.tz.TestCachedDateTimeZone.testSerialization:86:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestCachedDateTimeZone/TestCachedDateTimeZone2.txt

#Total Asserts in org.joda.time.tz/TestCachedDateTimeZone=============2
#Total Tests in org.joda.time.tz/TestCachedDateTimeZone=============0
