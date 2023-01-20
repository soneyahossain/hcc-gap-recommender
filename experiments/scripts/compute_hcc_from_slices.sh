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

header "Compute HCC_s metric"
./compute_hcc.stmt.sh $PROJECT_NAME > $PROJECT_NAME.hcc 2>&1
echo HCC statement coverage results:
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc.csv


header "Compute HCC_ob metric"
./compute_hcc.ob.sh $PROJECT_NAME > $PROJECT_NAME.hcc.ob 2>&1
echo HCC object branch coverage results:
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/obcc.csv

header "Run evaluator"
./evaluator.sh $PROJECT_NAME > $PROJECT_NAME.evaluator 2>&1
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/evaluator/result/summary.csv
