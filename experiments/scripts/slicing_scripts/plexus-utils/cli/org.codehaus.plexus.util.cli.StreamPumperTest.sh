#!/bin/bash

echo "computing slice for StreamPumperTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testPumping:103:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testPumping:104:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testPumpingWithPrintWriter:117:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testPumperReadsInputStreamUntilEndEvenIfConsumerFails:127:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testPumperReadsInputStreamUntilEndEvenIfConsumerFails:128:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testPumperReadsInputStreamUntilEndEvenIfConsumerFails:129:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testEnabled:242:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/StreamPumperTest.trace org.codehaus.plexus.util.cli.StreamPumperTest.testDisabled:252:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/StreamPumperTest/StreamPumperTest8.txt

#Total Asserts in org.codehaus.plexus.util.cli/StreamPumperTest=============8
#Total Tests in org.codehaus.plexus.util.cli/StreamPumperTest=============0
