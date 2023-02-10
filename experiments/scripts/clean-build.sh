#!/bin/bash

. hcc.inc


PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

cd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

if [ -f pom.xml ]; then
	mvn -Dhttps.protocols=TLSv1.2 clean test 
else
	if [ -f build.xml ]; then
		ant clean test
	else
		echo "Cannot find pom.xml or build.xml"
		exit 1
	fi
fi

