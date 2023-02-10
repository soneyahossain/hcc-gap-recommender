#!/bin/bash

echo "computing slice for WindowFunctionTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/WindowFunctionTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/WindowFunctionTest.trace ca.uqac.lif.cep.tmf.WindowFunctionTest.test1:31:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/WindowFunctionTest/WindowFunctionTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/WindowFunctionTest.trace ca.uqac.lif.cep.tmf.WindowFunctionTest.test1:33:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/WindowFunctionTest/WindowFunctionTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/WindowFunctionTest.trace ca.uqac.lif.cep.tmf.WindowFunctionTest.test1:35:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/WindowFunctionTest/WindowFunctionTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/WindowFunctionTest.trace ca.uqac.lif.cep.tmf.WindowFunctionTest.test1:36:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/WindowFunctionTest/WindowFunctionTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/WindowFunctionTest.trace ca.uqac.lif.cep.tmf.WindowFunctionTest.test1:38:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/WindowFunctionTest/WindowFunctionTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/tmf_traces/WindowFunctionTest.trace ca.uqac.lif.cep.tmf.WindowFunctionTest.test1:40:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/tmf_slices/WindowFunctionTest/WindowFunctionTest6.txt

#Total Asserts in ca.uqac.lif.cep.tmf/WindowFunctionTest=============6
#Total Tests in ca.uqac.lif.cep.tmf/WindowFunctionTest=============0
