#!/bin/bash

echo "computing slice for JiraCsv164Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv164Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv164Test.trace org.apache.commons.csv.issues.JiraCsv164Test.testJiraCsv154_withCommentMarker:40:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv164Test/JiraCsv164Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/issues_traces/JiraCsv164Test.trace org.apache.commons.csv.issues.JiraCsv164Test.testJiraCsv154_withHeaderComments:54:*>$HCC_EXPERIMENTS/slices/commons-csv/issues_slices/JiraCsv164Test/JiraCsv164Test2.txt

#Total Asserts in org.apache.commons.csv.issues/JiraCsv164Test=============2
#Total Tests in org.apache.commons.csv.issues/JiraCsv164Test=============0
