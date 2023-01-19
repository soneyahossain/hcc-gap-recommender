
export JAVA_HOME=$JDK_18
export PATH=$JAVA_HOME/bin:$PATH

#export CLASSPATH=$CLASSPATH:$PROJECT_HOME/target/test-classes:$PROJECT_HOME/target/classes:$MAVEN_REPO/org/joda/joda-convert/1.9.2/joda-convert-1.9.2.jar:$MAVEN_REPO/junit/junit/4.11/junit-4.11.jar:$MAVEN_REPO/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$MAVEN_REPO/commons-io/commons-io/2.6/commons-io-2.6.jar:$MAVEN_REPO/com/fasterxml/jackson/core/jackson-databind/2.9.10/jackson-databind-2.9.10.jar:$MAVEN_REPO/com/fasterxml/jackson/core/jackson-core/2.9.10/jackson-core-2.9.10.jar
PROJECT_NAME=$1

if [ -z $1 ]; then
	echo "Please specify project"
	exit 1
fi

pushd $HCC_EXPERIMENTS/subjects/$PROJECT_NAME

mvn -X clean test -Dhttps.protocols=TLSv1.2 org.pitest:pitest-maven:mutationCoverage -DtimeoutConstant=3000
#mvn -X -Dhttps.protocols=TLSv1.2 org.pitest:pitest-maven:mutationCoverage -DtimeoutConstant=10000

popd
