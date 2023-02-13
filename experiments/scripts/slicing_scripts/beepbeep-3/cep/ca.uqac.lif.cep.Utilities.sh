#!/bin/bash

echo "computing slice for Utilities"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/Utilities

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/Utilities.trace ca.uqac.lif.cep.Utilities.queueContains:40:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/Utilities/Utilities1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/Utilities.trace ca.uqac.lif.cep.Utilities.queueContains:42:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/Utilities/Utilities2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/Utilities.trace ca.uqac.lif.cep.Utilities.queueContains:43:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/Utilities/Utilities3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/Utilities.trace ca.uqac.lif.cep.Utilities.queueContains:44:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/Utilities/Utilities4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/Utilities.trace ca.uqac.lif.cep.Utilities.assertEquals:49:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/Utilities/Utilities5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/Utilities.trace ca.uqac.lif.cep.Utilities.assertEquals:50:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/Utilities/Utilities6.txt

#Total Asserts in ca.uqac.lif.cep/Utilities=============6
#Total Tests in ca.uqac.lif.cep/Utilities=============0
