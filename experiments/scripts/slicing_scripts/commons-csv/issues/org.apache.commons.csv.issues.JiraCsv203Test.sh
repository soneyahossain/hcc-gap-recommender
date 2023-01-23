#!/bin/bash

echo "computing slice for JiraCsv203Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv203Test.trace org.apache.commons.csv.issues.JiraCsv203Test.testQuoteModeAll:41:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test/JiraCsv203Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv203Test.trace org.apache.commons.csv.issues.JiraCsv203Test.testQuoteModeAllNonNull:55:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test/JiraCsv203Test2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv203Test.trace org.apache.commons.csv.issues.JiraCsv203Test.testWithoutQuoteMode:68:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test/JiraCsv203Test3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv203Test.trace org.apache.commons.csv.issues.JiraCsv203Test.testQuoteModeMinimal:82:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test/JiraCsv203Test4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv203Test.trace org.apache.commons.csv.issues.JiraCsv203Test.testQuoteModeNonNumeric:96:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test/JiraCsv203Test5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv203Test.trace org.apache.commons.csv.issues.JiraCsv203Test.testWithoutNullString:110:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test/JiraCsv203Test6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv203Test.trace org.apache.commons.csv.issues.JiraCsv203Test.testWithEmptyValues:125:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv203Test/JiraCsv203Test7.txt

#Total Asserts in org.apache.commons.csv.issues/JiraCsv203Test=============7
#Total Tests in org.apache.commons.csv.issues/JiraCsv203Test=============0
