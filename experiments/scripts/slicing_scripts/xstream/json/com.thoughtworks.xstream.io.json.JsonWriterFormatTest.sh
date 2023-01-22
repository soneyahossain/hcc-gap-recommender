#!/bin/bash

echo "computing slice for JsonWriterFormatTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterFormatTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/json_traces/JsonWriterFormatTest.trace com.thoughtworks.xstream.io.json.JsonWriterFormatTest.runTest:124:*>$HCC_EXPERIMENTS/slices/xstream/json_slices/JsonWriterFormatTest/JsonWriterFormatTest1.txt

#Total Asserts in com.thoughtworks.xstream.io.json/JsonWriterFormatTest=============1
#Total Tests in com.thoughtworks.xstream.io.json/JsonWriterFormatTest=============0
