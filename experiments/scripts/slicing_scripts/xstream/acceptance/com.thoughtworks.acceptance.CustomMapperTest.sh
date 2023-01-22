#!/bin/bash

echo "computing slice for CustomMapperTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomMapperTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/CustomMapperTest.trace com.thoughtworks.acceptance.CustomMapperTest.wrapMapper:127:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomMapperTest/CustomMapperTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/CustomMapperTest.trace com.thoughtworks.acceptance.CustomMapperTest.testOwnMapperChainCanBeRegistered:140:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomMapperTest/CustomMapperTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/CustomMapperTest.trace com.thoughtworks.acceptance.CustomMapperTest.shouldSerializeMember:168:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomMapperTest/CustomMapperTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/CustomMapperTest.trace com.thoughtworks.acceptance.CustomMapperTest.shouldSerializeMember:169:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomMapperTest/CustomMapperTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/CustomMapperTest.trace com.thoughtworks.acceptance.CustomMapperTest.realClass:205:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomMapperTest/CustomMapperTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/CustomMapperTest.trace com.thoughtworks.acceptance.CustomMapperTest.realClass:206:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/CustomMapperTest/CustomMapperTest6.txt

#Total Asserts in com.thoughtworks.acceptance/CustomMapperTest=============6
#Total Tests in com.thoughtworks.acceptance/CustomMapperTest=============0
