#!/bin/bash

#
# RQ2: To what extent do faults hide in the gap between host coverage and HCC?
# In this RQ, we manipulate a test suite by to vary the coverage gaps, and then perform mutation tests to calculate the R^2 value, correlation coefficient tau and slope.
# To regenerate th results for all 13 subjects will take several hours, to address this issue, we only consider single subject commons-lang-3.6 for the application level
# one can easily extend this to conduct experiments for all subjects
#
# step 1: compile the subject and generate the target directory
# generate different version of test suites using testsuite-gen.jar
# perform mutation testing on the generated test suites and plot them

# source env. variables
if [ -z $HCC_EXPERIMENTS ]; then
	cd ..
	. setenv
	cd -
fi

PROJECT_NAME=commons-lang-3.6

if [ -z $PROJECT_NAME ]; then
	echo "Please specify project"
	exit 1
fi

Red='\033[0;31m'     # Red
Green='\033[0;32m'   # Green
Blue='\033[0;34m'    # Blue
BBlue='\033[1;34m'   # Bold Blue
NC='\033[0m'         # No colors

header() {
	echo
	echo "=========================================================================================="
	echo -e "[RQ2] $PROJECT_NAME: ${Blue}$1${NC}"
	echo "=========================================================================================="
}

pushd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

OUTPUT_CLOVER_DIR=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/clover/
if [ ! -d $OUTPUT_CLOVER_DIR ]; then
	mkdir -p $OUTPUT_CLOVER_DIR
fi

mvn -Dhttps.protocols=TLSv1.2 clean clover2:setup test clover2:aggregate clover2:clover clover2:log
echo "Save clover.xml in $OUTPUT_CLOVER_DIR"
cp target/site/clover/clover.xml $OUTPUT_CLOVER_DIR

popd


cd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME
mvn test > $HCC_EXPERIMENTS/subjects/$PROJECT_NAME/$PROJECT_NAME.testrun

if grep -q "BUILD SUCCESS" $HCC_EXPERIMENTS/subjects/$PROJECT_NAME/$PROJECT_NAME.testrun; then
    header "commons-lang-3.6: BUILD success(< 1mn)"
    rm -rf $HCC_EXPERIMENTS/subjects/$PROJECT_NAME/$PROJECT_NAME.testrun
else
    echo "test execution failed"
    exit 1
fi

echo
echo "*****************************************************************"
echo -e "${BBlue}Reproducing RQ2 results ${NC}"
echo "*****************************************************************"
echo
echo "Verify ability to generate:"
echo "   - different version of test suites "
echo "   - running mutation testing on the generated suites"



if [ -d $HCC_EXPERIMENTS/subjects/$PROJECT_NAME/rq2_test_suites ]; then
		echo "Cleaning up test suite directory"
		rm -fr $HCC_EXPERIMENTS/subjects/$PROJECT_NAME/rq2_test_suites/*
fi

JAVA_HOME=$JDK_1_8
PATH=$JAVA_HOME/bin:$PATH

R_JAR=$HCC_HOME/lib/testsuite-gen.jar
PROJECT_HOME=$HCC_EXPERIMENTS/subjects/$PROJECT_NAME
SLICE_DIR=$HCC_EXPERIMENTS/slices/$PROJECT_NAME
CLOVER=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/clover/clover.xml
PREFIX=$HCC_EXPERIMENTS/specs/$PROJECT_NAME/prefix.txt
PROJECT_TEST_DIR=$PROJECT_HOME/src/test
TEST_DIR_PACKAGE=org.apache.commons.lang3
NEW_TEST_SUITE_DIR=$PROJECT_HOME


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

#now run mutation test on the newly generating test suites

echo === running mutation test on the newly generating test suites