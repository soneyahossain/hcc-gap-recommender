#!/bin/bash

echo "computing slice for CsvTranslatorsTest"

mkdir -p slices/translate_slices/CsvTranslatorsTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvEscaperPlaneTextTest:37:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvEscaperCommaTest:47:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvEscaperQuoteTest:57:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvEscaperCRTest:67:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvEscaperLFTest:77:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvUnEscaperPlaneTextTest:87:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvUnEscaperTest1:97:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvUnEscaperTest2:107:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvUnEscaperTest3:117:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar slicer.jar -m=1 -p trace/translate_traces/CsvTranslatorsTest.trace org.apache.commons.text.translate.CsvTranslatorsTest.csvUnEscaperTest4:127:*>slices/translate_slices/CsvTranslatorsTest/CsvTranslatorsTestCsvTranslatorsTest10.txt

#Total Asserts in org.apache.commons.text.translate/CsvTranslatorsTest=============10
#Total Tests in org.apache.commons.text.translate/CsvTranslatorsTest=============0
