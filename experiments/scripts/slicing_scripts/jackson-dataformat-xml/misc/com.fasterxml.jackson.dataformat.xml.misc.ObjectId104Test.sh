#!/bin/bash

echo "computing slice for ObjectId104Test"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/ObjectId104Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/ObjectId104Test.trace com.fasterxml.jackson.dataformat.xml.misc.ObjectId104Test.testSimpleCollectionDeserWithForwardRefs:43:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/ObjectId104Test/ObjectId104Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/ObjectId104Test.trace com.fasterxml.jackson.dataformat.xml.misc.ObjectId104Test.testSimpleCollectionDeserWithForwardRefs:44:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/ObjectId104Test/ObjectId104Test2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.misc/ObjectId104Test=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.misc/ObjectId104Test=============0
