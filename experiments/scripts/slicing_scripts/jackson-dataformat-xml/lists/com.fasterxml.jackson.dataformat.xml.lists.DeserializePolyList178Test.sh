#!/bin/bash

echo "computing slice for DeserializePolyList178Test"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/DeserializePolyList178Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/DeserializePolyList178Test.trace com.fasterxml.jackson.dataformat.xml.lists.DeserializePolyList178Test.testPolyIdList178:78:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/DeserializePolyList178Test/DeserializePolyList178Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/DeserializePolyList178Test.trace com.fasterxml.jackson.dataformat.xml.lists.DeserializePolyList178Test.testPolyIdList178:79:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/DeserializePolyList178Test/DeserializePolyList178Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/DeserializePolyList178Test.trace com.fasterxml.jackson.dataformat.xml.lists.DeserializePolyList178Test.testPolyIdList178:81:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/DeserializePolyList178Test/DeserializePolyList178Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/DeserializePolyList178Test.trace com.fasterxml.jackson.dataformat.xml.lists.DeserializePolyList178Test.testPolyIdList178:82:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/DeserializePolyList178Test/DeserializePolyList178Test4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/lists_traces/DeserializePolyList178Test.trace com.fasterxml.jackson.dataformat.xml.lists.DeserializePolyList178Test.testPolyIdList178:84:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/lists_slices/DeserializePolyList178Test/DeserializePolyList178Test5.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.lists/DeserializePolyList178Test=============5
#Total Tests in com.fasterxml.jackson.dataformat.xml.lists/DeserializePolyList178Test=============0
