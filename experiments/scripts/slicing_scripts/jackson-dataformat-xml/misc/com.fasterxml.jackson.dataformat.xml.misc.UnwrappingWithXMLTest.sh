#!/bin/bash

echo "computing slice for UnwrappingWithXMLTest"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testSimpleUnwrappingRoundtrip:94:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testSimpleUnwrappingRoundtrip:95:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testSimpleUnwrappingRoundtrip:96:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testSimpleUnwrappingRoundtrip:97:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testSimpleUnwrappingRoundtrip:100:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingWithAttribute:109:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingWithAttribute:110:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingWithAttribute:111:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingWithAttribute:112:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingWithAttribute:115:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingSubWithAttribute:124:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest11.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingSubWithAttribute:125:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest12.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingSubWithAttribute:126:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest13.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingSubWithAttribute:127:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest14.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/misc_traces/UnwrappingWithXMLTest.trace com.fasterxml.jackson.dataformat.xml.misc.UnwrappingWithXMLTest.testUnwrappingSubWithAttribute:130:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/misc_slices/UnwrappingWithXMLTest/UnwrappingWithXMLTest15.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.misc/UnwrappingWithXMLTest=============15
#Total Tests in com.fasterxml.jackson.dataformat.xml.misc/UnwrappingWithXMLTest=============0