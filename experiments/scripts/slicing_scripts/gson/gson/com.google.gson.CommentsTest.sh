#!/bin/bash

echo "computing slice for CommentsTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/gson_slices/CommentsTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/gson_traces/CommentsTest.trace com.google.gson.CommentsTest.testParseComments:43:*>$HCC_EXPERIMENTS/slices/gson/gson_slices/CommentsTest/CommentsTest1.txt

#Total Asserts in com.google.gson/CommentsTest=============1
#Total Tests in com.google.gson/CommentsTest=============0
