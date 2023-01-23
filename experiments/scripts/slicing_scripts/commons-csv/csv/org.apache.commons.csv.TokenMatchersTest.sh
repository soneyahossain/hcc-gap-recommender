#!/bin/bash

echo "computing slice for TokenMatchersTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testHasType:43:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testHasType:44:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testHasType:45:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testHasType:46:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testHasContent:51:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testHasContent:52:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testIsReady:57:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testIsReady:59:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testMatches:64:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testMatches:65:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testMatches:66:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/TokenMatchersTest.trace org.apache.commons.csv.TokenMatchersTest.testMatches:67:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/TokenMatchersTest/TokenMatchersTest12.txt

#Total Asserts in org.apache.commons.csv/TokenMatchersTest=============12
#Total Tests in org.apache.commons.csv/TokenMatchersTest=============0
