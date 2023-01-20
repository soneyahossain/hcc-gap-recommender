#!/bin/bash

export JAVA_HOME=$JDK_1_8
export PATH=$JAVA_HOME/bin:$PATH

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

pushd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME
if [ ! $? -eq 0 ]; then
	echo "Error: rq2_test_suites directory does not exist"
	exit 1
fi

echo "Running mutations from $PWD..."

declare -a step=(0 1 2 5 7 10 15 20 25 30 45 55 65 75 100)
arraylength=${#step[@]}
for (( i=0; i<${arraylength}; i++ ));
do
	log=rq2_test_suites/suite_${step[$i]}.txt
	echo "Mutating configuration ${step[i]} log: $log"
	mvn -f pom.pit.xml -PdirID -Dalt.dir=${step[$i]} org.pitest:pitest-maven:mutationCoverage -DtimeoutConstant=800 > $log
	grep -E 'mutations Killed' $log >> rq2_test_suites/mutation_result.txt
done

popd

./copy-mutation-results.sh $PROJECT_NAME
