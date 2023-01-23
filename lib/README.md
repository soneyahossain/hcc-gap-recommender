This libraries are built from either JavaSlicer or from our implemented tools


# description of the jar files
jar files generated from JavaSlicer

* `tracer.jar` generates trace files when a test class is executed
* `slicer.jar` computes slice from the generated traces and slicing criteria
* `traceReader.jar` reads a trace file in human-readable format (this is a support lib, not used in the experiments)
* `visualize.jar` visualizes the slice (this is a support lib, not used in the experiments)

Details on the JavaSlicer can be found at https://github.com/backes/javaslicer

* `iscript-gen.jar` automatically generates slicing scripts from Java source files, which can be used to compute slices
* `scc.jar` computes SCC metric
* `obcc.jar` computes OBCC metric
* `recommender.jar`  generated recommendations based on the unchecked statements
* `evaluator.jar` evaluates recommendations produced by the recommender
