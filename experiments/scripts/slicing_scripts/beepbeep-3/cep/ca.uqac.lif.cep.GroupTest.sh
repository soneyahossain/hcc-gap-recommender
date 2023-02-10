#!/bin/bash

echo "computing slice for GroupTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroup2:80:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroup2:82:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroup2:88:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroup2:89:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroup2:98:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroup2:99:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone1:134:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone2:165:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone2:167:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone2:173:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone2:174:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone2:183:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone2:184:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone3:199:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone4:234:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone4:236:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone4:238:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone4:244:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone4:245:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone4:254:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone4:255:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone6:315:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone6:316:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone6:326:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone6:327:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone7:361:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone7:362:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone7:372:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testClone7:373:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroupPush2:478:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroupPush2:482:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroupPush2:486:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGroupPush2:490:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testReset:569:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testReset:571:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testReset:572:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testReset:574:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testContext:586:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testContext:588:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testContext:589:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testContext:591:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testContext:593:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testContext:594:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testForkDuplicate:612:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testCrawlerBlackHole:622:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testCopyCrawlerBlackHole:633:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testPullable1:648:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest47.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testPullable1:658:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest48.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testPullable1:659:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest49.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testPullable1:660:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest50.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:744:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest51.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:745:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest52.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:746:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest53.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:747:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest54.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:748:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest55.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:750:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest56.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:751:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest57.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:752:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest58.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:753:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest59.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testEndOfTrace1:754:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest60.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/cep_traces/GroupTest.trace ca.uqac.lif.cep.GroupTest.testGetState1:771:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/cep_slices/GroupTest/GroupTest61.txt

#Total Asserts in ca.uqac.lif.cep/GroupTest=============61
#Total Tests in ca.uqac.lif.cep/GroupTest=============0
