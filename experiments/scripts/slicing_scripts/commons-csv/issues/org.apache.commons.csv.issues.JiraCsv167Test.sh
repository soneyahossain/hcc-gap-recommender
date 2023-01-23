#!/bin/bash

echo "computing slice for JiraCsv167Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv167Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv167Test.trace org.apache.commons.csv.issues.JiraCsv167Test.parse:80:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv167Test/JiraCsv167Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv167Test.trace org.apache.commons.csv.issues.JiraCsv167Test.parse:81:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv167Test/JiraCsv167Test2.txt

#Total Asserts in org.apache.commons.csv.issues/JiraCsv167Test=============2
#Total Tests in org.apache.commons.csv.issues/JiraCsv167Test=============0
