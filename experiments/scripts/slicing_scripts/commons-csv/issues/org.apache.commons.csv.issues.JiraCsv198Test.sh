#!/bin/bash

echo "skipping slice for JiraCsv198Test"
exit 0

echo "computing slice for JiraCsv198Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv198Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv198Test.trace org.apache.commons.csv.issues.JiraCsv198Test.test:37:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv198Test/JiraCsv198Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv198Test.trace org.apache.commons.csv.issues.JiraCsv198Test.test:42:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv198Test/JiraCsv198Test2.txt

#Total Asserts in org.apache.commons.csv.issues/JiraCsv198Test=============2
#Total Tests in org.apache.commons.csv.issues/JiraCsv198Test=============0
