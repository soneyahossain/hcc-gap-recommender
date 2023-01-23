#!/bin/bash

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

pushd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

OUTPUT_JACOCO_DIR=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/jacoco/
if [ ! -d $OUTPUT_JACOCO_DIR ]; then
	mkdir -p $OUTPUT_JACOCO_DIR
fi

	mvn -Dhttps.protocols=TLSv1.2 clean test jacoco:report
	echo "Save jacoco.xml in $OUTPUT_JACOCO_DIR"

	if [ "$PROJECT_NAME" == "gson" ]; then
		cp gson/target/site/jacoco/jacoco.xml $OUTPUT_JACOCO_DIR
	else
		cp target/site/jacoco/jacoco.xml $OUTPUT_JACOCO_DIR
	fi
popd
