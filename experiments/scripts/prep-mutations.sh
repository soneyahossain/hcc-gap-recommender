#!/bin/bash

PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

export JAVA_HOME=$JDK_18
export PATH=$JAVA_HOME/bin:$PATH

pushd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

echo "Prepping targets and tests"

declare -a step=(0 1 2 5 7 10 15 20 25 30 45 55 65 75 100)
#declare -a step=(0)
arraylength=${#step[@]}
for (( i=0; i<${arraylength}; i++ ));
do
  echo "Issuing cmd: mvn -PdirID -Dalt.dir=${step[$i]} clean test"
  mvn -f pom.pit.xml -PdirID -Dalt.dir=${step[$i]} clean test
done

popd
