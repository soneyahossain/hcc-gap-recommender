#!/bin/bash
#
# Automatically generate slicing scripts for each test class
#

. hcc.inc

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

PROJECT_NAME=$1

export PROJECT_HOME=$HCC_EXPERIMENTS/subjects/$PROJECT_NAME

# lookup directory with junit tests on a per-project basis
case $PROJECT_NAME in
	commons-csv)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/csv
		;;
	commons-cli)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/cli
		;;
	commons-cli-limited)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/cli
		;;
	commons-math)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/math3
		;;
	joda-time)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/joda/time
		;;
	jaxen-1.2.0)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/java/test/org/jaxen/test
		;;
	commons-lang-3.6)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/lang3
		;;
	jackson-core-2.9.10)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/com/fasterxml/jackson/core
		;;
	jackson-dataformat-xml-2.9.10)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/com/fasterxml/jackson/dataformat/xml
		;;
	jsoup-1.10.1)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/jsoup
		;;
	commons-jxpath)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/jxpath
		;;
	commons-codec-1.12)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/codec
		;;
	commons-cli-1.3)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/cli
		;;
	commons-compress)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/compress
		;;
	jfreechart)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/jfree/chart
		;;
	gson)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/com/google/gson
		;;
	xstream)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/com/thoughtworks
		;;
	beepbeep-3)
		export PROJECT_TEST_DIR=$PROJECT_HOME/CoreTest/src/ca/uqac/lif/cep
		;;
	*)
		echo "Unsupported project: $PROJECT_NAME"
		exit 1
		;;
esac

export HCC_TRACES=$HCC_EXPERIMENTS/traces/$PROJECT_NAME
export HCC_SLICES=$HCC_EXPERIMENTS/slices/$PROJECT_NAME

# verify project existence
if [ ! -d $PROJECT_HOME ]; then
	echo $PROJECT_HOME does not exist
	exit 1
fi

# make sure trace directory exists
if [ ! -d $HCC_TRACES ]; then
	mkdir -p $HCC_TRACES
fi

# make sure slice directory exists
if [ ! -d $HCC_SLICES ]; then
	mkdir -p $HCC_SLICES
fi

# generate slicing scripts
$HCC_HOME/scripts/generate_slicing_scripts.sh $HCC_EXPERIMENTS/scripts/slicing_scripts/$PROJECT_NAME
