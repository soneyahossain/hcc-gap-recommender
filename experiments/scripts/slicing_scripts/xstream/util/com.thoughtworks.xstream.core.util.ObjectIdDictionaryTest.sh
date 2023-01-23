#!/bin/bash

echo "computing slice for ObjectIdDictionaryTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ObjectIdDictionaryTest.trace com.thoughtworks.xstream.core.util.ObjectIdDictionaryTest.testMapsIdsToObjectReferences:26:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest/ObjectIdDictionaryTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ObjectIdDictionaryTest.trace com.thoughtworks.xstream.core.util.ObjectIdDictionaryTest.testMapsIdsToObjectReferences:27:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest/ObjectIdDictionaryTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ObjectIdDictionaryTest.trace com.thoughtworks.xstream.core.util.ObjectIdDictionaryTest.testMapsIdsToObjectReferences:28:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest/ObjectIdDictionaryTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ObjectIdDictionaryTest.trace com.thoughtworks.xstream.core.util.ObjectIdDictionaryTest.testTreatsObjectsThatAreEqualButNotSameInstanceAsDifferentReference:37:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest/ObjectIdDictionaryTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ObjectIdDictionaryTest.trace com.thoughtworks.xstream.core.util.ObjectIdDictionaryTest.testTreatsObjectsThatAreEqualButNotSameInstanceAsDifferentReference:38:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest/ObjectIdDictionaryTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ObjectIdDictionaryTest.trace com.thoughtworks.xstream.core.util.ObjectIdDictionaryTest.testEntriesAreGarbageCollected:47:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest/ObjectIdDictionaryTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/ObjectIdDictionaryTest.trace com.thoughtworks.xstream.core.util.ObjectIdDictionaryTest.testEntriesAreGarbageCollected:55:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/ObjectIdDictionaryTest/ObjectIdDictionaryTest7.txt

#Total Asserts in com.thoughtworks.xstream.core.util/ObjectIdDictionaryTest=============7
#Total Tests in com.thoughtworks.xstream.core.util/ObjectIdDictionaryTest=============0
