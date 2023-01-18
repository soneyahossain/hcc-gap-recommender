#!/bin/bash
#
# Automatically generate slicing scripts
#
# $HCC_LIBS is the HCC library directory
# $HCC_TRACES is the trace directory
# $HCC_SLICES is the slice directory
# $PROJECT_HOME is the top level of the SUT
# export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/csv

set -e

if [ -z $1 ]; then
	echo Please specify output slicing script directory
	exit 1
fi

# derived
export PROJECT_NAME=$( basename $PROJECT_HOME )
export cri_gen_jar=$HCC_LIBS/hcc_cri_gen.multi.jar
export slicer_jar=$HCC_LIBS/slicer.jar

# need to run with java 1.8 or above
export JAVA_HOME=$JDK_18
export PATH=$JAVA_HOME/bin:$PATH

# use same convention for layout as tracer
trace_dir=$HCC_TRACES
slice_dir=$HCC_SLICES

if [ ! -d $trace_dir ]; then
	echo "Error: undefined trace directory"
	exit 1
fi

if [ ! -d $slice_dir ]; then
	echo "Error: undefined slicing directory"
	exit 1
fi

# this is where all the generated slicing scripts go
gen_script_dir=$1
if [ ! -d $gen_script_dir ]; then
	mkdir -p $gen_script_dir
fi

echo "Auto-gen slicing scripts into $gen_script_dir"
java -version
echo "           jar: $cri_gen_jar"
echo "    slicer_jar: $slicer_jar"
echo "      test_dir: $PROJECT_TEST_DIR"
echo "     trace_dir: $trace_dir"
echo "     slice_dir: $slice_dir"
echo "gen_script_dir: $gen_script_dir"
java -jar $cri_gen_jar $PROJECT_TEST_DIR $trace_dir $slice_dir $slicer_jar $gen_script_dir

chmod +x $gen_script_dir/*/*.sh
