# hcc-gap-recommender

To run HCC, you will need to install both Java JDK 1.7 and JDK 1.8

Once this is done:
# update the environment variables in the file `experiments/setenv`
# `cd` into `experiments` and type: ```. setenv```

To build various support libraries:
```./install_all.sh```

To make sure everything is working properly, you can run the following smoke tests:
```
cd $HCC_EXPERIMENTS/scripts
./smoke-tests.sh
```
