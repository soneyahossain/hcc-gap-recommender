#!/bin/bash

echo "computing slice for PrettyPrintXMLWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/PrettyPrintXMLWriterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/PrettyPrintXMLWriterTest.trace org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest.testDefaultPrettyPrintXMLWriter:75:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/PrettyPrintXMLWriterTest/PrettyPrintXMLWriterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/PrettyPrintXMLWriterTest.trace org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest.testPrettyPrintXMLWriterWithGivenLineSeparator:90:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/PrettyPrintXMLWriterTest/PrettyPrintXMLWriterTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/PrettyPrintXMLWriterTest.trace org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest.testPrettyPrintXMLWriterWithGivenLineIndenter:105:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/PrettyPrintXMLWriterTest/PrettyPrintXMLWriterTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/PrettyPrintXMLWriterTest.trace org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest.testEscapeXmlAttribute:114:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/PrettyPrintXMLWriterTest/PrettyPrintXMLWriterTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/PrettyPrintXMLWriterTest.trace org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest.testEscapeXmlAttribute:121:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/PrettyPrintXMLWriterTest/PrettyPrintXMLWriterTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/PrettyPrintXMLWriterTest.trace org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest.testEscapeXmlAttribute:128:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/PrettyPrintXMLWriterTest/PrettyPrintXMLWriterTest6.txt

#Total Asserts in org.codehaus.plexus.util.xml/PrettyPrintXMLWriterTest=============6
#Total Tests in org.codehaus.plexus.util.xml/PrettyPrintXMLWriterTest=============0
