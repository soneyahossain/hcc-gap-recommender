#!/bin/bash

echo "computing slice for PullableTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PullableTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PullableTest.trace ca.uqac.lif.cep.PullableTest.testPullNotSupported1:55:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PullableTest/PullableTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PullableTest.trace ca.uqac.lif.cep.PullableTest.testPullNotSupported1:113:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PullableTest/PullableTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PullableTest.trace ca.uqac.lif.cep.PullableTest.testPullNotSupported1:118:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PullableTest/PullableTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PullableTest.trace ca.uqac.lif.cep.PullableTest.testPullNotSupported1:119:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PullableTest/PullableTest4.txt

#Total Asserts in ca.uqac.lif.cep/PullableTest=============4
#Total Tests in ca.uqac.lif.cep/PullableTest=============0
