#!/bin/bash

echo "computing slice for MatchPatternTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/util_slices/MatchPatternTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/util_traces/MatchPatternTest.trace org.codehaus.plexus.util.MatchPatternTest.testMatchPath:30:*>$HCC_EXPERIMENTS/slices/plexus-utils/util_slices/MatchPatternTest/MatchPatternTest1.txt

#Total Asserts in org.codehaus.plexus.util/MatchPatternTest=============1
#Total Tests in org.codehaus.plexus.util/MatchPatternTest=============0
