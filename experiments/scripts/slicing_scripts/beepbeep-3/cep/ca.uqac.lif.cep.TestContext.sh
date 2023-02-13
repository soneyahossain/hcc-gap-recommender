#!/bin/bash

echo "computing slice for TestContext"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/TestContext

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/TestContext.trace ca.uqac.lif.cep.TestContext.testPutAll1:36:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/TestContext/TestContext1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/TestContext.trace ca.uqac.lif.cep.TestContext.testPutAll1:37:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/TestContext/TestContext2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/TestContext.trace ca.uqac.lif.cep.TestContext.testPutAll2:44:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/TestContext/TestContext3.txt

#Total Asserts in ca.uqac.lif.cep/TestContext=============3
#Total Tests in ca.uqac.lif.cep/TestContext=============0
