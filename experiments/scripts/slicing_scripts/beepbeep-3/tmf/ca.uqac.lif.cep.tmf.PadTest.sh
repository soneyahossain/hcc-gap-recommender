#!/bin/bash

echo "computing slice for PadTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:40:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:41:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:43:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:44:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:46:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:47:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:48:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:49:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:50:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/PadTest.trace ca.uqac.lif.cep.tmf.PadTest.test1Push:51:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/PadTest/PadTest10.txt

#Total Asserts in ca.uqac.lif.cep.tmf/PadTest=============10
#Total Tests in ca.uqac.lif.cep.tmf/PadTest=============0
