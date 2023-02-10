#!/bin/bash

echo "computing slice for ThroughputTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ThroughputTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ThroughputTest.trace ca.uqac.lif.cep.ThroughputTest.testPassthroughPull:72:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ThroughputTest/ThroughputTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ThroughputTest.trace ca.uqac.lif.cep.ThroughputTest.testPassthroughPush:106:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ThroughputTest/ThroughputTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ThroughputTest.trace ca.uqac.lif.cep.ThroughputTest.testWindow:134:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ThroughputTest/ThroughputTest3.txt

#Total Asserts in ca.uqac.lif.cep/ThroughputTest=============3
#Total Tests in ca.uqac.lif.cep/ThroughputTest=============0
