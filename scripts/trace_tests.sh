#!/bin/bash
#
# Generate traces by running specified tests
#
# JAVA_HOME is defined
# PATH contains $JAVA_HOME/bin
#
# Env. vars:
# $HCC_LIBS is the HCC library directory
# $HCC_TRACES is the output trace directory
# $PROJECT_HOME is the top level of the SUT
#

# these env vars should already be defined
export JAVA_HOME=$JDK_17
export PATH=$JAVA_HOME/bin:$PATH

TRACER_JAR=$HCC_LIBS/tracer.jar

TIMEOUT_SEC=600

traceSpec=$1
if [ -z $traceSpec ]; then
	echo "Must specify input trace file specification"
	exit 1
fi

export PROJECT_NAME=$( basename $PROJECT_HOME )

echo "Project name: $PROJECT_NAME"

# @todo: rethink how we handle project-specific jars
export CLASSPATH=$CLASSPATH:$PROJECT_HOME/target/test-classes:$PROJECT_HOME/target/classes:$MAVEN_REPO/org/joda/joda-convert/1.9.2/joda-convert-1.9.2.jar:$MAVEN_REPO/junit/junit/4.11/junit-4.11.jar:$MAVEN_REPO/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$MAVEN_REPO/commons-io/commons-io/2.6/commons-io-2.6.jar:$MAVEN_REPO/com/fasterxml/jackson/core/jackson-databind/2.9.10/jackson-databind-2.9.10.jar:$MAVEN_REPO/com/fasterxml/jackson/core/jackson-core/2.9.10/jackson-core-2.9.10.jar

echo "Debug CLASSPATH: $CLASSPATH"

# parse trace specification file
toTrace=$( grep -v "^#" $traceSpec )

echo "To trace:"
echo "$toTrace"
echo

# collect traces
for t in $toTrace
do
	echo "Tracing $t"
	test_class_name=$( basename $t .java )

	fq_test_class=$( dirname $t )/$test_class_name
	fq_test_class=$( echo $fq_test_class | sed 's/\//./g' )

	package_name=$( basename $( dirname $t ) )
	echo "class: $test_class_name fq_test_class: $fq_test_class path: $t package: $package_name"

	# re-use layout expected by the slicing auto-gen script
	trace_dir=$HCC_TRACES/${package_name}_traces
	if [ ! -d $trace_dir ]; then
		mkdir $trace_dir
	fi

	echo "Output of trace will be in $trace_dir"

	# simple grep to figure out whether there's a main method in the test driver class
	# if so use it, otherwise use runner JUnitCore when main() 
	echo "Attempting to detect main() in ${PROJECT_TEST_DIR}/${t}"
	grep main ${PROJECT_TEST_DIR}/${t} | grep void >/dev/null 2>&1
	if [ $? -eq 0 ]; then
		# yup has a main
		echo "Auto-detected presence of main"
		timeout $TIMEOUT_SEC java -cp "$CLASSPATH:$PROJECT_HOME/target/dependency/*" -Xmx7g -javaagent:$TRACER_JAR=tracefile:$trace_dir/$test_class_name.trace $fq_test_class
	else
		# no main, use the JUnitCore runner
		echo "No main detected: use JUnitCore runner"
#		timeout $TIMEOUT_SEC java -cp "$CLASSPATH:$PROJECT_HOME/target/dependency/*:$PROJECT_HOME/lib/compile/*" org.junit.runner.JUnitCore $fq_test_class

		# Heuristics to pick up dependencies:
		#    $PROJECT_HOME/target/dependency/* for mvn-based projects
		timeout $TIMEOUT_SEC java -noverify -cp "$CLASSPATH:$PROJECT_HOME/target/dependency/*:$PROJECT_HOME/lib/compile/*" -Xmx7g -javaagent:$TRACER_JAR=tracefile:$trace_dir/$test_class_name.trace org.junit.runner.JUnitCore $fq_test_class
	fi
done

