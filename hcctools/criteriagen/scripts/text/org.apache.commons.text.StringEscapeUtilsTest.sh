#!/bin/bash

echo "computing slice for StringEscapeUtilsTest"

mkdir -p slices/text_slices/StringEscapeUtilsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testConstructor:52:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testConstructor:54:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testConstructor:55:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testConstructor:56:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testConstructor:57:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeJava:62:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeJavaWithSlash:112:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.assertEscapeJava:122:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.assertEscapeJava:126:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeJava:131:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.assertUnescapeJava:173:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.assertUnescapeJava:182:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeEcmaScript:187:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeEcmaScript:203:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeEcmaScript:204:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest15.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtml3:234:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest16.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtml3:241:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest17.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml3:251:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest18.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml3:259:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest19.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml3:264:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest20.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml3:266:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest21.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml3:267:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest22.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml3:268:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest23.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml3:269:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest24.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtml4:278:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest25.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtml4:285:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest26.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml4:295:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest27.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml4:303:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest28.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml4:308:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest29.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml4:310:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest30.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml4:311:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest31.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml4:312:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest32.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHtml4:313:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest33.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHexCharsHtml:319:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest34.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHexCharsHtml:320:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest35.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeHexCharsHtml:328:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest36.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeUnknownEntity:335:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest37.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtmlVersions:340:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest38.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtmlVersions:341:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest39.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml10:350:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest40.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml10:351:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest41.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml10:353:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest42.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml10:355:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest43.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml10:357:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest44.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml10:359:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest45.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml11:366:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest46.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml11:367:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest47.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml11:369:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest48.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml11:371:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest49.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml11:374:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest50.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml11:377:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest51.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXml11:379:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest52.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeXmlSupplementaryCharacters:390:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest53.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeXmlSupplementaryCharacters:393:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest54.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testStandaloneAmphersand:401:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest55.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testStandaloneAmphersand:402:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest56.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testStandaloneAmphersand:403:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest57.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testStandaloneAmphersand:404:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest58.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testLang313:409:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest59.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:414:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest60.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:415:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest61.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:416:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest62.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:417:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest63.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:418:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest64.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:419:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest65.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:420:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest66.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeCsvString:421:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest67.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.checkCsvEscapeWriter:440:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest68.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:448:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest69.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:449:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest70.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:450:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest71.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:451:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest72.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:452:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest73.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:453:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest74.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:454:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest75.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:455:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest76.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeCsvString:457:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest77.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.checkCsvUnescapeWriter:478:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest78.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtmlHighUnicode:498:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest79.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtmlHighUnicode:501:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest80.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHiragana:516:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest81.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHiragana:521:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest82.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testLang708:536:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest83.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testLang708:538:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest84.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testLang911:549:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest85.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeJson:554:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest86.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeJson:570:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest87.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeJson:575:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest88.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testBuilder:582:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest89.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXSI:587:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest90.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXSI:588:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest91.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXSI:589:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest92.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeXSI:590:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest93.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnscapeXSI:595:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest94.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnscapeXSI:596:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest95.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnscapeXSI:597:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest96.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnscapeXSI:598:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest97.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnscapeXSI:599:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest98.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeEcmaScript:604:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest99.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeEcmaScript:605:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest100.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeEcmaScript:606:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest101.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeEcmaScript:608:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest102.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtmlThree:614:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest103.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtmlThree:615:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest104.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testEscapeHtmlThree:616:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest105.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeJson:624:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest106.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeJson:625:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest107.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeJson:626:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest108.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeJson:627:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest109.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeJsonFoundBug_Issue_Text_100:635:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest110.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/text_traces/StringEscapeUtilsTest.trace org.apache.commons.text.StringEscapeUtilsTest.testUnescapeJsonFoundBug_Issue_Text_100_Fix:643:*>slices/text_slices/StringEscapeUtilsTest/StringEscapeUtilsTest111.txt

#Total Asserts in org.apache.commons.text/StringEscapeUtilsTest=============111
#Total Tests in org.apache.commons.text/StringEscapeUtilsTest=============0