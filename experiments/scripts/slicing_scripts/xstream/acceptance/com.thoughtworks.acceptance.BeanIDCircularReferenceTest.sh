#!/bin/bash

echo "computing slice for BeanIDCircularReferenceTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BeanIDCircularReferenceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/BeanIDCircularReferenceTest.trace com.thoughtworks.acceptance.BeanIDCircularReferenceTest.testCircularReferenceXml:70:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BeanIDCircularReferenceTest/BeanIDCircularReferenceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/BeanIDCircularReferenceTest.trace com.thoughtworks.acceptance.BeanIDCircularReferenceTest.testCircularReferenceToSelfXml:83:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BeanIDCircularReferenceTest/BeanIDCircularReferenceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/BeanIDCircularReferenceTest.trace com.thoughtworks.acceptance.BeanIDCircularReferenceTest.testCanAvoidMemberIfUsedAsId:101:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BeanIDCircularReferenceTest/BeanIDCircularReferenceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/BeanIDCircularReferenceTest.trace com.thoughtworks.acceptance.BeanIDCircularReferenceTest.testCanAvoidMemberIfUsedAsId:110:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BeanIDCircularReferenceTest/BeanIDCircularReferenceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/BeanIDCircularReferenceTest.trace com.thoughtworks.acceptance.BeanIDCircularReferenceTest.testCanAvoidMemberIfUsedAsId:111:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/BeanIDCircularReferenceTest/BeanIDCircularReferenceTest5.txt

#Total Asserts in com.thoughtworks.acceptance/BeanIDCircularReferenceTest=============5
#Total Tests in com.thoughtworks.acceptance/BeanIDCircularReferenceTest=============0
