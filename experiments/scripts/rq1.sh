subjects="commons-cli commons-codec-1.12 commons-csv commons-validator commons-lang-3.6 jaxen-1.2.0 joda-time gson jackson-dataformat-xml jfreechart jsoup-1.10.1 plexus-utils xstream"

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
echo "=== Show HCC statement (SCC) output for each subject"
ls $HCC_EXPERIMENTS/hcc_results/*/scc.csv

echo
date
echo "=== Show HCC object-branch (OBCC) output for each subject"
ls $HCC_EXPERIMENTS/hcc_results/*/obcc.csv

