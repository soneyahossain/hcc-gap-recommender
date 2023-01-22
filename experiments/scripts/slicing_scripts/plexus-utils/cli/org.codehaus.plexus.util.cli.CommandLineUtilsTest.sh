#!/bin/bash

echo "computing slice for CommandLineUtilsTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.testQuoteArguments:37:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.testQuoteArguments:40:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.testQuoteArguments:43:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.testGetSystemEnvVarsCaseInsensitive:69:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.testGetSystemEnvVarsWindows:87:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.assertCmdLineArgs:114:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.assertCmdLineArgs:115:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandLineUtilsTest.trace org.codehaus.plexus.util.cli.CommandLineUtilsTest.assertCmdLineArgs:116:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandLineUtilsTest/CommandLineUtilsTest8.txt

#Total Asserts in org.codehaus.plexus.util.cli/CommandLineUtilsTest=============8
#Total Tests in org.codehaus.plexus.util.cli/CommandLineUtilsTest=============0
