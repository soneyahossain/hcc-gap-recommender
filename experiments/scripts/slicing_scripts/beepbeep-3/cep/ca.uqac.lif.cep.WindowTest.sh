#!/bin/bash

echo "computing slice for WindowTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/WindowTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/WindowTest.trace ca.uqac.lif.cep.WindowTest.testWindowPull1:49:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/WindowTest/WindowTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/WindowTest.trace ca.uqac.lif.cep.WindowTest.testWindowPull1:51:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/WindowTest/WindowTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/WindowTest.trace ca.uqac.lif.cep.WindowTest.testWindowPull1:53:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/WindowTest/WindowTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/WindowTest.trace ca.uqac.lif.cep.WindowTest.testWindowPull1:55:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/WindowTest/WindowTest4.txt

#Total Asserts in ca.uqac.lif.cep/WindowTest=============4
#Total Tests in ca.uqac.lif.cep/WindowTest=============0
