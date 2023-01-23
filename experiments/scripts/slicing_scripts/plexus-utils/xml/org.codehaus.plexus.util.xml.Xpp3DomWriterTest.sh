#!/bin/bash

echo "computing slice for Xpp3DomWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomWriterTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomWriterTest.trace org.codehaus.plexus.util.xml.Xpp3DomWriterTest.testWriter:37:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomWriterTest/Xpp3DomWriterTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomWriterTest.trace org.codehaus.plexus.util.xml.Xpp3DomWriterTest.testWriterNoEscape:46:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomWriterTest/Xpp3DomWriterTest2.txt

#Total Asserts in org.codehaus.plexus.util.xml/Xpp3DomWriterTest=============2
#Total Tests in org.codehaus.plexus.util.xml/Xpp3DomWriterTest=============0
