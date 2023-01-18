/*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;import org.joda.time.NoAssert;

import org.joda.time.chrono.ISOChronology;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for DurationField.
 *
 * @author Stephen Colebourne
 */
public class TestDurationField  { //extends TestCase {

    public static void main(String[] args) throws Exception  {
        TestDurationField TB= new TestDurationField();
        TB.setUp(); TB.test_subtract(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDurationField.class);
    }

    public TestDurationField(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void test_subtract() throws Exception {
        DurationField fld = ISOChronology.getInstanceUTC().millis();
        assertEquals(900, fld.subtract(1000L, 100));
        assertEquals(900L, fld.subtract(1000L, 100L));
        assertEquals((1000L - Integer.MAX_VALUE), fld.subtract(1000L, Integer.MAX_VALUE));
NoAssert.donothing((1000L - Integer.MIN_VALUE), fld.subtract(1000L, Integer.MIN_VALUE));
        assertEquals((1000L - Long.MAX_VALUE), fld.subtract(1000L, Long.MAX_VALUE));
        try {
            fld.subtract(-1000L, Long.MIN_VALUE);
            fail();
        } catch (ArithmeticException ex) {}
    }

}
