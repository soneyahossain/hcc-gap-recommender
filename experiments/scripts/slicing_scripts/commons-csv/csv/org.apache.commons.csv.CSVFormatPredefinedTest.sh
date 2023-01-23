#!/bin/bash

echo "computing slice for CSVFormatPredefinedTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-csv/csv_slices/CSVFormatPredefinedTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/CSVFormatPredefinedTest.trace org.apache.commons.csv.CSVFormatPredefinedTest.test:29:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/CSVFormatPredefinedTest/CSVFormatPredefinedTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/CSVFormatPredefinedTest.trace org.apache.commons.csv.CSVFormatPredefinedTest.test:30:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/CSVFormatPredefinedTest/CSVFormatPredefinedTest2.txt

#Total Asserts in org.apache.commons.csv/CSVFormatPredefinedTest=============2
#Total Tests in org.apache.commons.csv/CSVFormatPredefinedTest=============0
