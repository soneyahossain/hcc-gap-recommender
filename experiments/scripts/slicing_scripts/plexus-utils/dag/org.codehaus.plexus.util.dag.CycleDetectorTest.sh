#!/bin/bash

echo "computing slice for CycleDetectorTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:76:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:78:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:80:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:82:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:135:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:137:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:139:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:141:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:143:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:182:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:184:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:186:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:188:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest13.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:190:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest14.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:192:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest15.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:194:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest16.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:196:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest17.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:198:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest18.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:200:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest19.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:202:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest20.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:204:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest21.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:206:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest22.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:208:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest23.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/dag_traces/CycleDetectorTest.trace org.codehaus.plexus.util.dag.CycleDetectorTest.testCycyleDetection:210:*>$HCC_EXPERIMENTS/slices/plexus-utils/dag_slices/CycleDetectorTest/CycleDetectorTest24.txt

#Total Asserts in org.codehaus.plexus.util.dag/CycleDetectorTest=============24
#Total Tests in org.codehaus.plexus.util.dag/CycleDetectorTest=============0