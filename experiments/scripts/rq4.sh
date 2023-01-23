# source env. variables
if [ -z $HCC_EXPERIMENTS ]; then
	cd ..
	. setenv
	cd -
fi


PROJECT_NAME="joda-time"


if [ ! -d "$HCC_EXPERIMENTS/subjects/$PROJECT_NAME" ]; then
  echo "subject program $PROJECT_NAME cannot be found"
  exit 1
fi


env | grep HCC_HOME
if [ ! $? -eq 0 ]; then
	echo Error: environment variable HCC_HOME is not set
	echo Please look at installation instruction to set HCC_HOME and other needed environment variables
	exit 1
fi

# compute hcc
hcc_output_directory=$HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME
if [ ! -d $hcc_output_directory ]; then
	mkdir -p $hcc_output_directory
fi

date
echo "Compute baseline statement for subject: $PROJECT_NAME"
./clean-build-clover.sh $PROJECT_NAME


echo "Compute SCC for original joda-time chronology package"

export PROJECT_HOME=$HCC_EXPERIMENTS/subjects/$PROJECT_NAME
export HCC_SLICES=$HCC_EXPERIMENTS/slices/joda-time-rq4/chrono_slices

# verify project existence
if [ ! -d "$PROJECT_HOME" ]; then
	echo $HCC_EXPERIMENTS
	echo $PROJECT_NAME
	echo $PROJECT_HOME does not exist
	exit 1
fi


clover_xml=$hcc_output_directory/clover/clover.xml

$HCC_HOME/scripts/compute_hcc.stmt.sh $clover_xml $hcc_output_directory $HCC_EXPERIMENTS/specs/$PROJECT_NAME/prefix.txt

if [ ! -d $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data ]; then
	mkdir -p $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data
fi

if [ ! -d $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data ]; then
	mkdir -p $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data
fi

mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/sc_per_class.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/sc_per_method.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc_per_assertion.txt $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc_per_class.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc_per_method.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_original_data/



echo "Compute SCC for enriched joda-time chronology package"
export HCC_SLICES=$HCC_EXPERIMENTS/slices/joda-time-rq4
$HCC_HOME/scripts/compute_hcc.stmt.sh $clover_xml $hcc_output_directory $HCC_EXPERIMENTS/specs/$PROJECT_NAME/prefix.txt
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/sc_per_class.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/sc_per_method.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc_per_assertion.txt $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc_per_class.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data/
mv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/scc_per_method.csv $HCC_EXPERIMENTS/hcc_results/$PROJECT_NAME/rq4_enriched_data/
