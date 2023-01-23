#!/bin/bash

echo "computing slice for PrettyPrintWriterTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/PrettyPrintWriterTest.trace com.thoughtworks.xstream.io.xml.PrettyPrintWriterTest.assertXmlProducedIs:30:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest/PrettyPrintWriterTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/PrettyPrintWriterTest.trace com.thoughtworks.xstream.io.xml.PrettyPrintWriterTest.testThrowsForNullInXml1_0Mode:144:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest/PrettyPrintWriterTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/PrettyPrintWriterTest.trace com.thoughtworks.xstream.io.xml.PrettyPrintWriterTest.testThrowsForNullInXml1_1Mode:155:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest/PrettyPrintWriterTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/PrettyPrintWriterTest.trace com.thoughtworks.xstream.io.xml.PrettyPrintWriterTest.testSupportsOnlyValidControlCharactersInXml1_0Mode:181:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest/PrettyPrintWriterTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/PrettyPrintWriterTest.trace com.thoughtworks.xstream.io.xml.PrettyPrintWriterTest.testSupportsOnlyValidControlCharactersInXml1_1Mode:214:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest/PrettyPrintWriterTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/PrettyPrintWriterTest.trace com.thoughtworks.xstream.io.xml.PrettyPrintWriterTest.testThrowsForInvalidUnicodeCharacterslInXml1_0Mode:256:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest/PrettyPrintWriterTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/xml_traces/PrettyPrintWriterTest.trace com.thoughtworks.xstream.io.xml.PrettyPrintWriterTest.testThrowsForInvalidUnicodeCharacterslInXml1_1Mode:279:*>$HCC_EXPERIMENTS/slices/xstream/xml_slices/PrettyPrintWriterTest/PrettyPrintWriterTest7.txt

#Total Asserts in com.thoughtworks.xstream.io.xml/PrettyPrintWriterTest=============7
#Total Tests in com.thoughtworks.xstream.io.xml/PrettyPrintWriterTest=============0
