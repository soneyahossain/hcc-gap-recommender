#!/bin/bash

echo "computing slice for BuilderWithJAXB291Test"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/BuilderWithJAXB291Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/BuilderWithJAXB291Test.trace com.fasterxml.jackson.dataformat.xml.jaxb.BuilderWithJAXB291Test.testBuilder291:126:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/BuilderWithJAXB291Test/BuilderWithJAXB291Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/jaxb_traces/BuilderWithJAXB291Test.trace com.fasterxml.jackson.dataformat.xml.jaxb.BuilderWithJAXB291Test.testBuilder291:127:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/jaxb_slices/BuilderWithJAXB291Test/BuilderWithJAXB291Test2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.jaxb/BuilderWithJAXB291Test=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.jaxb/BuilderWithJAXB291Test=============0
