#!/bin/bash
#
# Driver to trace tests
#
# We want to be in the top-level directory of a project
# when tracing as it is a common testing pattern
# to use relative paths to find various files

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

PROJECT_NAME=$1

export PROJECT_HOME=$HCC_EXPERIMENTS/subjects/$PROJECT_NAME
export HCC_TRACES=$HCC_EXPERIMENTS/traces/$PROJECT_NAME

# verify project existence
if [ ! -d $PROJECT_HOME ]; then
	echo $PROJECT_HOME does not exist
	exit 1
fi

# clean before tracing
$HCC_EXPERIMENTS/scripts/clean-build.sh $PROJECT_NAME

# make sure output trace directory exists
if [ ! -d $HCC_TRACES ]; then
	mkdir -p $HCC_TRACES
fi

# trace tests based on spec
pushd $PROJECT_HOME
echo "Switch to top-level directory of ${PROJECT_NAME}: ${PWD}"

# make sure dependencies are there

if [ ! -f build.xml ]; then
	echo "Setup dependencies for mvn-based projects"
	mvn -Dhttps.protocols=TLSv1.2 dependency:copy-dependencies
	echo "Dependent jars - add to classpath"
	ls target/dependency
else
	echo "WARNING: FIXME: ant-based project: not supported"
fi

case $PROJECT_NAME in
	xstream)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		;;
	barbecue)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test
		export CLASSPATH="$PROJECT_HOME/build/classes:$PROJECT_HOME/build/testclasses:$CLASSPATH"
		;;
	fse-jaxen-1.2.0)
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/java/test
		export CLASSPATH="$PROJECT_HOME/build/classes:$PROJECT_HOME/build/testclasses:$CLASSPATH"
		;;
	gson)
		export PROJECT_TEST_DIR=$PROJECT_HOME/gson/src/test/java
		export CLASSPATH="$PROJECT_HOME/gson/target/classes:$PROJECT_HOME/gson/target/test-classes:$CLASSPATH"
		;;
	*)
		# most projects seem to have this layout
		export PROJECT_TEST_DIR=$PROJECT_HOME/src/test/java
		;;
esac

echo Debugging: print CLASSPATH environment variable
env | grep CLASSPATH

$HCC_HOME/scripts/trace_tests.sh $HCC_EXPERIMENTS/specs/$PROJECT_NAME/trace.spec
popd
