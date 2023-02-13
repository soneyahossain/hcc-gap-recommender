#!/bin/bash

echo "computing slice for SimpleTests"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SimpleTests

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SimpleTests.trace ca.uqac.lif.cep.SimpleTests.testConstant:45:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SimpleTests/SimpleTests1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SimpleTests.trace ca.uqac.lif.cep.SimpleTests.testConstant:47:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SimpleTests/SimpleTests2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SimpleTests.trace ca.uqac.lif.cep.SimpleTests.testPassthrough:62:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SimpleTests/SimpleTests3.txt

#Total Asserts in ca.uqac.lif.cep/SimpleTests=============3
#Total Tests in ca.uqac.lif.cep/SimpleTests=============0
