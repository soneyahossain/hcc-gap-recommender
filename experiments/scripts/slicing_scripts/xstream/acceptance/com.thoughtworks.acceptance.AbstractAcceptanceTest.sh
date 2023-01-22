#!/bin/bash

echo "computing slice for AbstractAcceptanceTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/acceptance_slices/AbstractAcceptanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/acceptance_traces/AbstractAcceptanceTest.trace com.thoughtworks.acceptance.AbstractAcceptanceTest.assertBothWaysNormalized:110:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertBothWays:134:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertWithAsymmetricalXml:159:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertObjectsEqual:179:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertObjectsEqual:185:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertObjectsEqual:181:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertObjectsEqual:177:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertArrayEquals:194:*,com.thoughtworks.acceptance.AbstractAcceptanceTest.assertByteArrayEquals:201:*>$HCC_EXPERIMENTS/slices/xstream/acceptance_slices/AbstractAcceptanceTest/AbstractAcceptanceTest.txt

#Total Asserts in com.thoughtworks.acceptance/AbstractAcceptanceTest=============9
#Total Tests in com.thoughtworks.acceptance/AbstractAcceptanceTest=============0
