#!/bin/bash

echo "computing slice for FilterTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/FilterTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/FilterTest.trace ca.uqac.lif.cep.FilterTest.testFilter2:98:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/FilterTest/FilterTest1.txt

#Total Asserts in ca.uqac.lif.cep/FilterTest=============1
#Total Tests in ca.uqac.lif.cep/FilterTest=============0
