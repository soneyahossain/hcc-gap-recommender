#!/bin/bash

echo "computing slice for FileBasedTestCase"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.checkFile:141:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.deleteFile:178:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertEqualContent:210:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertEqualContent:213:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertEqualContent:237:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertEqualContent:238:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertIsDirectory:250:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertIsDirectory:252:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertIsFile:257:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/FileBasedTestCase.trace org.codehaus.plexus.util.FileBasedTestCase.assertIsFile:259:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/FileBasedTestCase/FileBasedTestCase10.txt

#Total Asserts in org.codehaus.plexus.util/FileBasedTestCase=============10
#Total Tests in org.codehaus.plexus.util/FileBasedTestCase=============0
