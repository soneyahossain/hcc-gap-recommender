#!/bin/bash

echo "computing slice for Utils"

mkdir -p $HCC_EXPERIMENTS/slices/commons-csv/csv_slices/Utils

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/Utils.trace org.apache.commons.csv.Utils.compare:41:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/Utils/Utils1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-csv/csv_traces/Utils.trace org.apache.commons.csv.Utils.compare:43:*>$HCC_EXPERIMENTS/slices/commons-csv/csv_slices/Utils/Utils2.txt

#Total Asserts in org.apache.commons.csv/Utils=============2
#Total Tests in org.apache.commons.csv/Utils=============0
