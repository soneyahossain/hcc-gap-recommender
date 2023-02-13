#!/bin/bash

echo "computing slice for ProvenanceTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ProvenanceTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ProvenanceTest.trace ca.uqac.lif.cep.ProvenanceTest.testNoOp1:48:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ProvenanceTest/ProvenanceTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ProvenanceTest.trace ca.uqac.lif.cep.ProvenanceTest.testNoOp1:49:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ProvenanceTest/ProvenanceTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ProvenanceTest.trace ca.uqac.lif.cep.ProvenanceTest.testNoOp2:64:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ProvenanceTest/ProvenanceTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ProvenanceTest.trace ca.uqac.lif.cep.ProvenanceTest.testNoOp2:65:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ProvenanceTest/ProvenanceTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/ProvenanceTest.trace ca.uqac.lif.cep.ProvenanceTest.testNoOp2:66:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/ProvenanceTest/ProvenanceTest5.txt

#Total Asserts in ca.uqac.lif.cep/ProvenanceTest=============5
#Total Tests in ca.uqac.lif.cep/ProvenanceTest=============0
