#!/bin/bash

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

cd $HCC_EXPERIMENTS/scripts/slicing_scripts/$PROJECT_NAME

grep -R Assert * | sed 's/=============/#/g' | sort | uniq | cut -d'#' -f3 | awk '{s+=$1} END {printf "%.0f\n", s}' 
