#!/bin/bash

echo "computing slice for ApplyFunctionLazyTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/functions_slices/ApplyFunctionLazyTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/functions_traces/ApplyFunctionLazyTest.trace ca.uqac.lif.cep.functions.ApplyFunctionLazyTest.test1:27:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/functions_slices/ApplyFunctionLazyTest/ApplyFunctionLazyTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/functions_traces/ApplyFunctionLazyTest.trace ca.uqac.lif.cep.functions.ApplyFunctionLazyTest.test1:29:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/functions_slices/ApplyFunctionLazyTest/ApplyFunctionLazyTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/functions_traces/ApplyFunctionLazyTest.trace ca.uqac.lif.cep.functions.ApplyFunctionLazyTest.test1:31:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/functions_slices/ApplyFunctionLazyTest/ApplyFunctionLazyTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/functions_traces/ApplyFunctionLazyTest.trace ca.uqac.lif.cep.functions.ApplyFunctionLazyTest.test1:33:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/functions_slices/ApplyFunctionLazyTest/ApplyFunctionLazyTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/functions_traces/ApplyFunctionLazyTest.trace ca.uqac.lif.cep.functions.ApplyFunctionLazyTest.test1:35:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/functions_slices/ApplyFunctionLazyTest/ApplyFunctionLazyTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/functions_traces/ApplyFunctionLazyTest.trace ca.uqac.lif.cep.functions.ApplyFunctionLazyTest.test1:37:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/functions_slices/ApplyFunctionLazyTest/ApplyFunctionLazyTest6.txt

#Total Asserts in ca.uqac.lif.cep.functions/ApplyFunctionLazyTest=============6
#Total Tests in ca.uqac.lif.cep.functions/ApplyFunctionLazyTest=============0
