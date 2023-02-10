#!/bin/bash

echo "computing slice for PushableTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PushableTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PushableTest.trace ca.uqac.lif.cep.PushableTest.testPushNotSupported1:59:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PushableTest/PushableTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PushableTest.trace ca.uqac.lif.cep.PushableTest.testPushNotSupported1:77:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PushableTest/PushableTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PushableTest.trace ca.uqac.lif.cep.PushableTest.testPushNotSupported1:78:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PushableTest/PushableTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/PushableTest.trace ca.uqac.lif.cep.PushableTest.testPushNotSupported1:79:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/PushableTest/PushableTest4.txt

#Total Asserts in ca.uqac.lif.cep/PushableTest=============4
#Total Tests in ca.uqac.lif.cep/PushableTest=============0
