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

``` PASTE COMPLETE OUTPUT HERE ONCE IT IS STABLE 

*****************************************************************
Smoke tests for end-to-end checked coverage computation workflow
*****************************************************************

Verify ability to generate:
   - statement coverage via clover
   - object branch coverage via jacoco
   - traces
   - slices
   - checked coverage (statement)
   - checked coverage (object branch)
   - recommender/evaluator tool output


==========================================================================================
[SmokeTest] commons-cli-limited: Cleaning up any old experimental artifacts
==========================================================================================
Cleaning up traces directory
Cleaning up slices directory
Cleaning up results directory

==========================================================================================
[SmokeTest] commons-cli-limited: Compute baseline coverage information with clover (< 1mn)
==========================================================================================
Clover baseline coverage: OK
Coverage Overview -
Coverage:-
      Methods: 99/253 (39.1%)                                                                                                   
   Statements: 288/1009 (28.5%)                                                                                                 
     Branches: 96/468 (20.5%)                                                                                                   
        Total: 27.9%                                                                                                            
Complexity:-
   Avg Method: 2.217
      Density: 0.556
        Total: 561

==========================================================================================
[SmokeTest] commons-cli-limited: Compute baseline coverage information with jacoco (< 1mn)
==========================================================================================
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.179 s
[INFO] Finished at: 2023-01-18T20:22:27Z
[INFO] ------------------------------------------------------------------------
Save jacoco.xml in /home/stg/hcc-gap-recommender/experiments/hcc_results/commons-cli-limited/jacoco/

==========================================================================================
[SmokeTest] commons-cli-limited: Generate trace information for unit tests (< 2mns)
==========================================================================================
Trace file generated: OK
total 7588
-rw-rw-r-- 1 stg stg 7768597 Jan 18 20:23 CommandLineTest.trace




```
