#!/bin/bash

echo "computing slice for UnicodeUnpairedSurrogateRemoverTest"

mkdir -p slices/translate_slices/UnicodeUnpairedSurrogateRemoverTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemoverTest.testValidCharacters:35:*>slices/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTestUnicodeUnpairedSurrogateRemoverTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemoverTest.testValidCharacters:36:*>slices/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTestUnicodeUnpairedSurrogateRemoverTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemoverTest.testValidCharacters:37:*>slices/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTestUnicodeUnpairedSurrogateRemoverTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemoverTest.testInvalidCharacters:42:*>slices/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTestUnicodeUnpairedSurrogateRemoverTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemoverTest.testInvalidCharacters:43:*>slices/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTestUnicodeUnpairedSurrogateRemoverTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/UnicodeUnpairedSurrogateRemoverTest.trace org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemoverTest.testInvalidCharacters:44:*>slices/translate_slices/UnicodeUnpairedSurrogateRemoverTest/UnicodeUnpairedSurrogateRemoverTestUnicodeUnpairedSurrogateRemoverTest6.txt

#Total Asserts in org.apache.commons.text.translate/UnicodeUnpairedSurrogateRemoverTest=============6
#Total Tests in org.apache.commons.text.translate/UnicodeUnpairedSurrogateRemoverTest=============0
