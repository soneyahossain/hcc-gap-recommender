#!/bin/bash

echo "computing slice for SystemDefaultsSwitchTest"

mkdir -p $HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/test_slices/SystemDefaultsSwitchTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/test_traces/SystemDefaultsSwitchTest.trace org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testDefaultLocaleNoAnnotation:76:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/test_slices/SystemDefaultsSwitchTest/SystemDefaultsSwitchTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/test_traces/SystemDefaultsSwitchTest.trace org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testUseDifferentLocale:84:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/test_slices/SystemDefaultsSwitchTest/SystemDefaultsSwitchTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/test_traces/SystemDefaultsSwitchTest.trace org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testDefaultTimeZoneNoAnnotation:90:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/test_slices/SystemDefaultsSwitchTest/SystemDefaultsSwitchTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-commons-lang-3.6/test_traces/SystemDefaultsSwitchTest.trace org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testUseDifferentTimeZone:98:*>$HCC_EXPERIMENTS/slices/fse-commons-lang-3.6/test_slices/SystemDefaultsSwitchTest/SystemDefaultsSwitchTest4.txt

#Total Asserts in org.apache.commons.lang3.test/SystemDefaultsSwitchTest=============4
#Total Tests in org.apache.commons.lang3.test/SystemDefaultsSwitchTest=============0
