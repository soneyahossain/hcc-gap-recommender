#!/bin/bash

echo "computing slice for TestViews"

mkdir -p $HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestViews.trace com.fasterxml.jackson.dataformat.xml.deser.TestViews.testIssue7:100:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews/TestViews1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestViews.trace com.fasterxml.jackson.dataformat.xml.deser.TestViews.testIssue7:101:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews/TestViews2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestViews.trace com.fasterxml.jackson.dataformat.xml.deser.TestViews.testIssue7:102:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews/TestViews3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestViews.trace com.fasterxml.jackson.dataformat.xml.deser.TestViews.testIssue7:103:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews/TestViews4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestViews.trace com.fasterxml.jackson.dataformat.xml.deser.TestViews.testIssue7:104:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews/TestViews5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestViews.trace com.fasterxml.jackson.dataformat.xml.deser.TestViews.testNullSuppression:111:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews/TestViews6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/jackson-dataformat-xml/deser_traces/TestViews.trace com.fasterxml.jackson.dataformat.xml.deser.TestViews.testIssue44:124:*>$HCC_EXPERIMENTS/slices/jackson-dataformat-xml/deser_slices/TestViews/TestViews7.txt

#Total Asserts in com.fasterxml.jackson.dataformat.xml.deser/TestViews=============7
#Total Tests in com.fasterxml.jackson.dataformat.xml.deser/TestViews=============0
