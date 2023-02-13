#!/bin/bash

echo "computing slice for DecimateTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DecimateTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/DecimateTest.trace ca.uqac.lif.cep.DecimateTest.testDecimateTracker:146:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DecimateTest/DecimateTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/DecimateTest.trace ca.uqac.lif.cep.DecimateTest.testDecimateTracker:148:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DecimateTest/DecimateTest2.txt

#Total Asserts in ca.uqac.lif.cep/DecimateTest=============2
#Total Tests in ca.uqac.lif.cep/DecimateTest=============0
