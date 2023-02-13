#!/bin/bash

echo "computing slice for CallerTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/io_slices/CallerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/io_traces/CallerTest.trace ca.uqac.lif.cep.io.CallerTest.testCommandWindows:64:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/io_slices/CallerTest/CallerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/io_traces/CallerTest.trace ca.uqac.lif.cep.io.CallerTest.testCommandWindows:66:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/io_slices/CallerTest/CallerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/io_traces/CallerTest.trace ca.uqac.lif.cep.io.CallerTest.testCommandLinux:80:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/io_slices/CallerTest/CallerTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/io_traces/CallerTest.trace ca.uqac.lif.cep.io.CallerTest.testCommandLinux:82:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/io_slices/CallerTest/CallerTest4.txt

#Total Asserts in ca.uqac.lif.cep.io/CallerTest=============4
#Total Tests in ca.uqac.lif.cep.io/CallerTest=============0
