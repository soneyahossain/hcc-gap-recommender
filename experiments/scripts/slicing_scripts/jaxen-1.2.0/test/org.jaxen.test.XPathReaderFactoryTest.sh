#!/bin/bash

echo "computing slice for XPathReaderFactoryTest"

mkdir -p $HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathReaderFactoryTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathReaderFactoryTest.trace org.jaxen.test.XPathReaderFactoryTest.testDefault:73:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathReaderFactoryTest/XPathReaderFactoryTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathReaderFactoryTest.trace org.jaxen.test.XPathReaderFactoryTest.testValidByProperty:82:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathReaderFactoryTest/XPathReaderFactoryTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathReaderFactoryTest.trace org.jaxen.test.XPathReaderFactoryTest.testValidByProperty:83:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathReaderFactoryTest/XPathReaderFactoryTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathReaderFactoryTest.trace org.jaxen.test.XPathReaderFactoryTest.testInvalidByProperty:98:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathReaderFactoryTest/XPathReaderFactoryTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathReaderFactoryTest.trace org.jaxen.test.XPathReaderFactoryTest.testValidExplicit:121:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathReaderFactoryTest/XPathReaderFactoryTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jen-1.2.0/test_traces/XPathReaderFactoryTest.trace org.jaxen.test.XPathReaderFactoryTest.testValidExplicit:122:*>$HCC_EXPERIMENTS/slices/jen-1.2.0/test_slices/XPathReaderFactoryTest/XPathReaderFactoryTest6.txt

#Total Asserts in org.jaxen.test/XPathReaderFactoryTest=============6
#Total Tests in org.jaxen.test/XPathReaderFactoryTest=============0
