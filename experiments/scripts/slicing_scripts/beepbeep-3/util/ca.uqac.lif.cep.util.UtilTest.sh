#!/bin/bash

echo "computing slice for UtilTest"

mkdir -p /home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testContains:63:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testContains:64:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testRunOn:81:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testRunOn:88:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testRunOn:90:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testRunOn:98:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testRunOn:105:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll1:118:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll1:119:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll1:120:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll1:121:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll2:134:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll2:135:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll2:136:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll2:137:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll3:146:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll3:147:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll3:148:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testApplyToAll3:149:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testNthElement1:168:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testNthElement2:177:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testNthElement3:189:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testNthElement4:198:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:213:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:214:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:215:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:216:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:219:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:220:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:223:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:224:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:227:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:228:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:229:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:230:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:233:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:234:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:237:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToArray:238:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:247:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:248:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:249:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:250:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:253:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:254:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:257:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:258:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest47.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:261:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest48.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:262:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest49.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:263:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest50.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:264:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest51.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:267:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest52.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:268:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest53.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:271:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest54.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToList:272:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest55.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:281:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest56.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:282:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest57.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:283:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest58.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:284:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest59.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:287:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest60.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:288:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest61.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:291:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest62.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:292:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest63.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:295:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest64.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:296:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest65.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:297:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest66.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:298:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest67.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:301:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest68.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:302:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest69.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:305:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest70.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testToSet:306:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest71.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:312:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest72.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:313:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest73.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:314:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest74.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:315:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest75.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:316:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest76.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:320:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest77.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:324:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest78.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testSize:328:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest79.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testPack1:342:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest80.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testPack1:345:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest81.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testPack1:347:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest82.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testPack1:349:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest83.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:355:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest84.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:356:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest85.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:357:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest86.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:358:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest87.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:359:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest88.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:360:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest89.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:361:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest90.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:362:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest91.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testStrings:363:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest92.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMaps1:375:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest93.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMaps1:376:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest94.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMaps1:377:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest95.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut1:388:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest96.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut1:393:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest97.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut1:395:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest98.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut1:396:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest99.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut1:398:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest100.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut2:408:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest101.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut2:412:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest102.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut2:414:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest103.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut2:415:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest104.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testMapsPut2:417:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest105.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testGetElementsSet:430:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest106.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testGetElementsList:443:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest107.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testGetElementsList:444:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest108.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar /home/stg/hcc-gap-recommender/experiments/../lib/slicer.jar -m=1 -p /home/stg/hcc-gap-recommender/experiments/traces/beepbeep-3/util_traces/UtilTest.trace ca.uqac.lif.cep.util.UtilTest.testGetElementsList:445:*>/home/stg/hcc-gap-recommender/experiments/slices/beepbeep-3/util_slices/UtilTest/UtilTest109.txt

#Total Asserts in ca.uqac.lif.cep.util/UtilTest=============109
#Total Tests in ca.uqac.lif.cep.util/UtilTest=============0
