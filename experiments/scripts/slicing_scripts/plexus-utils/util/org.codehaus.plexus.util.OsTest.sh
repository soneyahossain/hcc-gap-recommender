#!/bin/bash

echo "computing slice for OsTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testUndefinedFamily:31:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:53:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:56:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:57:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:60:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:63:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:66:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:69:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:70:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:73:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testOs:74:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testValidList:79:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testValidList:81:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest13.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testValidList:82:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest14.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/OsTest.trace org.codehaus.plexus.util.OsTest.testValidList:83:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/OsTest/OsTest15.txt

#Total Asserts in org.codehaus.plexus.util/OsTest=============15
#Total Tests in org.codehaus.plexus.util/OsTest=============0
