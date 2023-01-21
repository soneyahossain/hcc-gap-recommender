#!/bin/bash
#
# End-to-end workflow for computing HCC for a given project
#

set -e

PROJECT_NAME=$1

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

header "Compute baseline coverage information with clover"
time ./clean-build-clover.sh $PROJECT_NAME > $PROJECT_NAME.clover 2>&1

header "Compute baseline coverage information with jacoco"
time ./clean-build-jacoco.sh $PROJECT_NAME > $PROJECT_NAME.jacoco 2>&1

header "Generate trace information for unit tests"
time ./trace.sh $PROJECT_NAME > $PROJECT_NAME.trace 2>&1

header "Auto-generate slicing scripts (if needed)"
if [ ! -d "slicing_scripts/$PROJECT_NAME" ]; then
	time ./autogen-slicer.sh $PROJECT_NAME > $PROJECT_NAME.slicer 2>&1
fi

header "Slice traces"
time ./slice.sh $PROJECT_NAME > $PROJECT_NAME.slice 2>&1

header "Compute SCC metric"
time ./compute_hcc.stmt.sh $PROJECT_NAME > $PROJECT_NAME.hcc 2>&1

header "Compute OBCC metric"
time ./compute_hcc.ob.sh $PROJECT_NAME > $PROJECT_NAME.hcc.ob 2>&1

#header "Generate recommendations to close HCC gap"
#time ./recommend.sh $PROJECT_NAME > $PROJECT_NAME.recommender 2>&1

header "Run evaluator"
time ./evaluator.sh $PROJECT_NAME > $PROJECT_NAME.evaluator 2>&1
