#!/bin/bash

echo "computing slice for UnicodeUnpairedSurrogateRemoverTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/UnicodeUnpairedSurrogateRemoverTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemoverTest.testValidCharacters:41:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemoverTest.testValidCharacters:42:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemoverTest.testValidCharacters:43:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemoverTest.testInvalidCharacters:48:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemoverTest.testInvalidCharacters:49:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-lang-3.6/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemoverTest.testInvalidCharacters:50:*>$HCC_EXPERIMENTS/slices/commons-lang-3.6/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTest6.txt

#Total Asserts in org.apache.commons.lang3.text.translate/UnicodeUnpairedSurrogateRemoverTest=============6
#Total Tests in org.apache.commons.lang3.text.translate/UnicodeUnpairedSurrogateRemoverTest=============0
