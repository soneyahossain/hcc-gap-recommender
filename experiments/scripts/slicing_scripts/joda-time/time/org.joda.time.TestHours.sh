#!/bin/bash

echo "computing slice for TestHours"

mkdir -p $HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours

timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:87:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours1.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:88:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours2.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:89:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours3.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:90:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours4.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:91:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours5.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:92:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours6.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:93:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours7.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:94:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours8.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:95:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours9.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:96:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours10.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testConstants:97:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours11.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:102:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours12.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:103:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours13.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:104:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours14.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:105:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours15.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:106:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours16.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:107:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours17.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:108:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours18.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:109:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours19.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:110:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours20.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:111:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours21.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:112:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours22.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:113:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours23.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hours_int:114:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours24.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RInstant:123:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours25.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RInstant:124:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours26.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RInstant:125:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours27.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RInstant:126:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours28.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RInstant:127:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours29.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RPartial:136:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours30.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RPartial:137:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours31.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RPartial:138:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours32.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RPartial:139:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours33.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursBetween_RPartial:140:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours34.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursIn_RInterval:148:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours35.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursIn_RInterval:149:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours36.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursIn_RInterval:150:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours37.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursIn_RInterval:151:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours38.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_hoursIn_RInterval:152:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours39.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:156:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours40.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:157:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours41.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:158:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours42.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:159:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours43.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:160:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours44.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:161:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours45.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:162:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours46.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:163:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours47.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_standardHoursIn_RPeriod:164:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours48.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_parseHours_String:174:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours49.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_parseHours_String:175:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours50.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_parseHours_String:176:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours51.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_parseHours_String:177:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours52.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_parseHours_String:178:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours53.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testFactory_parseHours_String:179:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours54.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testGetMethods:197:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours55.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testGetFieldType:202:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours56.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testGetPeriodType:207:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours57.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsGreaterThan:212:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours58.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsGreaterThan:213:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours59.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsGreaterThan:214:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours60.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsGreaterThan:215:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours61.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsGreaterThan:216:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours62.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsLessThan:220:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours63.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsLessThan:221:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours64.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsLessThan:222:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours65.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsLessThan:223:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours66.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testIsLessThan:224:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours67.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToString:230:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours68.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToString:233:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours69.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testSerialization:251:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours70.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToStandardWeeks:258:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours71.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToStandardDays:264:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours72.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToStandardMinutes:270:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours73.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToStandardSeconds:283:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours74.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToStandardDuration:296:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours75.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testToStandardDuration:299:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours76.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_int:306:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours77.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_int:307:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours78.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_int:309:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours79.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_Hours:323:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours80.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_Hours:324:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours81.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_Hours:325:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours82.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_Hours:327:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours83.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testPlus_Hours:328:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours84.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_int:341:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours85.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_int:342:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours86.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_int:344:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours87.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_Hours:358:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours88.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_Hours:359:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours89.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_Hours:360:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours90.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_Hours:362:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours91.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMinus_Hours:363:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours92.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMultipliedBy_int:375:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours93.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMultipliedBy_int:376:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours94.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMultipliedBy_int:377:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours95.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testMultipliedBy_int:378:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours96.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testDividedBy_int:391:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours97.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testDividedBy_int:392:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours98.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testDividedBy_int:393:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours99.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testDividedBy_int:394:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours100.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testDividedBy_int:395:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours101.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testDividedBy_int:396:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours102.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testDividedBy_int:397:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours103.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testNegated:409:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours104.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testNegated:410:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours105.txt
timeout $HCC_TRACE_TIMEOUT_SEC java -Xmx30g  -XX:-UseGCOverheadLimit  -XX:+UseG1GC -jar $HCC_HOME/lib/slicer.jar -m=1 -p $HCC_EXPERIMENTS/traces/fse-joda-time/time_traces/TestHours.trace org.joda.time.TestHours.testAddToLocalDate:425:*>$HCC_EXPERIMENTS/slices/fse-joda-time/time_slices/TestHours/TestHours106.txt

#Total Asserts in org.joda.time/TestHours=============106
#Total Tests in org.joda.time/TestHours=============0