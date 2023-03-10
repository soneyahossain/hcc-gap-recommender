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

# cleanup clover
if [ ! -z "$MAVEN_REPO" ]; then
	rm -fr $MAVEN_REPO/com/atlassian
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
echo "   - object branch coverage via JaCoCo"
echo "   - traces via JavaSlicer"
echo "   - slices via JavaSlicer"
echo "   - statement checked coverage (SCC)"
echo "   - object branch checked coverage (OBCC)"
echo "   - recommendations via recommender"

header() {
	echo
	echo -e "= ${Blue}$1${NC} = "
}

cleanup() {
	if [ -d $HCC_EXPERIMENTS/traces/$PROJECT_NAME ]; then
		rm -fr $HCC_EXPERIMENTS/traces/$PROJECT_NAME/*
	fi
	if [ -d $HCC_EXPERIMENTS/slices/$PROJECT_NAME ]; then
		rm -fr $HCC_EXPERIMENTS/slices/$PROJECT_NAME/*
	fi
	if [ -d $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME ]; then
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
basetmp=/tmp/$USER
header "Compute baseline statement coverage (1-2mns)"
./clean-build-clover.sh $PROJECT_NAME > $basetmp.$PROJECT_NAME.clover 2>&1
grep "BUILD SUCCESS" $basetmp.$PROJECT_NAME.clover >/dev/null
report $? "SCC output file created"
grep -i -A10 'coverage overview' $basetmp.$PROJECT_NAME.clover | grep Statement
if [ $? -eq 0 ]; then
	rm $basetmp.$PROJECT_NAME.clover
fi

# Compute baseline object-branch coverage with Jacoco
header "Compute baseline object branch coverage (1-2mns)"
./clean-build-jacoco.sh $PROJECT_NAME 2>&1 | grep "BUILD SUCCESS" >/dev/null
report $? "OBCC output file created"

# Generate trace information from running unit tests
header "Generate traces (~2mns)"
./trace.sh $PROJECT_NAME >/dev/null 2>&1
ls $HCC_EXPERIMENTS/traces/$PROJECT_NAME/cli_traces/CommandLineTest.trace >/dev/null
report $? "Trace file generated"

# Slice traces
header "Generate slices (~10mns)"
./slice.sh $PROJECT_NAME >/dev/null 2>&1
if [ -f "$HCC_EXPERIMENTS/slices/$PROJECT_NAME/cli_slices/CommandLineTest/CommandLineTest1.txt" ]; then
	report 0 "Slice file(s) generated"
else
	report 1 "Slice file(s) generated"
fi

# Compute SCC
header "Compute SCC"
./compute_hcc.stmt.sh $PROJECT_NAME >/dev/null 2>&1
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc.csv
report $? "SCC computed"

# Compute OBCC
header "Compute OBCC"
./compute_hcc.ob.sh $PROJECT_NAME >/dev/null  2>&1
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/obcc.csv
report $? "OBCC computed"

# Run evaluator tool
header "Run recommendation evaluator"
./evaluator.sh $PROJECT_NAME >/dev/null 2>&1
cat $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/evaluator/result/summary.csv
report $? "Evaluator ran successfully"
