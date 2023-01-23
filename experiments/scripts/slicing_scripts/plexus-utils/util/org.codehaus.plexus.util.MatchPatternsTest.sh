#!/bin/bash

echo "computing slice for MatchPatternsTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/util_slices/MatchPatternsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/MatchPatternsTest.trace org.codehaus.plexus.util.MatchPatternsTest.testMatches:27:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/MatchPatternsTest/MatchPatternsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/MatchPatternsTest.trace org.codehaus.plexus.util.MatchPatternsTest.testMatches:28:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/MatchPatternsTest/MatchPatternsTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/MatchPatternsTest.trace org.codehaus.plexus.util.MatchPatternsTest.testMatches:29:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/MatchPatternsTest/MatchPatternsTest3.txt

#Total Asserts in org.codehaus.plexus.util/MatchPatternsTest=============3
#Total Tests in org.codehaus.plexus.util/MatchPatternsTest=============0
