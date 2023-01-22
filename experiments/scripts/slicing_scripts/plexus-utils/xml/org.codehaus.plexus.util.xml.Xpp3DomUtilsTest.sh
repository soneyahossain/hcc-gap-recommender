#!/bin/bash

echo "computing slice for Xpp3DomUtilsTest"

mkdir -p $HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomUtilsTest.trace org.codehaus.plexus.util.xml.Xpp3DomUtilsTest.testCombineId:40:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest/Xpp3DomUtilsTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomUtilsTest.trace org.codehaus.plexus.util.xml.Xpp3DomUtilsTest.testCombineId:42:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest/Xpp3DomUtilsTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomUtilsTest.trace org.codehaus.plexus.util.xml.Xpp3DomUtilsTest.testCombineId:43:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest/Xpp3DomUtilsTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomUtilsTest.trace org.codehaus.plexus.util.xml.Xpp3DomUtilsTest.testCombineId:44:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest/Xpp3DomUtilsTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomUtilsTest.trace org.codehaus.plexus.util.xml.Xpp3DomUtilsTest.testCombineId:45:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest/Xpp3DomUtilsTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomUtilsTest.trace org.codehaus.plexus.util.xml.Xpp3DomUtilsTest.testCombineId:46:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest/Xpp3DomUtilsTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/plexus-utils/xml_traces/Xpp3DomUtilsTest.trace org.codehaus.plexus.util.xml.Xpp3DomUtilsTest.testCombineId:47:*>$HCC_EXPERIMENTS/slices/plexus-utils/xml_slices/Xpp3DomUtilsTest/Xpp3DomUtilsTest7.txt

#Total Asserts in org.codehaus.plexus.util.xml/Xpp3DomUtilsTest=============7
#Total Tests in org.codehaus.plexus.util.xml/Xpp3DomUtilsTest=============0
