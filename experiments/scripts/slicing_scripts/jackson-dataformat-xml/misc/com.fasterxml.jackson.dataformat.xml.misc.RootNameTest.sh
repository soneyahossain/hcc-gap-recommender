#!/bin/bash

echo "computing slice for RootNameTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/RootNameTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/RootNameTest.trace com.fasterxml.jackson.dataformat.xml.misc.RootNameTest.testRootNameAnnotation:54:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/RootNameTest/RootNameTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/RootNameTest.trace com.fasterxml.jackson.dataformat.xml.misc.RootNameTest.testDynamicRootName:74:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/RootNameTest/RootNameTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/RootNameTest.trace com.fasterxml.jackson.dataformat.xml.misc.RootNameTest.testDynamicRootName:77:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/RootNameTest/RootNameTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/RootNameTest.trace com.fasterxml.jackson.dataformat.xml.misc.RootNameTest.testDynamicRootName:81:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/RootNameTest/RootNameTest4.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.misc/RootNameTest=============4
#Total Tests in com.fasterxml.jackson.dataformat.xml.misc/RootNameTest=============0
