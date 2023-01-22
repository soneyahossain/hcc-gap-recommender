#!/bin/bash

echo "computing slice for Base64JAXBCodecTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testEncodesEntireByteArrayAsString:24:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testModeWithoutLineWraps:34:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testPadsSingleMissingByteWhenNotMultipleOfThree:65:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testPadsDoubleMissingByteWhenNotMultipleOfThree:72:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testDoesNotPadWhenMultipleOfThree:79:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testHandlesAllPositiveBytes:91:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testHandlesAllNegativeBytes:103:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testHandlesZeroByte:110:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/util_traces/Base64JAXBCodecTest.trace com.thoughtworks.xstream.core.util.Base64JAXBCodecTest.testProducesEmptyStringWhenNoBytesGiven:117:*>$HCC_EXPERIMENTS/slices/xstream/util_slices/Base64JAXBCodecTest/Base64JAXBCodecTest9.txt

#Total Asserts in com.thoughtworks.xstream.core.util/Base64JAXBCodecTest=============9
#Total Tests in com.thoughtworks.xstream.core.util/Base64JAXBCodecTest=============0
