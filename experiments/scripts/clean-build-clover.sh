#!/bin/bash

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

pushd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

OUTPUT_CLOVER_DIR=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/clover/
if [ ! -d $OUTPUT_CLOVER_DIR ]; then
	mkdir -p $OUTPUT_CLOVER_DIR
fi

# nb: ant is not supported
mvn -Dhttps.protocols=TLSv1.2 clean clover2:setup test clover2:aggregate clover2:clover clover2:log
echo "Save clover.xml in $OUTPUT_CLOVER_DIR"
cp target/site/clover/clover.xml $OUTPUT_CLOVER_DIR

popd
