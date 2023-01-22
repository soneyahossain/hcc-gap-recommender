#!/bin/bash

echo "computing slice for TestJDKSerializability"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testXmlFactory:45:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testXmlFactory:50:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testXmlFactory:51:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testXmlFactory:54:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testMapper:62:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testMapper:66:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testMapper:68:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/ser_traces/TestJDKSerializability.trace com.fasterxml.jackson.dataformat.xml.ser.TestJDKSerializability.testMapper:69:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/ser_slices/TestJDKSerializability/TestJDKSerializability8.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.ser/TestJDKSerializability=============8
#Total Tests in com.fasterxml.jackson.dataformat.xml.ser/TestJDKSerializability=============0
