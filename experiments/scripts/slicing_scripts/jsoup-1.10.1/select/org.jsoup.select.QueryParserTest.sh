#!/bin/bash

echo "computing slice for QueryParserTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testOrGetsCorrectPrecedence:16:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testOrGetsCorrectPrecedence:18:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testOrGetsCorrectPrecedence:20:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testOrGetsCorrectPrecedence:22:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testOrGetsCorrectPrecedence:23:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testOrGetsCorrectPrecedence:24:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testParsesMultiCorrectly:30:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testParsesMultiCorrectly:32:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testParsesMultiCorrectly:37:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testParsesMultiCorrectly:38:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testParsesMultiCorrectly:39:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/select_traces/QueryParserTest.trace org.jsoup.select.QueryParserTest.testParsesMultiCorrectly:40:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/select_slices/QueryParserTest/QueryParserTest12.txt

#Total Asserts in org.jsoup.select/QueryParserTest=============12
#Total Tests in org.jsoup.select/QueryParserTest=============0
