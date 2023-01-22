#!/bin/bash

echo "computing slice for TagTest"

mkdir -p $HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.isCaseSensitive:14:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.canBeInsensitive:20:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.trims:26:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.equality:32:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.equality:33:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.divSemantics:39:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.divSemantics:40:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.pSemantics:46:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.pSemantics:47:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.imgSemantics:52:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.imgSemantics:53:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.imgSemantics:54:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.defaultSemantics:61:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.defaultSemantics:62:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jsoup-1.10.1/parser_traces/TagTest.trace org.jsoup.parser.TagTest.defaultSemantics:63:*>$HCC_EXPERIMENTS/slices/jsoup-1.10.1/parser_slices/TagTest/TagTest15.txt

#Total Asserts in org.jsoup.parser/TagTest=============15
#Total Tests in org.jsoup.parser/TagTest=============0
