#!/bin/bash

echo "computing slice for UniformProcessorTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/UniformProcessorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/UniformProcessorTest.trace ca.uqac.lif.cep.UniformProcessorTest.testSamePullable:20:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/UniformProcessorTest/UniformProcessorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/UniformProcessorTest.trace ca.uqac.lif.cep.UniformProcessorTest.testSamePushable:29:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/UniformProcessorTest/UniformProcessorTest2.txt

#Total Asserts in ca.uqac.lif.cep/UniformProcessorTest=============2
#Total Tests in ca.uqac.lif.cep/UniformProcessorTest=============0
