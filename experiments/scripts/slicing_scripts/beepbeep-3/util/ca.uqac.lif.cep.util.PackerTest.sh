#!/bin/bash

echo "computing slice for PackerTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/PackerTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/PackerTest.trace ca.uqac.lif.cep.util.PackerTest.listPackerTest1:52:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/PackerTest/PackerTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/PackerTest.trace ca.uqac.lif.cep.util.PackerTest.listPackerTest1:54:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/PackerTest/PackerTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/PackerTest.trace ca.uqac.lif.cep.util.PackerTest.listPackerTest1:59:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/PackerTest/PackerTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/PackerTest.trace ca.uqac.lif.cep.util.PackerTest.listPackerTest1:62:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/PackerTest/PackerTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/PackerTest.trace ca.uqac.lif.cep.util.PackerTest.unpackerTest:80:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/PackerTest/PackerTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/PackerTest.trace ca.uqac.lif.cep.util.PackerTest.unpackerTest:81:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/PackerTest/PackerTest6.txt

#Total Asserts in ca.uqac.lif.cep.util/PackerTest=============6
#Total Tests in ca.uqac.lif.cep.util/PackerTest=============0
