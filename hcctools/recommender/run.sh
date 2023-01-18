#!/bin/bash

subject=subjects/joda-time
export r_jar="assembly/recommender.jar"
export unchecked="$subject/unchecked.txt"
export source_target="$subject/target/classes"
export outDir="$subject/out"

java -jar $r_jar $unchecked $source_target $outDir
