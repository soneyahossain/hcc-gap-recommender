#!/bin/bash

echo "computing slice for ListAnnotationSharingTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListAnnotationSharingTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListAnnotationSharingTest.trace com.fasterxml.jackson.dataformat.xml.lists.ListAnnotationSharingTest.testAnnotationSharing:47:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListAnnotationSharingTest/ListAnnotationSharingTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/ListAnnotationSharingTest.trace com.fasterxml.jackson.dataformat.xml.lists.ListAnnotationSharingTest.testAnnotationSharing:51:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/ListAnnotationSharingTest/ListAnnotationSharingTest2.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/ListAnnotationSharingTest=============2
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/ListAnnotationSharingTest=============0
