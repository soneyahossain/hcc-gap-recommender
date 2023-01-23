#!/bin/bash

echo "computing slice for TestISODateTimeFormatParsing"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestISODateTimeFormatParsing

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestISODateTimeFormatParsing.trace org.joda.time.format.TestISODateTimeFormatParsing.test_localDateParser:145:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestISODateTimeFormatParsing/TestISODateTimeFormatParsing1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestISODateTimeFormatParsing.trace org.joda.time.format.TestISODateTimeFormatParsing.test_localTimeParser:245:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestISODateTimeFormatParsing/TestISODateTimeFormatParsing2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestISODateTimeFormatParsing.trace org.joda.time.format.TestISODateTimeFormatParsing.test_localTimeParser:271:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestISODateTimeFormatParsing/TestISODateTimeFormatParsing3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestISODateTimeFormatParsing.trace org.joda.time.format.TestISODateTimeFormatParsing.test_timeElementParser:305:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestISODateTimeFormatParsing/TestISODateTimeFormatParsing4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestISODateTimeFormatParsing.trace org.joda.time.format.TestISODateTimeFormatParsing.test_localDateOptionalTimeParser:373:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestISODateTimeFormatParsing/TestISODateTimeFormatParsing5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestISODateTimeFormatParsing.trace org.joda.time.format.TestISODateTimeFormatParsing.assertParse:905:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestISODateTimeFormatParsing/TestISODateTimeFormatParsing6.txt

#Total Asserts in org.joda.time.format/TestISODateTimeFormatParsing=============6
#Total Tests in org.joda.time.format/TestISODateTimeFormatParsing=============0
