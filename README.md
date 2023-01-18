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

==========================================================================================
[SmokeTest] commons-cli-limited: Slice traces (~10mns)
==========================================================================================
Slice file(s) generated: OK
/home/stg/hcc-gap-recommender/experiments/slices/commons-cli-limited/cli_slices/:
total 4
drwxrwxr-x 2 stg stg 4096 Jan 18 20:25 CommandLineTest

/home/stg/hcc-gap-recommender/experiments/slices/commons-cli-limited/cli_slices/CommandLineTest:
total 436
-rw-rw-r-- 1 stg stg  8939 Jan 18 20:25 CommandLineTest15.txt
-rw-rw-r-- 1 stg stg  6510 Jan 18 20:25 CommandLineTest14.txt
-rw-rw-r-- 1 stg stg  7106 Jan 18 20:25 CommandLineTest13.txt
-rw-rw-r-- 1 stg stg 41426 Jan 18 20:24 CommandLineTest12.txt
-rw-rw-r-- 1 stg stg 40431 Jan 18 20:24 CommandLineTest11.txt
-rw-rw-r-- 1 stg stg  5326 Jan 18 20:24 CommandLineTest10.txt
-rw-rw-r-- 1 stg stg  4012 Jan 18 20:24 CommandLineTest9.txt
-rw-rw-r-- 1 stg stg  4273 Jan 18 20:24 CommandLineTest8.txt
-rw-rw-r-- 1 stg stg 44125 Jan 18 20:24 CommandLineTest7.txt
-rw-rw-r-- 1 stg stg 43454 Jan 18 20:24 CommandLineTest6.txt
-rw-rw-r-- 1 stg stg 42567 Jan 18 20:23 CommandLineTest5.txt
-rw-rw-r-- 1 stg stg 43728 Jan 18 20:23 CommandLineTest4.txt
-rw-rw-r-- 1 stg stg 43592 Jan 18 20:23 CommandLineTest3.txt
-rw-rw-r-- 1 stg stg 45389 Jan 18 20:23 CommandLineTest2.txt
-rw-rw-r-- 1 stg stg 34564 Jan 18 20:23 CommandLineTest1.txt

FIXME: PASTE THE REST OF THE OUTPUT
```
