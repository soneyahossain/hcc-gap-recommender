#!/bin/bash

echo "computing slice for SerializationNestedWriteObjectsTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SerializationNestedWriteObjectsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SerializationNestedWriteObjectsTest.trace com.thoughtworks.acceptance.SerializationNestedWriteObjectsTest.testObjectInputStream:119:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SerializationNestedWriteObjectsTest/SerializationNestedWriteObjectsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SerializationNestedWriteObjectsTest.trace com.thoughtworks.acceptance.SerializationNestedWriteObjectsTest.testObjectInputStream:120:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SerializationNestedWriteObjectsTest/SerializationNestedWriteObjectsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SerializationNestedWriteObjectsTest.trace com.thoughtworks.acceptance.SerializationNestedWriteObjectsTest.testObjectOutputStream:151:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SerializationNestedWriteObjectsTest/SerializationNestedWriteObjectsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SerializationNestedWriteObjectsTest.trace com.thoughtworks.acceptance.SerializationNestedWriteObjectsTest.testCanHandleRawBytes:224:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SerializationNestedWriteObjectsTest/SerializationNestedWriteObjectsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SerializationNestedWriteObjectsTest.trace com.thoughtworks.acceptance.SerializationNestedWriteObjectsTest.testCanHandleRawBytes:229:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SerializationNestedWriteObjectsTest/SerializationNestedWriteObjectsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SerializationNestedWriteObjectsTest.trace com.thoughtworks.acceptance.SerializationNestedWriteObjectsTest.testNestedSerializationOfDefaultType:310:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SerializationNestedWriteObjectsTest/SerializationNestedWriteObjectsTest6.txt

#Total Asserts in com.thoughtworks.acceptance/SerializationNestedWriteObjectsTest=============6
#Total Tests in com.thoughtworks.acceptance/SerializationNestedWriteObjectsTest=============0
