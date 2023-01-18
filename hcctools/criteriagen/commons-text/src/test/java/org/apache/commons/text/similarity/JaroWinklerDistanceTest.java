/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.text.similarity;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit tests for {@link JaroWinklerDistance}.
 */
public class JaroWinklerDistanceTest {

    private static JaroWinklerDistance distance;

    @BeforeClass
    public static void setUp() {
        distance = new JaroWinklerDistance();
    }

    @Test
    public void testGetJaroWinklerDistance_StringString() {
        assertEquals(0.92499d, distance.apply("frog", "fog"), 0.00001d);
        assertEquals(0.0d, distance.apply("fly", "ant"), 0.0d);
        assertEquals(0.44166d, distance.apply("elephant", "hippo"), 0.00001d);
        assertEquals(0.92740d, distance.apply("ABC Corporation", "ABC Corp"), 0.00001d);
        assertEquals(0.94580d, distance.apply("D N H Enterprises Inc", "D & H Enterprises, Inc."), 0.00001d);
        assertEquals(0.921458d,
                distance.apply("My Gym Children's Fitness Center", "My Gym. Childrens Fitness"), 0.00001d);
        assertEquals(0.882329d, distance.apply("PENNSYLVANIA", "PENNCISYLVNIA"), 0.00001d);
        assertEquals(0.996598d, distance.apply("/opt/software1", "/opt/software2"), 0.00001d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetJaroWinklerDistance_NullNull() {
        distance.apply(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetJaroWinklerDistance_StringNull() {
        distance.apply(" ", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetJaroWinklerDistance_NullString() {
        distance.apply(null, "clear");
    }

}
