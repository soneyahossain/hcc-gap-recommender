#!/bin/bash

echo "computing slice for DirectoryWalkerTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/util_slices/DirectoryWalkerTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/DirectoryWalkerTest.trace org.codehaus.plexus.util.DirectoryWalkerTest.testDirectoryWalk:39:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/DirectoryWalkerTest/DirectoryWalkerTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/DirectoryWalkerTest.trace org.codehaus.plexus.util.DirectoryWalkerTest.testDirectoryWalk:40:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/DirectoryWalkerTest/DirectoryWalkerTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/DirectoryWalkerTest.trace org.codehaus.plexus.util.DirectoryWalkerTest.testDirectoryWalk:41:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/DirectoryWalkerTest/DirectoryWalkerTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/DirectoryWalkerTest.trace org.codehaus.plexus.util.DirectoryWalkerTest.testDirectoryWalk:42:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/DirectoryWalkerTest/DirectoryWalkerTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/DirectoryWalkerTest.trace org.codehaus.plexus.util.DirectoryWalkerTest.testDirectoryWalk:43:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/DirectoryWalkerTest/DirectoryWalkerTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/DirectoryWalkerTest.trace org.codehaus.plexus.util.DirectoryWalkerTest.testDirectoryWalk:44:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/DirectoryWalkerTest/DirectoryWalkerTest6.txt

#Total Asserts in org.codehaus.plexus.util/DirectoryWalkerTest=============6
#Total Tests in org.codehaus.plexus.util/DirectoryWalkerTest=============0
