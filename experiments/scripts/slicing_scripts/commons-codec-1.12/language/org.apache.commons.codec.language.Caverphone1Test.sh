#!/bin/bash

echo "computing slice for Caverphone1Test"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/Caverphone1Test

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/Caverphone1Test.trace org.apache.commons.codec.language.Caverphone1Test.testIsCaverphoneEquals:79:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/Caverphone1Test/Caverphone1Test1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/language_traces/Caverphone1Test.trace org.apache.commons.codec.language.Caverphone1Test.testIsCaverphoneEquals:80:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/language_slices/Caverphone1Test/Caverphone1Test2.txt

#Total Asserts in org.apache.commons.codec.language/Caverphone1Test=============2
#Total Tests in org.apache.commons.codec.language/Caverphone1Test=============0
