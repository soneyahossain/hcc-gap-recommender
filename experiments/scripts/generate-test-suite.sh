#!/bin/bash

JAVA_HOME=$JDK_18
PATH=$JAVA_HOME/bin:$PATH

R_JAR=$HCC_HOME/lib/testsuite-gen.jar

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

PROJECT_HOME=$HCC_EXPERIMENTS/subjects/$PROJECT_NAME
SLICE_DIR=$HCC_EXPERIMENTS/slices/$PROJECT_NAME
CLOVER=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/clover/clover.xml
PREFIX=$HCC_EXPERIMENTS/specs/$PROJECT_NAME/prefix.txt

if [ ! -f $CLOVER ]; then
	echo Clover file not found at $CLOVER
	exit 1
fi

if [ ! -f $PREFIX ]; then
	echo Prefix file not found at $PREFIX
	exit 1
fi

if [ ! -d $SLICE_DIR ]; then
	echo Slice dir not found at $SLICE_DIR
	exit 1
fi

case $PROJECT_NAME in
	fse-joda-time)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.joda.time
		;;
	fse-commons-lang-3.6)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.apache.commons.lang3
		;;
	fse-jaxen-1.2.0)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/java/test
		TEST_DIR_PACKAGE=org.jaxen.test
		;;
	gson)
		PROJECT_TEST_DIR=$PROJECT_HOME/gson/src/test
		TEST_DIR_PACKAGE=com.google.gson
		;;
	commons-cli)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.apache.commons.cli
		;;
	commons-cli-limited)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.apache.commons.cli
		;;
	commons-csv)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.apache.commons.csv
		;;
	jfreechart)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.jfree.chart
		;;
	commons-codec-1.12)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.apache.commons.codec
		;;
	commons-validator)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.apache.commons.validator
		;;
	jsoup-1.10.1)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.jsoup
		;;
	plexus-utils)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=org.codehaus.plexus.util
		;;
	htmlunit-neko)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=net.sourceforge.htmlunit.cyberneko
		;;
	args4j)
		PROJECT_TEST_DIR=$PROJECT_HOME/test
		TEST_DIR_PACKAGE=org.kohsuke.args4j
		;;
	jackson-dataformat-xml)
		PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		TEST_DIR_PACKAGE=com.fasterxml.jackson.dataformat.xml
		;;
	*)
		echo target $PROJECT_NAME not yet supported
		exit 1
		;;
esac
	
NEW_TEST_SUITE_DIR=$PROJECT_HOME

#slice_dir=fse-joda-time/slices
#clover=fse-joda-time/hcc_results/fse-joda-time/clover/clover.xml
#test_dir=fse-joda-time/subjects/fse-joda-time/src/test
#new_test_suite_dir=newtestdir
#test_dir_package=org.joda.time
#java -jar $r_jar $slice_dir $clover $test_dir "$new_test_suite_dir" prefix.txt $test_dir_package

pushd $PROJECT_HOME

echo === Test suite generator
echo R_JAR: $R_JAR
echo SLICE_DIR: $SLICE_DIR
echo CLOVER: $CLOVER
echo PROJECT_TEST_DIR: $PROJECT_TEST_DIR
echo NEW_TEST_SUITE_DIR: $NEW_TEST_SUITE_DIR
echo PREFIX: $PREFIX
echo TEST_DIR_PACKAGE: $TEST_DIR_PACKAGE

echo "java -jar $R_JAR $SLICE_DIR $CLOVER $PROJECT_TEST_DIR $NEW_TEST_SUITE_DIR $PREFIX $TEST_DIR_PACKAGE"
java -jar $R_JAR $SLICE_DIR $CLOVER $PROJECT_TEST_DIR "$NEW_TEST_SUITE_DIR" $PREFIX $TEST_DIR_PACKAGE
