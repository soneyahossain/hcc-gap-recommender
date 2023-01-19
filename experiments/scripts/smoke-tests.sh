#!/bin/bash
#
# Smoke tests to make sure everything is working correctly
#
# The smoke tests run an end-to-end workflow on a very limited
# set of tests for the project: commons-cli
#
# The full suite of tests can easily take up to 2hrs. This limited smoke
# test should take about 10 mns.
#

# source env. variables
if [ -z $HCC_EXPERIMENTS ]; then
	cd ..
	. setenv
	cd -
fi

PROJECT_NAME=commons-cli-limited

Red='\033[0;31m'     # Red
Green='\033[0;32m'   # Green
Blue='\033[0;34m'    # Blue
BBlue='\033[1;34m'   # Bold Blue
NC='\033[0m'         # No colors

echo
echo "*****************************************************************"
echo -e "${BBlue}Smoke tests for end-to-end checked coverage computation workflow${NC}"
echo "*****************************************************************"
echo
echo "Verify ability to generate:"
echo "   - statement coverage via clover"
echo "   - object branch coverage via jacoco"
echo "   - traces"
echo "   - slices"
echo "   - checked coverage (statement)"
echo "   - checked coverage (object branch)"
echo "   - recommender/evaluator tool output"
echo

header() {
	echo
	echo "=========================================================================================="
	echo -e "[SmokeTest] $PROJECT_NAME: ${Blue}$1${NC}"
	echo "=========================================================================================="
}

cleanup() {
	header "Cleaning up any old experimental artifacts"
	if [ -d $HCC_EXPERIMENTS/traces/$PROJECT_NAME ]; then
		echo "Cleaning up traces directory"
		rm -fr $HCC_EXPERIMENTS/traces/$PROJECT_NAME/*
	fi
	if [ -d $HCC_EXPERIMENTS/slices/$PROJECT_NAME ]; then
		echo "Cleaning up slices directory"
		rm -fr $HCC_EXPERIMENTS/slices/$PROJECT_NAME/*
	fi
	if [ -d $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME ]; then
		echo "Cleaning up results directory"
		rm -fr $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/*
	fi
}

report() {
	success=$1
	msg=$2
	if [ $1 -eq 0 ]; then
		echo -e "$msg: ${Green}OK${NC}"
	else
		echo -e "$msg: ${Red}FAIL${NC}"
	fi
}

cleanup

# Compute baseline statement coverage with Clover
header "Compute baseline coverage information with clover (< 1mn)"
./clean-build-clover.sh $PROJECT_NAME > $PROJECT_NAME.clover 2>&1
grep "BUILD SUCCESS" $PROJECT_NAME.clover >/dev/null
report $? "Clover baseline coverage"
grep -i -A10 'coverage overview' $PROJECT_NAME.clover

# Compute baseline object-branch coverage with Jacoco
header "Compute baseline coverage information with jacoco (< 1mn)"
./clean-build-jacoco.sh $PROJECT_NAME > $PROJECT_NAME.jacoco 2>&1
grep "BUILD SUCCESS" $PROJECT_NAME.jacoco >/dev/null
report $? "Jacoco baseline coverage"
grep -i -B6 'jacoco.xml' $PROJECT_NAME.jacoco

# Generate trace information from running unit tests
header "Generate trace information for unit tests (< 2mns)"
./trace.sh $PROJECT_NAME > $PROJECT_NAME.trace 2>&1
if [ -f $HCC_EXPERIMENTS/traces/$PROJECT_NAME/cli_traces/CommandLineTest.trace ]; then
	report 0 "Trace file generated"
else
	report 1 "Trace file generated"
fi
ls -lt $HCC_EXPERIMENTS/traces/$PROJECT_NAME/cli_traces/

# Slice traces
header "Slice traces (~10mns)"
./slice.sh $PROJECT_NAME > $PROJECT_NAME.slice 2>&1
if [ -f "$HCC_EXPERIMENTS/slices/$PROJECT_NAME/cli_slices/CommandLineTest/CommandLineTest1.txt" ]; then
	report 0 "Slice file(s) generated"
else
	report 1 "Slice file(s) generated"
fi
ls -ltR $HCC_EXPERIMENTS/slices/$PROJECT_NAME/cli_slices/

# Compute Checked Coverage (statement)
header "Compute checked coverage statement metric"
./compute_hcc.stmt.sh $PROJECT_NAME > $PROJECT_NAME.hcc 2>&1
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc.csv
report $? "Checked Coverage (statement) computed"

# Compute Checked Coverage (object-branch)
header "Compute checked coverage object branch metric"
./compute_hcc.ob.sh $PROJECT_NAME > $PROJECT_NAME.hcc.ob 2>&1
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/obcc.csv
report $? "Checked Coverage (object-branch) computed"

# Run recommender/evaluator tool
header "Run recommender/evaluator"
./evaluator.sh $PROJECT_NAME > $PROJECT_NAME.evaluator 2>&1
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/evaluation/result/summary.csv
report $? "Recommender/evalutor ran"
