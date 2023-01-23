#!/bin/bash

echo "computing slice for RoundtripContentTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/xml_slices/RoundtripContentTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/xml_traces/RoundtripContentTest.trace com.fasterxml.jackson.dataformat.xml.RoundtripContentTest._verifyRoundtrip:35:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/xml_slices/RoundtripContentTest/RoundtripContentTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/xml_traces/RoundtripContentTest.trace com.fasterxml.jackson.dataformat.xml.RoundtripContentTest._verifyRoundtrip:36:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/xml_slices/RoundtripContentTest/RoundtripContentTest2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml/RoundtripContentTest=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml/RoundtripContentTest=============0
