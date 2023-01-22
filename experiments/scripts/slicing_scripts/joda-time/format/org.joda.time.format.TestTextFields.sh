#!/bin/bash

echo "computing slice for TestTextFields"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestTextFields

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestTextFields.trace org.joda.time.format.TestTextFields.testMonthNames_monthStart:104:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestTextFields/TestTextFields1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestTextFields.trace org.joda.time.format.TestTextFields.testMonthNames_monthMiddle:115:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestTextFields/TestTextFields2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestTextFields.trace org.joda.time.format.TestTextFields.testMonthNames_monthEnd:129:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestTextFields/TestTextFields3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestTextFields.trace org.joda.time.format.TestTextFields.testWeekdayNames:142:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestTextFields/TestTextFields4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/format_traces/TestTextFields.trace org.joda.time.format.TestTextFields.testHalfdayNames:156:*>$HCC_EXPERIMENTS/slices/fse-joda-time/format_slices/TestTextFields/TestTextFields5.txt

#Total Asserts in org.joda.time.format/TestTextFields=============5
#Total Tests in org.joda.time.format/TestTextFields=============0
