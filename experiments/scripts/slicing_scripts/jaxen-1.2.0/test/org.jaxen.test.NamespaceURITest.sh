#!/bin/bash

echo "computing slice for NamespaceURITest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfNumber:101:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURINoArguments:109:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfEmptyNodeSetIsEmptyString:116:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfProcessingInstructionIsEmptyString:125:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfAttribute:134:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfAttributeInNamespace:143:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfTextIsEmptyString:152:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIRequiresAtMostOneArgument:163:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfNamespaceIsNull:171:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/NamespaceURITest.trace org.jaxen.test.NamespaceURITest.testNamespaceURIOfComment:182:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/NamespaceURITest/NamespaceURITest10.txt

#Total Asserts in org.jaxen.test/NamespaceURITest=============10
#Total Tests in org.jaxen.test/NamespaceURITest=============0
