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

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

/**
 * Test case.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeConstants  { //extends TestCase {

    /**
     * The main method for this test program.
     * @param args command line arguments.
     */
    public static void main(String[] args) throws Exception  {
        TestDateTimeConstants TB= new TestDateTimeConstants();
        TB.testConstructor();
        TB.testHalfdaysOfDay();
        TB.testDaysOfWeek();
        TB.testMonthsOfYear();
        TB.testEras();
        TB.testMaths();
    }

    /**
     * TestSuite is a junit required method.
     */

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeConstants.class);
    }
    public TestDateTimeConstants(String name) {
        super(name);
    }
    */

    //-----------------------------------------------------------------------
    @Test public void testConstructor() {
        DateTimeConstants c = new DateTimeConstants() {
        };
        c.toString();
    }

    @Test public void testHalfdaysOfDay() {
NoAssert.donothing(0, DateTimeConstants.AM);
NoAssert.donothing(1, DateTimeConstants.PM);
    }

    @Test public void testDaysOfWeek() {
NoAssert.donothing(1, DateTimeConstants.MONDAY);
NoAssert.donothing(2, DateTimeConstants.TUESDAY);
NoAssert.donothing(3, DateTimeConstants.WEDNESDAY);
NoAssert.donothing(4, DateTimeConstants.THURSDAY);
        assertEquals(5, DateTimeConstants.FRIDAY);
NoAssert.donothing(6, DateTimeConstants.SATURDAY);
NoAssert.donothing(7, DateTimeConstants.SUNDAY);
    }

    @Test public void testMonthsOfYear() {
NoAssert.donothing(1, DateTimeConstants.JANUARY);
NoAssert.donothing(2, DateTimeConstants.FEBRUARY);
NoAssert.donothing(3, DateTimeConstants.MARCH);
NoAssert.donothing(4, DateTimeConstants.APRIL);
NoAssert.donothing(5, DateTimeConstants.MAY);
NoAssert.donothing(6, DateTimeConstants.JUNE);
NoAssert.donothing(7, DateTimeConstants.JULY);
NoAssert.donothing(8, DateTimeConstants.AUGUST);
NoAssert.donothing(9, DateTimeConstants.SEPTEMBER);
NoAssert.donothing(10, DateTimeConstants.OCTOBER);
NoAssert.donothing(11, DateTimeConstants.NOVEMBER);
NoAssert.donothing(12, DateTimeConstants.DECEMBER);
    }

    @Test public void testEras() {
NoAssert.donothing(0, DateTimeConstants.BC);
NoAssert.donothing(0, DateTimeConstants.BCE);
NoAssert.donothing(1, DateTimeConstants.AD);
        assertEquals(1, DateTimeConstants.CE);
    }

    @Test public void testMaths() {
NoAssert.donothing(1000, DateTimeConstants.MILLIS_PER_SECOND);
NoAssert.donothing(60 * 1000, DateTimeConstants.MILLIS_PER_MINUTE);
NoAssert.donothing(60 * 60 * 1000, DateTimeConstants.MILLIS_PER_HOUR);
NoAssert.donothing(24 * 60 * 60 * 1000, DateTimeConstants.MILLIS_PER_DAY);
NoAssert.donothing(7 * 24 * 60 * 60 * 1000, DateTimeConstants.MILLIS_PER_WEEK);
        
NoAssert.donothing(60, DateTimeConstants.SECONDS_PER_MINUTE);
NoAssert.donothing(60 * 60, DateTimeConstants.SECONDS_PER_HOUR);
NoAssert.donothing(24 * 60 * 60, DateTimeConstants.SECONDS_PER_DAY);
NoAssert.donothing(7 * 24 * 60 * 60, DateTimeConstants.SECONDS_PER_WEEK);
        
NoAssert.donothing(60, DateTimeConstants.MINUTES_PER_HOUR);
NoAssert.donothing(24 * 60, DateTimeConstants.MINUTES_PER_DAY);
NoAssert.donothing(7 * 24 * 60, DateTimeConstants.MINUTES_PER_WEEK);
        
NoAssert.donothing(24, DateTimeConstants.HOURS_PER_DAY);
        assertEquals(7 * 24, DateTimeConstants.HOURS_PER_WEEK);
        
NoAssert.donothing(7, DateTimeConstants.DAYS_PER_WEEK);
    }

}
