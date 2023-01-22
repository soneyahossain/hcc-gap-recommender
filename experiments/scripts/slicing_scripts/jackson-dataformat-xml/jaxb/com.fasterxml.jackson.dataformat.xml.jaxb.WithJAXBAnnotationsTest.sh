#!/bin/bash

echo "computing slice for WithJAXBAnnotationsTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testRootName:119:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testRootName:120:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testSerializeAsAttr:130:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testSerializeAsAttr:131:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testAsTextWithJAXB:142:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testAsTextWithJAXB:147:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testAsTextWithJAXB:148:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/WithJAXBAnnotationsTest.trace com.fasterxml.jackson.dataformat.xml.jaxb.WithJAXBAnnotationsTest.testPersonAsXml:162:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/WithJAXBAnnotationsTest/WithJAXBAnnotationsTest8.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.jaxb/WithJAXBAnnotationsTest=============8
#Total Tests in com.fasterxml.jackson.dataformat.xml.jaxb/WithJAXBAnnotationsTest=============0
