#
# Utility common to all scripts
#

# verify environment variables
if [ ! -d "$HCC_HOME" ]; then
	echo HCC_HOME environment variable does not exist
	exit 1
fi

if [ ! -d $HCC_EXPERIMENTS ]; then
	echo HCC_EXPERIMENTS environment variable does not exist
	exit 1
fi

if [ ! -d $HCC_LIBS ]; then
	echo HCC_LIBS environment variable does not exist
	exit 1
fi

