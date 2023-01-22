#!/bin/bash

echo "computing slice for TestBinaryStreamToXMLSerialization"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestBinaryStreamToXMLSerialization

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestBinaryStreamToXMLSerialization.trace com.fasterxml.jackson.dataformat.xml.ser.TestBinaryStreamToXMLSerialization.testWith0Bytes:19:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestBinaryStreamToXMLSerialization/TestBinaryStreamToXMLSerialization1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestBinaryStreamToXMLSerialization.trace com.fasterxml.jackson.dataformat.xml.ser.TestBinaryStreamToXMLSerialization.testWith1Byte:25:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestBinaryStreamToXMLSerialization/TestBinaryStreamToXMLSerialization2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestBinaryStreamToXMLSerialization.trace com.fasterxml.jackson.dataformat.xml.ser.TestBinaryStreamToXMLSerialization.testWith2Bytes:31:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestBinaryStreamToXMLSerialization/TestBinaryStreamToXMLSerialization3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestBinaryStreamToXMLSerialization.trace com.fasterxml.jackson.dataformat.xml.ser.TestBinaryStreamToXMLSerialization.testWith3Bytes:37:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestBinaryStreamToXMLSerialization/TestBinaryStreamToXMLSerialization4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestBinaryStreamToXMLSerialization.trace com.fasterxml.jackson.dataformat.xml.ser.TestBinaryStreamToXMLSerialization.testWith4Bytes:43:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestBinaryStreamToXMLSerialization/TestBinaryStreamToXMLSerialization5.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.ser/TestBinaryStreamToXMLSerialization=============5
#Total Tests in com.fasterxml.jackson.dataformat.xml.ser/TestBinaryStreamToXMLSerialization=============0
