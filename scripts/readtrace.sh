if [ -z $1 ]; then
	echo Please specify trace file
	exit 1
fi

java -jar $HCC_LIBS/traceReader.jar $1
