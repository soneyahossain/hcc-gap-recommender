#!/bin/bash

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi


mutation_result_dir=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq2
mkdir -p $mutation_result_dir

if [ ! -d $mutation_result_dir ]; then
	echo Error setting up $mutation_result_dir
	exit 1
fi

echo Copying mutation results to $mutation_result_dir

cp $HCC_EXPERIMENTS/subjects/$PROJECT_NAME/rq2_test_suites/*.txt $mutation_result_dir

ls $mutation_result_dir
