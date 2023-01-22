#!/bin/bash

echo "computing slice for JsonWriterModeDroppingRootTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testCanMarshalSets:63:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testCanMarshalSets:64:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testCanMarshalSets:65:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testCanMarshalSets:66:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testCanMarshalSets:67:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testBracesAndSquareBracketsAreNotEscaped:76:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testWillWriteTagValueAsDefaultValueIfNecessary:98:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeDroppingRootTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeDroppingRootTest.testRealTypeIsHonoredWhenWritingTheValue:130:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeDroppingRootTest/JsonWriterModeDroppingRootTest8.txt

#Total Asserts in com.thoughtworks.xstream.io.json/JsonWriterModeDroppingRootTest=============8
#Total Tests in com.thoughtworks.xstream.io.json/JsonWriterModeDroppingRootTest=============0
