set -e

if [ ! -z $1 ]; then
	subjects="$@"
else
	subjects="commons-cli commons-codec-1.12 commons-csv commons-validator commons-lang-3.6 jaxen-1.2.0 joda-time gson jackson-dataformat-xml jfreechart jsoup-1.10.1 plexus-utils xstream"
fi

# verify subjects exist
for s in $subjects
do
	if [ ! -d "$HCC_EXPERIMENTS/subjects/$s" ]; then
		echo "subject program $s cannot be found"
		exit 1
	fi
done

env | grep HCC_HOME
if [ ! $? -eq 0 ]; then
	echo Error: environment variable HCC_HOME is not set
	echo Please look at installation instruction to set HCC_HOME and other needed environment variables
	exit 1
fi

# make sure subjects exist
date
echo "Run recommendation evaluator tool"
for s in $subjects
do
	./evaluator.sh $s
done

echo
echo "=== Show evalution of recommendations"
cat $HCC_EXPERIMENTS/hcc_results/*/evaluator/result/summary.csv
