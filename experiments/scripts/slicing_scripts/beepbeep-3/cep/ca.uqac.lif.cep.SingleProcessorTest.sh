#!/bin/bash

echo "computing slice for SingleProcessorTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testPullSoftException1:80:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testSamePullable:100:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testSamePushable:109:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testWithQueue:122:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testWithQueue:123:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testWithQueue:124:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testStop:136:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testStop:138:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testStop:140:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testStopSoft:152:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testStopSoft:154:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/SingleProcessorTest.trace ca.uqac.lif.cep.SingleProcessorTest.testStopSoft:156:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/SingleProcessorTest/SingleProcessorTest12.txt

#Total Asserts in ca.uqac.lif.cep/SingleProcessorTest=============12
#Total Tests in ca.uqac.lif.cep/SingleProcessorTest=============0
