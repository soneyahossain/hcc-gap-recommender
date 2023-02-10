#!/bin/bash
#
# End-to-end workflow for computing HCC for a given project
#

. hcc.inc

set -e

 
while [ "$#" -gt 0 ]; do
    case "$1" in
        -c) shift 
		USE_CACHE=1 
		;;
        -*) echo "unknown option: $1" >&2; exit 1;;
	*) 
		PROJECT_NAME=$1
		shift
		;;
    esac
done

if [ -z $PROJECT_NAME ]; then
	echo "Please specify project"
	exit 1
fi

header() {
	echo
	echo "==================================================================="
	echo "$PROJECT_NAME: $1"
	echo "==================================================================="
}

# overview msg
if [ ! -z "$USE_CACHE" ]; then
	cache_msg="[reuse trace and slice data (if present)]"
fi
header "HCC End-to-end workflow for $PROJECT_NAME $cache_msg"

# clover stmt coverage
header "Compute baseline coverage information with clover"
time ./clean-build-clover.sh $PROJECT_NAME > $PROJECT_NAME.clover 2>&1

# jacoco object branch coverage
header "Compute baseline coverage information with jacoco"
time ./clean-build-jacoco.sh $PROJECT_NAME > $PROJECT_NAME.jacoco 2>&1

# generate traces
header "Generate trace information for unit tests"
if [ -z "$USE_CACHE" ]; then
	time ./trace.sh $PROJECT_NAME > $PROJECT_NAME.trace 2>&1
else
	if [ ! -d "$HCC_EXPERIMENTS/traces/$PROJECT_NAME" ]; then
		time ./trace.sh $PROJECT_NAME > $PROJECT_NAME.trace 2>&1
	else
		echo "> Reusing previously computed traces"
	fi
fi

# generate slicing scripts as needed
header "Auto-generate slicing scripts (if needed)"
if [ ! -d "slicing_scripts/$PROJECT_NAME" ]; then
	time ./autogen-slicer.sh $PROJECT_NAME > $PROJECT_NAME.slicer 2>&1
fi

# generate slices from traces
header "Slice traces"
if [ -z "$USE_CACHE" ]; then
	time ./slice.sh $PROJECT_NAME > $PROJECT_NAME.slice 2>&1
else
	if [ ! -d "$HCC_EXPERIMENTS/slices/$PROJECT_NAME" ]; then
		time ./slice.sh $PROJECT_NAME > $PROJECT_NAME.slice 2>&1
	else
		echo "> Reusing previously computed slices"
	fi
fi

# compute statement checked coverage
header "Compute SCC metric"
time ./compute_hcc.stmt.sh $PROJECT_NAME > $PROJECT_NAME.hcc 2>&1

# compute object branch checked coverage
header "Compute OBCC metric"
time ./compute_hcc.ob.sh $PROJECT_NAME > $PROJECT_NAME.hcc.ob 2>&1

# run evaluator of recommendations
header "Run evaluator"
time ./evaluator.sh $PROJECT_NAME > $PROJECT_NAME.evaluator 2>&1
