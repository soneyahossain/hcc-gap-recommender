#!/bin/bash

echo "computing slice for TokenQueueTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompBalanced:16:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompBalanced:17:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompBalanced:18:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompEscapedBalanced:27:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompEscapedBalanced:28:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompEscapedBalanced:29:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompEscapedBalanced:30:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompBalancedMatchesAsMuchAsPossible:37:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.unescape:41:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompToIgnoreCase:48:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.chompToIgnoreCase:52:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TokenQueueTest.trace org.jsoup.parser.TokenQueueTest.addFirst:59:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TokenQueueTest/TokenQueueTest12.txt

#Total Asserts in org.jsoup.parser/TokenQueueTest=============12
#Total Tests in org.jsoup.parser/TokenQueueTest=============0
