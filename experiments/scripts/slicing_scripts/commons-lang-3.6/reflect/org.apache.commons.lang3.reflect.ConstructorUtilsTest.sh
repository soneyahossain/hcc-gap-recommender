#!/bin/bash

echo "computing slice for ConstructorUtilsTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.verify:116:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.verify:117:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testConstructor:147:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:152:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:154:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:156:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:157:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:159:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:161:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:163:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:165:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:167:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor:169:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor:181:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor:183:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor:185:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor:187:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor:189:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor:191:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructor:217:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructor:219:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructor:221:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructorFromDescription:226:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructorFromDescription:228:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.expectMatchingAccessibleConstructorParameterTypes:284:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/reflect_traces/ConstructorUtilsTest.trace org.apache.commons.lang3.reflect.ConstructorUtilsTest.testVarArgsUnboxing:307:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/reflect_slices/ConstructorUtilsTest/ConstructorUtilsTest26.txt

#Total Asserts in org.apache.commons.lang3.reflect/ConstructorUtilsTest=============26
#Total Tests in org.apache.commons.lang3.reflect/ConstructorUtilsTest=============0