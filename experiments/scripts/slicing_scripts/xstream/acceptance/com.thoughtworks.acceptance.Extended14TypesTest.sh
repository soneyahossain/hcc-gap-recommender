#!/bin/bash

echo "computing slice for Extended14TypesTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testGregorianCalendar:62:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testGregorianCalendar:63:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testGregorianCalendarCompat:74:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testGregorianCalendarCompat:75:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testRegexPattern:92:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testRegexPattern:93:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testRegexPattern:94:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testRegexPattern:96:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/Extended14TypesTest.trace com.thoughtworks.acceptance.Extended14TypesTest.testRegexPattern:97:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/Extended14TypesTest/Extended14TypesTest9.txt

#Total Asserts in com.thoughtworks.acceptance/Extended14TypesTest=============9
#Total Tests in com.thoughtworks.acceptance/Extended14TypesTest=============0
