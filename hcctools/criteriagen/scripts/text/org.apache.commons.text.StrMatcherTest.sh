#!/bin/bash

echo "computing slice for StrMatcherTest"

mkdir -p slices/text_slices/StrMatcherTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCommaMatcher:37:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCommaMatcher:38:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCommaMatcher:39:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCommaMatcher:40:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTabMatcher:47:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTabMatcher:48:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTabMatcher:49:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTabMatcher:50:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSpaceMatcher:57:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSpaceMatcher:58:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSpaceMatcher:59:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSpaceMatcher:60:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:67:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:68:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:69:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:70:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:71:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:72:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:73:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:74:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:75:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSplitMatcher:76:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:83:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:84:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:85:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:86:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:87:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:88:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:89:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:90:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:91:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testTrimMatcher:92:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSingleQuoteMatcher:99:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSingleQuoteMatcher:100:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSingleQuoteMatcher:101:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testSingleQuoteMatcher:102:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testDoubleQuoteMatcher:109:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testDoubleQuoteMatcher:110:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testDoubleQuoteMatcher:111:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testQuoteMatcher:118:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testQuoteMatcher:119:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testQuoteMatcher:120:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testQuoteMatcher:121:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:128:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:129:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:130:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:131:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest47.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:132:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest48.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:133:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest49.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:134:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest50.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:135:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest51.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:136:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest52.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:137:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest53.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:138:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest54.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:139:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest55.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:140:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest56.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testNoneMatcher:141:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest57.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharMatcher_char:148:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest58.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharMatcher_char:149:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest59.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharMatcher_char:150:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest60.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharMatcher_char:151:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest61.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharMatcher_char:152:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest62.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharMatcher_char:153:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest63.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:160:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest64.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:161:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest65.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:162:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest66.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:163:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest67.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:164:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest68.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:165:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest69.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:166:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest70.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:167:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest71.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_String:168:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest72.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:175:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest73.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:176:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest74.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:177:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest75.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:178:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest76.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:179:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest77.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:180:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest78.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:181:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest79.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:182:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest80.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testCharSetMatcher_charArray:183:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest81.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:190:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest82.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:191:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest83.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:192:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest84.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:193:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest85.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:194:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest86.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:195:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest87.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:196:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest88.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testStringMatcher_String:197:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest89.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testMatcherIndices:207:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest90.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testMatcherIndices:208:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest91.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StrMatcherTest.trace org.apache.commons.text.StrMatcherTest.testMatcherIndices:209:*>slices/text_slices/StrMatcherTest/StrMatcherTestStrMatcherTest92.txt

#Total Asserts in org.apache.commons.text/StrMatcherTest=============92
#Total Tests in org.apache.commons.text/StrMatcherTest=============0