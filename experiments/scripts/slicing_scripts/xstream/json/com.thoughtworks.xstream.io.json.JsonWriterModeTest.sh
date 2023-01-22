#!/bin/bash

echo "computing slice for JsonWriterModeTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterModeTest.trace com.thoughtworks.xstream.io.json.JsonWriterModeTest.assertValidJSON:86:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterModeTest/JsonWriterModeTest1.txt

#Total Asserts in com.thoughtworks.xstream.io.json/JsonWriterModeTest=============1
#Total Tests in com.thoughtworks.xstream.io.json/JsonWriterModeTest=============0
