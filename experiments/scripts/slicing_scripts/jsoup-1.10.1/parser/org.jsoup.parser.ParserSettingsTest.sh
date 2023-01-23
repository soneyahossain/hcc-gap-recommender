#!/bin/bash

echo "computing slice for ParserSettingsTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:14:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:15:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:17:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:18:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:20:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:21:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:23:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/ParserSettingsTest.trace org.jsoup.parser.ParserSettingsTest.caseSupport:24:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/ParserSettingsTest/ParserSettingsTest8.txt

#Total Asserts in org.jsoup.parser/ParserSettingsTest=============8
#Total Tests in org.jsoup.parser/ParserSettingsTest=============0
