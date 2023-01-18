#!/bin/bash

echo "computing slice for CharacterPredicatesTest"

mkdir -p slices/text_slices/CharacterPredicatesTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testLetters:30:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testLetters:31:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testLetters:33:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testLetters:34:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testLetters:35:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testDigits:40:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testDigits:41:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testDigits:43:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testDigits:44:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testDigits:45:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testArabicNumerals:50:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testArabicNumerals:51:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testArabicNumerals:52:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testArabicNumerals:54:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testArabicNumerals:55:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testArabicNumerals:56:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLowercaseLetters:61:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLowercaseLetters:62:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLowercaseLetters:64:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLowercaseLetters:65:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLowercaseLetters:66:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLowercaseLetters:67:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLowercaseLetters:68:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiUppercaseLetters:73:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiUppercaseLetters:74:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiUppercaseLetters:76:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiUppercaseLetters:77:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiUppercaseLetters:78:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiUppercaseLetters:79:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiUppercaseLetters:80:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:85:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:86:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:87:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:88:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:90:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:91:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:92:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:93:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiLetters:94:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:99:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:100:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:101:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:102:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:103:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:104:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:106:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:107:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest47.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:108:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest48.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:109:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest49.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:110:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest50.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/CharacterPredicatesTest.trace org.apache.commons.text.CharacterPredicatesTest.testAsciiAlphaNumerals:111:*>slices/text_slices/CharacterPredicatesTest/CharacterPredicatesTestCharacterPredicatesTest51.txt

#Total Asserts in org.apache.commons.text/CharacterPredicatesTest=============51
#Total Tests in org.apache.commons.text/CharacterPredicatesTest=============0