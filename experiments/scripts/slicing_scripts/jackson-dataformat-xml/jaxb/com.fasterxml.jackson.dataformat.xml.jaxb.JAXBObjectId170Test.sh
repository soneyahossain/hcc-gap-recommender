#!/bin/bash

echo "computing slice for JAXBObjectId170Test"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/JAXBObjectId170Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/JAXBObjectId170Test.trace com.fasterxml.jackson.dataformat.xml.jaxb.JAXBObjectId170Test.testPolyIdList178:129:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/JAXBObjectId170Test/JAXBObjectId170Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/JAXBObjectId170Test.trace com.fasterxml.jackson.dataformat.xml.jaxb.JAXBObjectId170Test.testPolyIdList178:130:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/JAXBObjectId170Test/JAXBObjectId170Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/JAXBObjectId170Test.trace com.fasterxml.jackson.dataformat.xml.jaxb.JAXBObjectId170Test.testPolyIdList178:131:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/JAXBObjectId170Test/JAXBObjectId170Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/JAXBObjectId170Test.trace com.fasterxml.jackson.dataformat.xml.jaxb.JAXBObjectId170Test.testPolyIdList178:134:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/JAXBObjectId170Test/JAXBObjectId170Test4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/JAXBObjectId170Test.trace com.fasterxml.jackson.dataformat.xml.jaxb.JAXBObjectId170Test.testPolyIdList178:135:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/JAXBObjectId170Test/JAXBObjectId170Test5.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.jaxb/JAXBObjectId170Test=============5
#Total Tests in com.fasterxml.jackson.dataformat.xml.jaxb/JAXBObjectId170Test=============0
