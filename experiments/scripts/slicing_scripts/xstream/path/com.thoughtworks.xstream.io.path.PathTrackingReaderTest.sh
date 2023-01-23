#!/bin/bash

echo "computing slice for PathTrackingReaderTest"

mkdir -p $HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest

java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testDecoratesReaderAndTracksPath:37:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest1.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testDecoratesReaderAndTracksPath:40:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest2.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testDecoratesReaderAndTracksPath:43:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest3.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testDecoratesReaderAndTracksPath:46:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest4.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testDecoratesReaderAndTracksPath:50:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest5.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testDecoratesReaderAndTracksPath:54:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest6.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testDecoratesReaderAndTracksPath:57:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest7.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testPathsAreDecodedInTracker:69:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest8.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testPathsAreDecodedInTracker:72:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest9.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testPathsAreDecodedInTracker:73:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest10.txt
java -Xmx30g -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/xstream/path_traces/PathTrackingReaderTest.trace com.thoughtworks.xstream.io.path.PathTrackingReaderTest.testPathsAreDecodedInTracker:76:*>$HCC_EXPERIMENTS/slices/xstream/path_slices/PathTrackingReaderTest/PathTrackingReaderTest11.txt

#Total Asserts in com.thoughtworks.xstream.io.path/PathTrackingReaderTest=============11
#Total Tests in com.thoughtworks.xstream.io.path/PathTrackingReaderTest=============0