Requirement:

    java 1.8
    maven 3.6.3

To generate jar in the assembly directory, run:

    mvn clean package

this will generate two jar files inside the assembly directory.

to generate evaluation results, run: 
    
    sh run-evaluator.sh

which requires following inputs:

1. location of evaluator.jar 
2. subject directory
3. .txt file that contains per assertion coverage which is generated in RQ1 during hcc computation
4. path of the target source (compiled bytecodes in the project target directory)
5. path of the output dir
6. prefix.txt

output directory will contain method recommendations for each assertion considered in this evaluation, output/results directory will contain several .csv file recording
the top-k matches. 


To generate recommendations, run:

    sh run.sh

which requires following inputs:

1. location of recommender.jar
2. .txt file that contains the unchecked statements to run the recommender
3. path of the target source (compiled bytecodes in the project target directory)
4. path of the output dir

successful completion generates recommendation for each class and stores them in a separate file in the output directory