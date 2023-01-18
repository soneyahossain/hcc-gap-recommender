#!/bin/bash
#
# Automatically generate slicing scripts for each test class
#

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

PROJECT_NAME=$1

export PROJECT_HOME=$HCC_EXPERIMENTS/subjects/$PROJECT_NAME

# lookup directory with junit tests on a per-project basis
case $PROJECT_NAME in
	orekit-6.1)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/orekit
		;;
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
	fse-joda-time)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/joda/time
		;;
	fse-jaxen-1.2.0)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/java/test/org/jaxen/test
		;;
	fse-commons-lang-3.6)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/lang3
		;;
	jackson-core-2.9.10)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/com/fasterxml/jackson/core
		;;
	jackson-dataformat-xml)
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
		export PROJECT_TEST_DIR=$PROJECT_HOME/gson/src/test/java/com/google/gson
		;;
	xstream*)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/com/thoughtworks
		;;
	plexus-utils*)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/codehaus/plexus/util
		;;
	commons-text)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/text
		;;
	commons-validator*)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/commons/validator
		;;
	log4j-2.1-core)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java/org/apache/logging/log4j
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
echo Slice using the single assertion per slice method
$HCC_HOME/scripts/generate_slicing_scripts.singles.sh $HCC_EXPERIMENTS/scripts/slicing_scripts/$PROJECT_NAME
