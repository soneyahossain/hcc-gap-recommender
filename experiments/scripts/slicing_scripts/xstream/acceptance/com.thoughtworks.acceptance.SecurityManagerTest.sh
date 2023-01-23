#!/bin/bash

echo "computing slice for SecurityManagerTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SecurityManagerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/SecurityManagerTest.trace com.thoughtworks.acceptance.SecurityManagerTest.assertBothWays:219:*,com.thoughtworks.acceptance.SecurityManagerTest.assertBothWays:222:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/SecurityManagerTest/SecurityManagerTest.txt

#Total Asserts in com.thoughtworks.acceptance/SecurityManagerTest=============2
#Total Tests in com.thoughtworks.acceptance/SecurityManagerTest=============0
