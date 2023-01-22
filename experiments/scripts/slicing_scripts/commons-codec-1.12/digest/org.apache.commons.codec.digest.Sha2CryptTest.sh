#!/bin/bash

echo "computing slice for Sha2CryptTest"

mkdir -p $HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/Sha2CryptTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/commons-codec-1.12/digest_traces/Sha2CryptTest.trace org.apache.commons.codec.digest.Sha2CryptTest.testCtor:28:*>$HCC_EXPERIMENTS/slices/commons-codec-1.12/digest_slices/Sha2CryptTest/Sha2CryptTest1.txt

#Total Asserts in org.apache.commons.codec.digest/Sha2CryptTest=============1
#Total Tests in org.apache.commons.codec.digest/Sha2CryptTest=============0
