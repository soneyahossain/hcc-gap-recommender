#!/bin/bash
#
# Compute HCC statistics
#
# HCC works with 1.8 only (whereas slicer works with 1.7)
export JAVA_HOME=$JDK_1_8
export PATH=$JAVA_HOME/bin:$PATH
#hcc_ob_jar=$HCC_LIBS/hcc_ob.jar
hcc_ob_jar=$HCC_LIBS/obcc.jar

jacoco_xml=$1

if [ -z $1 ]; then
	echo Please specify the location of jacoco.xml which contains the baseline standard converage info
	exit 1
fi

if [ -z $2 ]; then
	echo Please specify the output HCC directory
	exit 1
fi

if [ -z $3 ]; then
	echo Please specify the prefix file
	exit 1
fi

hcc_output_dir=$2
if [ ! -d $hcc_output_dir ]; then
	mkdir $hcc_output_dir
fi

if [ -z $HCC_SLICES ]; then
	echo Please specify the top-level directory that contains the slices
	exit 1
fi

if [ ! -f $jacoco_xml ]; then
	echo "Error: was expecting to find file $jacoco_xml"
	exit 1
fi

prefix=$3
echo "Prefix to compute HCC:"
cat $prefix 

#
# compute HCC information
#
echo "Computing HCC object branch coverage"
echo "    slices_dir: $HCC_SLICES"
echo "    output_dir: $hcc_output_dir"
java -jar $hcc_ob_jar $HCC_SLICES $jacoco_xml $hcc_output_dir $prefix

