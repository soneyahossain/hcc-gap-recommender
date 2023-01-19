#!/bin/bash
#
# Generate recommendations (this must be the last tool in the HCC toolchain)
#

set -e

export JAVA_HOME=$JDK_18
export PATH=$JAVA_HOME/bin:$PATH

r_jar="$HCC_LIBS/hcc_recommender.jar"

export source_target=$1
export unchecked=$2
export outdir=$3

if [ ! -d $outdir ]; then
	mkdir $outdir
fi

echo "Project target classes: $source_target"
echo "Uncheck statements file: $unchecked"
echo "Recommender output directory: $outdir"

java -jar $r_jar $unchecked $source_target $outdir
