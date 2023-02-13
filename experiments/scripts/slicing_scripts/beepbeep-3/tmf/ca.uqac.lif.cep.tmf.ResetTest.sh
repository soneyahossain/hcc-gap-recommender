#!/bin/bash

echo "computing slice for ResetTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test1:44:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test1:45:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test1:46:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test2:59:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test2:60:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test2:61:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test3:74:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test3:75:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test3:81:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/ResetTest.trace ca.uqac.lif.cep.tmf.ResetTest.test3:82:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/ResetTest/ResetTest10.txt

#Total Asserts in ca.uqac.lif.cep.tmf/ResetTest=============10
#Total Tests in ca.uqac.lif.cep.tmf/ResetTest=============0
