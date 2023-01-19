#!/bin/bash

export e_jar="assembly/evaluator.jar"
subject=subjects/jaxen-1.2.0
export per_assert_cov="$subject/scc_per_assertion.txt"
export targetDir="$subject/target"
export outDir="$subject/evaluation/"

java -jar $e_jar $per_assert_cov $targetDir $outDir prefix.txt


#export JAVA_HOME=export JAVA_HOME=/Users/sbh/Library/Java/JavaVirtualMachines/corretto-1.8.0_352/Contents/Home