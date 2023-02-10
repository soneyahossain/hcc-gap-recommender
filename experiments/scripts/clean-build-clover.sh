#!/bin/bash
. hcc.inc

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
if [ "$PROJECT_NAME" = "beepbeep-3" ]; then

	mvn -Dhttps.protocols=TLSv1.2 clean 

	# copy the test input files into the right place
	mkdir -p target/test-classes/ca/uqac/lif/cep/io
	mkdir -p target/test-classes/ca/uqac/lif/cep/util
	cp -r CoreTest/src/ca/uqac/lif/cep/io/resource  target/test-classes/ca/uqac/lif/cep/io/
	cp -r CoreTest/src/ca/uqac/lif/cep/util/resource  target/test-classes/ca/uqac/lif/cep/util/

	# invoke clover (but without the clean step)
	mvn -Dhttps.protocols=TLSv1.2 clover2:setup test clover2:aggregate clover2:clover clover2:log
else
	# invoke clover
	mvn -Dhttps.protocols=TLSv1.2 clean clover2:setup test clover2:aggregate clover2:clover clover2:log
fi

echo "Save clover.xml in $OUTPUT_CLOVER_DIR"
cp target/site/clover/clover.xml $OUTPUT_CLOVER_DIR

popd
