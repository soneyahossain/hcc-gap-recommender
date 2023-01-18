#!/bin/bash

jar="assembly/testsuite-gen.jar"
slice_dir=inputs/joda-time-slices
clover_cov=inputs/clover.xml
test_dir=inputs/joda-time/src/test
new_test_suite_dir=out/newtests
test_dir_package=org.joda.time
java -jar $jar $slice_dir $clover_cov $test_dir $new_test_suite_dir prefix.txt $test_dir_package
