#!/bin/bash

echo "computing slice for LevenshteinDistanceTest"

mkdir -p slices/similarity_slices/LevenshteinDistanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:32:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:33:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:34:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:35:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:36:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:37:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:38:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:39:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:40:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringString:41:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:57:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:58:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:59:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:60:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:63:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:64:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:67:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:68:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:71:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:72:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:75:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:78:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:79:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:82:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:83:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:86:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:87:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:88:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:91:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:92:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:95:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:96:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:99:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:100:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:101:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:102:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:103:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:104:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:105:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:106:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:107:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:109:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:110:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:111:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:112:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:113:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:114:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest47.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetLevenshteinDistance_StringStringInt:115:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest48.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/similarity_traces/LevenshteinDistanceTest.trace org.apache.commons.text.similarity.LevenshteinDistanceTest.testGetThresholdDirectlyAfterObjectInstantiation:140:*>slices/similarity_slices/LevenshteinDistanceTest/LevenshteinDistanceTestLevenshteinDistanceTest49.txt

#Total Asserts in org.apache.commons.text.similarity/LevenshteinDistanceTest=============49
#Total Tests in org.apache.commons.text.similarity/LevenshteinDistanceTest=============0
