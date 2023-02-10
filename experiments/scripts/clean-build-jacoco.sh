#!/bin/bash

. hcc.inc

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

pushd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

# setup output directory
OUTPUT_JACOCO_DIR=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/jacoco/
OUTPUT_JACOCO_XML=$OUTPUT_JACOCO_DIR/jacoco.xml
if [ ! -d $OUTPUT_JACOCO_DIR ]; then
	mkdir -p $OUTPUT_JACOCO_DIR
fi

if [ -f pom.xml ]; then
	mvn -Dhttps.protocols=TLSv1.2 clean test jacoco:report
	echo "Save jacoco.xml to $OUTPUT_JACOCO_XML"

	if [ "$PROJECT_NAME" == "gson" ]; then
		cp gson/target/site/jacoco/jacoco.xml $OUTPUT_JACOCO_XML
	else
		cp target/site/jacoco/jacoco.xml $OUTPUT_JACOCO_XML
	fi
else
	# ant-based projects?
	ant clean test
	if [ "$PROJECT_NAME" == "beepbeep-3" ]; then
		cp tests/junit/report.xml $OUTPUT_JACOCO_XML
	else
		echo "Unsupported project -- need rule to copy jacoco.xml to $OUTPUT_JACOCO_XML"
		exit 1
	fi
fi

popd
