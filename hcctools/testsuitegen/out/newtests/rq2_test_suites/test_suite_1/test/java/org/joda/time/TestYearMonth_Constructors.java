/*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Constructors  { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {
        TestYearMonth_Constructors TB= new TestYearMonth_Constructors();
        TB.setUp(); TB.testParse_noFormatter(); TB.tearDown();
        TB.setUp(); TB.testParse_formatter(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromCalendarFields(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromDateFields(); TB.tearDown();
        TB.setUp(); TB.testConstructor(); TB.tearDown();
        TB.setUp(); TB.testConstructor_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_nullChronology(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonth_Constructors.class);
    }

    public TestYearMonth_Constructors(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testParse_noFormatter() throws Throwable {
NoAssert.donothing(new YearMonth(2010, 6), YearMonth.parse("2010-06-30"));
NoAssert.donothing(new YearMonth(2010, 1), YearMonth.parse("2010-002"));
    }

    @Test public void testParse_formatter() throws Throwable {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS));
NoAssert.donothing(new YearMonth(2010, 6), YearMonth.parse("2010--06", f));
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_FromCalendarFields() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        YearMonth expected = new YearMonth(1970, 2);
NoAssert.donothing(expected, YearMonth.fromCalendarFields(cal));
        try {
            YearMonth.fromCalendarFields(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_FromDateFields() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        YearMonth expected = new YearMonth(1970, 2);
        assertEquals(expected, YearMonth.fromDateFields(cal.getTime()));
        try {
            YearMonth.fromDateFields(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    @Test public void testConstructor() throws Throwable {
        YearMonth test = new YearMonth();
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(test, YearMonth.now());
    }

    /**
     * Test constructor (DateTimeZone)
     */
    @Test public void testConstructor_DateTimeZone() throws Throwable {
        DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        YearMonth test = new YearMonth(LONDON);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(test, YearMonth.now(LONDON));
        
        test = new YearMonth(PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(7, test.getMonthOfYear());
NoAssert.donothing(test, YearMonth.now(PARIS));
    }

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test public void testConstructor_nullDateTimeZone() throws Throwable {
        DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        YearMonth test = new YearMonth((DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
        assertEquals(6, test.getMonthOfYear());
    }

    /**
     * Test constructor (Chronology)
     */
    @Test public void testConstructor_Chronology() throws Throwable {
        YearMonth test = new YearMonth(GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(test, YearMonth.now(GREGORIAN_PARIS));
    }

    /**
     * Test constructor (Chronology=null)
     */
    @Test public void testConstructor_nullChronology() throws Throwable {
        YearMonth test = new YearMonth((Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long1() throws Throwable {
        YearMonth test = new YearMonth(TEST_TIME1);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
    }

    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long2() throws Throwable {
        YearMonth test = new YearMonth(TEST_TIME2);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1971, test.getYear());
NoAssert.donothing(5, test.getMonthOfYear());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long1_Chronology() throws Throwable {
        YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long2_Chronology() throws Throwable {
        YearMonth test = new YearMonth(TEST_TIME2, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1971, test.getYear());
NoAssert.donothing(5, test.getMonthOfYear());
    }

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test public void testConstructor_long_nullChronology() throws Throwable {
        YearMonth test = new YearMonth(TEST_TIME1, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object() throws Throwable {
        Date date = new Date(TEST_TIME1);
        YearMonth test = new YearMonth(date);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
    }

    @Test public void testConstructor_nullObject() throws Throwable {
        YearMonth test = new YearMonth((Object) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
    }

    @Test public void testConstructor_ObjectString1() throws Throwable {
        YearMonth test = new YearMonth("1972-12");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1972, test.getYear());
NoAssert.donothing(12, test.getMonthOfYear());
    }

    @Test public void testConstructor_ObjectString5() throws Throwable {
        YearMonth test = new YearMonth("10");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getYear());
        assertEquals(1, test.getMonthOfYear());
    }

    @Test public void testConstructor_ObjectStringEx1() throws Throwable {
        try {
            new YearMonth("T10:20:30.040");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testConstructor_ObjectStringEx2() throws Throwable {
        try {
            new YearMonth("T10:20:30.040+14:00");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testConstructor_ObjectStringEx3() throws Throwable {
        try {
            new YearMonth("10:20:30.040");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testConstructor_ObjectStringEx4() throws Throwable {
        try {
            new YearMonth("10:20:30.040+14:00");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_Object_Chronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        YearMonth test = new YearMonth(date, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
    }

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test public void testConstructor_nullObject_Chronology() throws Throwable {
        YearMonth test = new YearMonth((Object) null, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
    }

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test public void testConstructor_Object_nullChronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        YearMonth test = new YearMonth(date, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
    }

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test public void testConstructor_nullObject_nullChronology() throws Throwable {
        YearMonth test = new YearMonth((Object) null, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    @Test public void testConstructor_int_int() throws Throwable {
        YearMonth test = new YearMonth(1970, 6);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
        try {
            new YearMonth(Integer.MIN_VALUE, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new YearMonth(Integer.MAX_VALUE, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new YearMonth(1970, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new YearMonth(1970, 13);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, Chronology)
     */
    @Test public void testConstructor_int_int_Chronology() throws Throwable {
        YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
        try {
            new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new YearMonth(1970, 0, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new YearMonth(1970, 13, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, Chronology=null)
     */
    @Test public void testConstructor_int_int_nullChronology() throws Throwable {
        YearMonth test = new YearMonth(1970, 6, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
    }

}