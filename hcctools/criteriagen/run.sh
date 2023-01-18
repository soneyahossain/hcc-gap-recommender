#!/bin/bash

jar="assembly/script-gen.jar" #location of jar file
test_dir=commons-text/src/test #test directory
trace_dir=trace #trace file location
slice_dir=slices  #location where generated slice will be stored
slicer_dir=slicer.jar  #slicer jar location
scripts_dir=scripts #output directory where generated scripts will be stored

java -jar $jar $test_dir $trace_dir $slice_dir $slicer_dir $scripts_dir
