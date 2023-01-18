This repository contains all the files and scripts needed to compute OMC from various projects.
To the extent possible, projects were forked and minimal changes were applied. Changes typically consist of:
* modifying `pom.xml` to add the maven clover plugin to compute various structural coverage metrics

```
329                 <plugin>
330                     <groupId>com.atlassian.maven.plugins</groupId>
331                     <artifactId>maven-clover2-plugin</artifactId>
332                     <version>4.0.6</version>
333                     <configuration>
334                         <!--   <contextFilters>try,catch,static</contextFilters> -->
335                         <generateHistorical>true</generateHistorical>
336                         <jdk>1.7</jdk>
337                         <includesTestSourceRoots>false</includesTestSourceRoots>
338                     </configuration>
339                 </plugin>
```

```
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.2</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <!-- attached to Maven test phase -->
                    <execution>
                        <id>report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
```

* modifying `pom.xml` to exclude any tests that fail with clover, tracing and/or slicing

# list of projects

| projects             | hash      | junit| clover | trace                 | slice | stmt(%)| omc(%) | recommender  |notes|
|---                   |---        |---   |---     |---                    |---    |---     |---     |---           |---  | 
| fse-joda-time        |           |yes | yes    | yes                   | yes   | 88.8   | 51.5   | only chrono? | From FSE submission     |
| fse-jaxen-1.2.0      |           |yes | yes    | yessish? 2 different test suites? |  no (different layout)     |        |        |              | From FSE submission; multiple test suites? different test dir layout?  |
| fse-commons-lang-3.6 |           |yes |yes    | yes                   | yes   | 81.8   | 43.76  | fail         | From FSE submission    |
| csv-commons          |  f368f64f |yes | yes    | yes                   | yes   | 93.8   | 43.84  | yes          | Hash corresponds to bug 16 in defects4j|
| commons-math          |  2465aaadf4e6c96 | yes | yes |                    |    | 89.5 |   |           | From defects4j repo; removed 4 failing tests|

2465aaadf4e6c96

# directory layout
* `subjects` contains the programs/projects under test
* `specs` itemizes the list of test classes for each project
* `slices` and `traces` are automatically generated
* `scripts` contains utility scripts to run tests, record structure coverage metrics and compute OMC metrics

# how to use
Instructions for running experiments upcoming... stay tuned
