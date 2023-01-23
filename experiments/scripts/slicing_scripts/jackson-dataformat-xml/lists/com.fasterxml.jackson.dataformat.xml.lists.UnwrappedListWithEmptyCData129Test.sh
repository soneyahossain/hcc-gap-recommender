#!/bin/bash

echo "computing slice for UnwrappedListWithEmptyCData129Test"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/UnwrappedListWithEmptyCData129Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/UnwrappedListWithEmptyCData129Test.trace com.fasterxml.jackson.dataformat.xml.lists.UnwrappedListWithEmptyCData129Test._testListWithEmptyCData:45:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/UnwrappedListWithEmptyCData129Test/UnwrappedListWithEmptyCData129Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/UnwrappedListWithEmptyCData129Test.trace com.fasterxml.jackson.dataformat.xml.lists.UnwrappedListWithEmptyCData129Test._testListWithEmptyCData:46:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/UnwrappedListWithEmptyCData129Test/UnwrappedListWithEmptyCData129Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/UnwrappedListWithEmptyCData129Test.trace com.fasterxml.jackson.dataformat.xml.lists.UnwrappedListWithEmptyCData129Test._testListWithEmptyCData:47:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/UnwrappedListWithEmptyCData129Test/UnwrappedListWithEmptyCData129Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/UnwrappedListWithEmptyCData129Test.trace com.fasterxml.jackson.dataformat.xml.lists.UnwrappedListWithEmptyCData129Test._testListWithEmptyCData:48:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/UnwrappedListWithEmptyCData129Test/UnwrappedListWithEmptyCData129Test4.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/UnwrappedListWithEmptyCData129Test=============4
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/UnwrappedListWithEmptyCData129Test=============0
