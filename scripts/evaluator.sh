#!/bin/bash
#
# Evaluate recommender suggestions
#

set -e

export JAVA_HOME=$JDK_1_8
export PATH=$JAVA_HOME/bin:$PATH

e_jar="$HCC_LIBS/reco-evaluator.jar"

per_assert_cov=$1
source_target=$2
output_evaluation_dir=$3
prefix_file=$4

if [ ! -d $outdir ]; then
	mkdir $outdir
fi

echo "=== Recommendater Evaluator"
echo "Per assert coverage file: $per_assert_cov"
echo "Project target classes: $source_target"
echo "Evaluator output directory: $output_evaluation_dir"
echo "Prefix file: $prefix_file"

java -jar $e_jar $per_assert_cov $source_target $output_evaluation_dir $prefix_file

