#!/bin/bash

echo "computing slice for JsonAdapterAnnotationOnClassesTest"

mkdir -p $HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterInvoked:47:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterInvoked:51:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterInvoked:53:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterInvoked:54:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterInvoked:57:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterInvoked:59:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterFactoryInvoked:65:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testJsonAdapterFactoryInvoked:67:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.read:83:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.serialize:100:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.serialize:102:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.deserialize:119:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.deserialize:121:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest13.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testSuperclassTypeAdapterNotInvoked:133:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest14.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/gson/functional_traces/JsonAdapterAnnotationOnClassesTest.trace com.google.gson.functional.JsonAdapterAnnotationOnClassesTest.testNullSafeObjectFromJson:139:*>$HCC_EXPERIMENTS/slices/gson/functional_slices/JsonAdapterAnnotationOnClassesTest/JsonAdapterAnnotationOnClassesTest15.txt

#Total Asserts in com.google.gson.functional/JsonAdapterAnnotationOnClassesTest=============15
#Total Tests in com.google.gson.functional/JsonAdapterAnnotationOnClassesTest=============0