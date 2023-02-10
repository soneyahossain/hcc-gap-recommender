#!/bin/bash

. hcc.inc


if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

PROJECT_NAME=$1

export PROJECT_HOME=$HCC_EXPERIMENTS/subjects/$PROJECT_NAME
export HCC_SLICES=$HCC_EXPERIMENTS/slices/$PROJECT_NAME

# verify project existence
if [ ! -d "$PROJECT_HOME" ]; then
	echo $HCC_EXPERIMENTS
	echo $PROJECT_NAME
	echo $PROJECT_HOME does not exist
	exit 1
fi

# compute hcc
hcc_output_directory=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME
if [ ! -d $hcc_output_directory ]; then
	mkdir -p $hcc_output_directory
fi

clover_xml=$hcc_output_directory/clover/clover.xml

$HCC_HOME/scripts/compute_hcc.stmt.sh $clover_xml $hcc_output_directory $HCC_EXPERIMENTS/specs/$PROJECT_NAME/prefix.txt
