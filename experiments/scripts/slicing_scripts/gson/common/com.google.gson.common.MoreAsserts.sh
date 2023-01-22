#!/bin/bash

echo "computing slice for MoreAsserts"

mkdir -p $HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEquals:33:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEquals:35:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEquals:37:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEquals:43:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEquals:45:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEquals:47:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEqualsAndHashCode:66:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEqualsAndHashCode:67:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEqualsAndHashCode:68:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEqualsAndHashCode:69:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/common_traces/MoreAsserts.trace com.google.gson.common.MoreAsserts.assertEqualsAndHashCode:70:*>$HCC_EXPERIMENTS/slices/gson/common_slices/MoreAsserts/MoreAsserts11.txt

#Total Asserts in com.google.gson.common/MoreAsserts=============11
#Total Tests in com.google.gson.common/MoreAsserts=============0
