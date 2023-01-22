#!/bin/bash

echo "computing slice for IdTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testIDFunctionSelectsNothingInDocumentWithNoIds:113:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testIDFunctionRequiresAtLeastOneArgument:128:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testIDFunctionRequiresAtMostOneArgument:144:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testFindElementById:158:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testFindElementById:160:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testFindMultipleElementsByMultipleIDs:188:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testFindMultipleElementsByMultipleIDs:191:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testFindMultipleElementsByMultipleIDs:192:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testIdReturnsFirstElementWithMatchingId:206:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-jaxen-1.2.0/test_traces/IdTest.trace org.jaxen.test.IdTest.testIdReturnsFirstElementWithMatchingId:208:*>$HCC_EXPERIMENTS/slices/fse-jaxen-1.2.0/test_slices/IdTest/IdTest10.txt

#Total Asserts in org.jaxen.test/IdTest=============10
#Total Tests in org.jaxen.test/IdTest=============0
