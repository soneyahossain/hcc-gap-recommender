#!/bin/bash

echo "computing slice for PassthroughTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PassthroughTest.trace ca.uqac.lif.cep.PassthroughTest.testPassthrough1:46:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest/PassthroughTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PassthroughTest.trace ca.uqac.lif.cep.PassthroughTest.testPassthrough1:48:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest/PassthroughTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PassthroughTest.trace ca.uqac.lif.cep.PassthroughTest.testPassthrough1:49:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest/PassthroughTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PassthroughTest.trace ca.uqac.lif.cep.PassthroughTest.testPassthrough1:51:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest/PassthroughTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PassthroughTest.trace ca.uqac.lif.cep.PassthroughTest.testPassthrough1:52:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest/PassthroughTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PassthroughTest.trace ca.uqac.lif.cep.PassthroughTest.testPassthrough1:53:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest/PassthroughTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PassthroughTest.trace ca.uqac.lif.cep.PassthroughTest.testInternalState1:63:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PassthroughTest/PassthroughTest7.txt

#Total Asserts in ca.uqac.lif.cep/PassthroughTest=============7
#Total Tests in ca.uqac.lif.cep/PassthroughTest=============0
