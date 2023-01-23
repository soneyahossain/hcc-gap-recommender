#!/bin/bash

echo "computing slice for RequiredNameTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequired:83:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequired:88:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequired:89:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequired:90:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequired:92:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequired:93:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequired:94:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstNameBlank:117:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstNameBlank:122:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstNameBlank:123:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstNameBlank:124:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstNameBlank:126:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstNameBlank:127:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstNameBlank:128:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstName:151:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstName:156:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstName:157:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstName:158:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstName:160:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstName:161:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredFirstName:162:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastNameBlank:185:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastNameBlank:190:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastNameBlank:191:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastNameBlank:192:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastNameBlank:194:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastNameBlank:195:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastNameBlank:196:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastName:219:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastName:224:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastName:225:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastName:226:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastName:228:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastName:229:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredLastName:230:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredName:255:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredName:260:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredName:261:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredName:262:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredName:264:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredName:265:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-validator/validator_traces/RequiredNameTest.trace org.apache.commons.validator.RequiredNameTest.testRequiredName:266:*>$HCC_EXPERIMENTS/slices/commons-validator/validator_slices/RequiredNameTest/RequiredNameTest42.txt

#Total Asserts in org.apache.commons.validator/RequiredNameTest=============42
#Total Tests in org.apache.commons.validator/RequiredNameTest=============0