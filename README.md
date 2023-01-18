# hcc-gap-recommender

To run HCC, you will need to install both Java JDK 1.7 and JDK 1.8

Once this is done:
* update the environment variables in the file `experiments/setenv`
* `cd` into `experiments` and type: ```. setenv```

To build the HCC support libraries:
```
cd $HCC_HOME
./scripts/install_all.sh
```

To make sure everything is working properly, run the following smoke tests:
```
cd $HCC_EXPERIMENTS/scripts
./smoke-tests.sh
```

The smoke tests should take approximately 10mns and will exercise an end-to-end workflow of the HCC toolset. 
You should see output that looks like the following:

``` PASTE OUTPUT HERE ONCE IT IS STABLE ```
