#!/bin/bash

. hcc.inc

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

cd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

mvn -Dhttps.protocols=TLSv1.2 clean
