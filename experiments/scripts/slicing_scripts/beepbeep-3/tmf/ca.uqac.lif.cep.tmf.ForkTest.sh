#!/bin/bash

echo "computing slice for ForkTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ForkTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ForkTest.trace ca.uqac.lif.cep.tmf.ForkTest.testFork1:121:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ForkTest/ForkTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ForkTest.trace ca.uqac.lif.cep.tmf.ForkTest.testFork1:123:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ForkTest/ForkTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ForkTest.trace ca.uqac.lif.cep.tmf.ForkTest.testFork1:125:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ForkTest/ForkTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ForkTest.trace ca.uqac.lif.cep.tmf.ForkTest.testFork1:127:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ForkTest/ForkTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ForkTest.trace ca.uqac.lif.cep.tmf.ForkTest.testFork1:129:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ForkTest/ForkTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ForkTest.trace ca.uqac.lif.cep.tmf.ForkTest.testFork5:154:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ForkTest/ForkTest6.txt

#Total Asserts in ca.uqac.lif.cep.tmf/ForkTest=============6
#Total Tests in ca.uqac.lif.cep.tmf/ForkTest=============0
