#!/bin/bash

echo "computing slice for CommandlineTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testCommandlineWithoutCommandInConstructor:67:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testCommandlineWithCommandInConstructor:83:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testExecute:125:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testExecute:129:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testSetLine:148:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testCreateCommandInReverseOrder:166:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testSetFile:190:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindows:206:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindows:208:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindows:209:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindows:210:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindows:213:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindowsWithSeveralQuotes:224:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest13.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindowsWithSeveralQuotes:226:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest14.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindowsWithSeveralQuotes:227:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest15.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindowsWithSeveralQuotes:228:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest16.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineWindowsWithSeveralQuotes:232:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest17.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash:249:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest18.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash:251:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest19.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash:252:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest20.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash:258:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest21.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithWorkingDirectory:278:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest22.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithWorkingDirectory:280:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest23.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithWorkingDirectory:281:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest24.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithWorkingDirectory:287:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest25.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithSingleQuotedArg:304:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest26.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithSingleQuotedArg:306:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest27.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithSingleQuotedArg:307:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest28.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineBash_WithSingleQuotedArg:313:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest29.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineNonWindows:324:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest30.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineNonWindows:326:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest31.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineNonWindows:327:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest32.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineNonWindows:335:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest33.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testGetShellCommandLineNonWindows:331:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest34.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testEnvironment:344:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest35.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.testDollarSignInArgumentPath:477:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest36.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/cli_traces/CommandlineTest.trace org.codehaus.plexus.util.cli.CommandlineTest.createAndCallScript:590:*>$HCC_EXPERIMENTS/slices/plexus-utils/cli_slices/CommandlineTest/CommandlineTest37.txt

#Total Asserts in org.codehaus.plexus.util.cli/CommandlineTest=============37
#Total Tests in org.codehaus.plexus.util.cli/CommandlineTest=============0