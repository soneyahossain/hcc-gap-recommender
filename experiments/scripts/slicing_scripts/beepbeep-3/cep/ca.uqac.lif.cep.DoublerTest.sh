#!/bin/bash

echo "computing slice for DoublerTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DoublerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/DoublerTest.trace ca.uqac.lif.cep.DoublerTest.test1:38:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DoublerTest/DoublerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/DoublerTest.trace ca.uqac.lif.cep.DoublerTest.test1:39:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DoublerTest/DoublerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/DoublerTest.trace ca.uqac.lif.cep.DoublerTest.test1:40:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DoublerTest/DoublerTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/DoublerTest.trace ca.uqac.lif.cep.DoublerTest.test1:41:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/DoublerTest/DoublerTest4.txt

#Total Asserts in ca.uqac.lif.cep/DoublerTest=============4
#Total Tests in ca.uqac.lif.cep/DoublerTest=============0
