#!/bin/bash

echo "computing slice for TestZoneInfoCompiler"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestZoneInfoCompiler.trace org.joda.time.tz.TestZoneInfoCompiler.testTestOne:76:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler/TestZoneInfoCompiler1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestZoneInfoCompiler.trace org.joda.time.tz.TestZoneInfoCompiler.testTestTwo:84:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler/TestZoneInfoCompiler2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestZoneInfoCompiler.trace org.joda.time.tz.TestZoneInfoCompiler.testParseZoneCharFive:89:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler/TestZoneInfoCompiler3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestZoneInfoCompiler.trace org.joda.time.tz.TestZoneInfoCompiler.testParseYearAndParseYearReturningPositiveAndParseYearWithNegative:94:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler/TestZoneInfoCompiler4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestZoneInfoCompiler.trace org.joda.time.tz.TestZoneInfoCompiler.testParseYearAndParseYearReturningNegativeOne:99:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler/TestZoneInfoCompiler5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestZoneInfoCompiler.trace org.joda.time.tz.TestZoneInfoCompiler.testParseYearAndParseYearReturningNegativeTwo:104:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler/TestZoneInfoCompiler6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/tz_traces/TestZoneInfoCompiler.trace org.joda.time.tz.TestZoneInfoCompiler.testWriteZoneInfoMapThrowsIllegalArgumentException:119:*>$HCC_EXPERIMENTS/slices/fse-joda-time/tz_slices/TestZoneInfoCompiler/TestZoneInfoCompiler7.txt

#Total Asserts in org.joda.time.tz/TestZoneInfoCompiler=============7
#Total Tests in org.joda.time.tz/TestZoneInfoCompiler=============0
