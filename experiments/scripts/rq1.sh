if [ ! -z $1 ]; then
	subjects="$@"
	if [ "$subjects" == "all" ]; then
		subjects="commons-cli commons-codec-1.12 commons-csv commons-validator commons-lang-3.6 jaxen-1.2.0 joda-time gson jackson-dataformat-xml jfreechart jsoup-1.10.1 plexus-utils xstream"
	fi
else
	# default to 2 subjects o/w will take 1 hr
	subjects="commons-cli commons-csv"
	echo "Running RQ1 for subjects: $subjects"
fi

# make sure subjects exist
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

date
echo "Compute baseline statement and object-branch coverage for subjects: $subjects"
for s in $subjects
do
	./clean-build-clover.sh $s
	./clean-build-jacoco.sh $s
done

date
echo "Compute HCC statement and object-branch gaps"
for s in $subjects
do
	./compute_hcc_from_slices.sh $s	
done

echo
date
echo "=== Show SCC output for each subject"
for s in $subjects
do
	echo $s
	cat $HCC_EXPERIMENTS/hcc_results/$s/scc.csv
done

echo
date
echo "=== Show OBCC output for each subject"
for s in $subjects
do
	echo $s
	cat $HCC_EXPERIMENTS/hcc_results/$s/obcc.csv
done
