#!/bin/bash

# Exit on any errors
set -e

if [ -z "$JDK_17" ]; then
	echo Environment variable JDK_17 is undefined. Please set it to point at your Java JDK 1.7 installation
	exit 1
fi

if [ -z "$JDK_18" ]; then
	echo Environment variable JDK_18 is undefined. Please set it to point at your Java JDK 1.8 installation
	exit 1
fi

if [ -z "$HCC_HOME" ]; then
	echo Environment variable HCC_HOME is undefined. Did you forget to source the file: setenv ?
	echo You can do so by going into the experiments directory and typing: . setenv
	exit 1
fi

#
# HCC tools required jdk 1.8
#
export JAVA_HOME=$JDK_18
export PATH=$JAVA_HOME/bin:$PATH

cd $HCC_HOME/hcctools

# Build jars
hcctools="criteriagen obcc recommender scc"
for t in $hcctools
do
	pushd $t

	mvn package
	sh run.sh
	
	popd
done

# Copy jars 
set -x
cd $HCC_HOME/hcctools
cp scc/assembly/scc.jar $HCC_HOME/lib
cp obcc/assembly/obcc.jar $HCC_HOME/lib
cp recommender/assembly/recommender.jar $HCC_HOME/lib
cp recommender/assembly/evaluator.jar $HCC_HOME/lib
cp criteriagen/assembly/script-gen.jar $HCC_HOME/lib
cp testsuitegen/assembly/testsuite-gen.jar $HCC_HOME/lib