#!/bin/bash

echo "computing slice for RandomStringGeneratorTest"

mkdir -p slices/text_slices/RandomStringGeneratorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testSetLength:74:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testGenerateMinMaxLength:83:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testWithinRange:108:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testWithinMultipleRanges:132:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testNoLoneSurrogates:148:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testNoLoneSurrogates:152:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testNoLoneSurrogates:157:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.nextInt:177:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testMultipleFilters:199:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testNoPrivateCharacters:214:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testChangeOfFilter:249:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testZeroLength:256:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testSelectFromCharArray:268:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/RandomStringGeneratorTest.trace org.apache.commons.text.RandomStringGeneratorTest.testSelectFromCharVarargs:278:*>slices/text_slices/RandomStringGeneratorTest/RandomStringGeneratorTestRandomStringGeneratorTest14.txt

#Total Asserts in org.apache.commons.text/RandomStringGeneratorTest=============14
#Total Tests in org.apache.commons.text/RandomStringGeneratorTest=============0
