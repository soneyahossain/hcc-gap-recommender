#!/bin/bash

echo "computing slice for StrLookupTest"

mkdir -p slices/text_slices/StrLookupTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testNoneLookup:38:*>slices/text_slices/StrLookupTest/StrLookupTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testNoneLookup:39:*>slices/text_slices/StrLookupTest/StrLookupTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testNoneLookup:40:*>slices/text_slices/StrLookupTest/StrLookupTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testSystemProperiesLookup:45:*>slices/text_slices/StrLookupTest/StrLookupTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testSystemProperiesLookup:46:*>slices/text_slices/StrLookupTest/StrLookupTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testSystemProperiesLookup:47:*>slices/text_slices/StrLookupTest/StrLookupTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testSystemPropertiesLookupReplacedProperties:72:*>slices/text_slices/StrLookupTest/StrLookupTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testSystemPropertiesLookupUpdatedProperty:91:*>slices/text_slices/StrLookupTest/StrLookupTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup:102:*>slices/text_slices/StrLookupTest/StrLookupTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup:103:*>slices/text_slices/StrLookupTest/StrLookupTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup:104:*>slices/text_slices/StrLookupTest/StrLookupTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup:105:*>slices/text_slices/StrLookupTest/StrLookupTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup:106:*>slices/text_slices/StrLookupTest/StrLookupTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup:112:*>slices/text_slices/StrLookupTest/StrLookupTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup:113:*>slices/text_slices/StrLookupTest/StrLookupTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup:114:*>slices/text_slices/StrLookupTest/StrLookupTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup:115:*>slices/text_slices/StrLookupTest/StrLookupTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup:116:*>slices/text_slices/StrLookupTest/StrLookupTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup_nullMap:122:*>slices/text_slices/StrLookupTest/StrLookupTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup_nullMap:123:*>slices/text_slices/StrLookupTest/StrLookupTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testResourceBundleLookup_nullMap:124:*>slices/text_slices/StrLookupTest/StrLookupTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup_nullMap:130:*>slices/text_slices/StrLookupTest/StrLookupTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup_nullMap:131:*>slices/text_slices/StrLookupTest/StrLookupTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrLookupTest.trace org.apache.commons.text.StrLookupTest.testMapLookup_nullMap:132:*>slices/text_slices/StrLookupTest/StrLookupTest24.txt

#Total Asserts in org.apache.commons.text/StrLookupTest=============24
#Total Tests in org.apache.commons.text/StrLookupTest=============0
