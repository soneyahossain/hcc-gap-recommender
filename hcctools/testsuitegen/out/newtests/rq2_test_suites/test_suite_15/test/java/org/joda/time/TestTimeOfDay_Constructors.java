/*
 *  Copyright 2001-2013 Stephen Colebourne
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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Constructors  { //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final int OFFSET = 1;
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {
        TestTimeOfDay_Constructors TB= new TestTimeOfDay_Constructors();
        TB.setUp(); TB.testConstantMidnight(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromCalendarFields(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromDateFields_after1970(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromDateFields_before1970(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromDateFields_null(); TB.tearDown();
        TB.setUp(); TB.testFactoryMillisOfDay_long1(); TB.tearDown();
        TB.setUp(); TB.testFactoryMillisOfDay_long1_Chronology(); TB.tearDown();
        TB.setUp(); TB.testFactoryMillisOfDay_long_nullChronology(); TB.tearDown();
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
        TB.setUp(); TB.testConstructor_Object1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_todObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor2_Object_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_nullChronology(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestTimeOfDay_Constructors.class);
    }

    public TestTimeOfDay_Constructors(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
        java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        java.util.TimeZone.setDefault(zone.toTimeZone());
        zone = null;
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    @Test public void testConstantMidnight() throws Throwable {
        TimeOfDay test = TimeOfDay.MIDNIGHT;
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
        assertEquals(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_FromCalendarFields() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
NoAssert.donothing(expected, TimeOfDay.fromCalendarFields(cal));
        try {
            TimeOfDay.fromCalendarFields(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_FromDateFields_after1970() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
NoAssert.donothing(expected, TimeOfDay.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_FromDateFields_before1970() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
NoAssert.donothing(expected, TimeOfDay.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_FromDateFields_null() throws Exception {
        try {
            TimeOfDay.fromDateFields(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    /**
     * Test factory (long)
     */
    @Test public void testFactoryMillisOfDay_long1() throws Throwable {
        TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test factory (long, Chronology)
     */
    @Test public void testFactoryMillisOfDay_long1_Chronology() throws Throwable {
        TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1, JulianChronology.getInstance());
        assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test factory (long, Chronology=null)
     */
    @Test public void testFactoryMillisOfDay_long_nullChronology() throws Throwable {
        TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
        assertEquals(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    @Test public void testConstructor() throws Throwable {
        TimeOfDay test = new TimeOfDay();
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    /**
     * Test constructor (DateTimeZone)
     */
    @Test public void testConstructor_DateTimeZone() throws Throwable {
        DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        TimeOfDay test = new TimeOfDay(LONDON);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(23, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
        
        test = new TimeOfDay(PARIS);
        assertEquals(ISO_UTC, test.getChronology());
        assertEquals(0, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
        assertEquals(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test public void testConstructor_nullDateTimeZone() throws Throwable {
        DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        TimeOfDay test = new TimeOfDay((DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(23, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
        assertEquals(40, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Chronology)
     */
    @Test public void testConstructor_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(JulianChronology.getInstance());
NoAssert.donothing(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(10 + OFFSET, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Chronology=null)
     */
    @Test public void testConstructor_nullChronology() throws Throwable {
        TimeOfDay test = new TimeOfDay((Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
        assertEquals(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long1() throws Throwable {
        TimeOfDay test = new TimeOfDay(TEST_TIME1);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long2() throws Throwable {
        TimeOfDay test = new TimeOfDay(TEST_TIME2);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(5 + OFFSET, test.getHourOfDay());
NoAssert.donothing(6, test.getMinuteOfHour());
NoAssert.donothing(7, test.getSecondOfMinute());
NoAssert.donothing(8, test.getMillisOfSecond());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long1_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(TEST_TIME1, JulianChronology.getInstance());
NoAssert.donothing(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(1 + OFFSET, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long2_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance());
NoAssert.donothing(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(5 + OFFSET, test.getHourOfDay());
NoAssert.donothing(6, test.getMinuteOfHour());
        assertEquals(7, test.getSecondOfMinute());
NoAssert.donothing(8, test.getMillisOfSecond());
    }

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test public void testConstructor_long_nullChronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(TEST_TIME1, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
        assertEquals(1 + OFFSET, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_Object1() throws Throwable {
        Date date = new Date(TEST_TIME1);
        TimeOfDay test = new TimeOfDay(date);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_Object2() throws Throwable {
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date(TEST_TIME1));
        TimeOfDay test = new TimeOfDay(cal);
NoAssert.donothing(GJChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(1 + OFFSET, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Object=null)
     */
    @Test public void testConstructor_nullObject() throws Throwable {
        TimeOfDay test = new TimeOfDay((Object) null);
        assertEquals(ISO_UTC, test.getChronology());
        assertEquals(10 + OFFSET, test.getHourOfDay());
        assertEquals(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_todObject() throws Throwable {
        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, CopticChronology.getInstance(PARIS));
        TimeOfDay test = new TimeOfDay(base);
        assertEquals(CopticChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString1() throws Throwable {
        TimeOfDay test = new TimeOfDay("10:20:30.040");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
        assertEquals(20, test.getMinuteOfHour());
        assertEquals(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString2() throws Throwable {
        TimeOfDay test = new TimeOfDay("10:20:30.040+04:00");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET - 4, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
        assertEquals(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString3() throws Throwable {
        TimeOfDay test = new TimeOfDay("T10:20:30.040");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
        assertEquals(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString4() throws Throwable {
        TimeOfDay test = new TimeOfDay("T10:20:30.040+04:00");
NoAssert.donothing(ISO_UTC, test.getChronology());
        assertEquals(10 + OFFSET - 4, test.getHourOfDay());
        assertEquals(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString5() throws Throwable {
        TimeOfDay test = new TimeOfDay("10:20");
NoAssert.donothing(ISO_UTC, test.getChronology());
        assertEquals(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString6() throws Throwable {
        TimeOfDay test = new TimeOfDay("10");
NoAssert.donothing(ISO_UTC, test.getChronology());
        assertEquals(10, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectStringEx1() throws Throwable {
        try {
            new TimeOfDay("1970-04-06");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx2() throws Throwable {
        try {
            new TimeOfDay("1970-04-06T+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx3() throws Throwable {
        try {
            new TimeOfDay("1970-04-06T10:20:30.040");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx4() throws Throwable {
        try {
            new TimeOfDay("1970-04-06T10:20:30.040+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_Object_Chronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        TimeOfDay test = new TimeOfDay(date, JulianChronology.getInstance());
NoAssert.donothing(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(1 + OFFSET, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor2_Object_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay("T10:20");
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
        
        try {
            new TimeOfDay("T1020");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test public void testConstructor_nullObject_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay((Object) null, JulianChronology.getInstance());
NoAssert.donothing(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(10 + OFFSET, test.getHourOfDay());
        assertEquals(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test public void testConstructor_Object_nullChronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        TimeOfDay test = new TimeOfDay(date, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET, test.getHourOfDay());
        assertEquals(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test public void testConstructor_nullObject_nullChronology() throws Throwable {
        TimeOfDay test = new TimeOfDay((Object) null, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
        assertEquals(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    @Test public void testConstructor_int_int() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
        assertEquals(0, test.getMillisOfSecond());
        try {
            new TimeOfDay(-1, 20);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(24, 20);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, -1);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 60);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test public void testConstructor_int_int_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, JulianChronology.getInstance());
        assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
        try {
            new TimeOfDay(-1, 20, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(24, 20, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, -1, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 60, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test public void testConstructor_int_int_nullChronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    /**
     * Test constructor (int, int, int)
     */
    @Test public void testConstructor_int_int_int() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, 30);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
        try {
            new TimeOfDay(-1, 20, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(24, 20, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, -1, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 60, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, -1);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 60);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test public void testConstructor_int_int_int_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, 30, JulianChronology.getInstance());
NoAssert.donothing(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
        try {
            new TimeOfDay(-1, 20, 30, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(24, 20, 30, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, -1, 30, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 60, 30, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, -1, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 60, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test public void testConstructor_int_int_int_nullChronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, 30, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
        assertEquals(30, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    /**
     * Test constructor (int, int, int, int)
     */
    @Test public void testConstructor_int_int_int_int() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
NoAssert.donothing(ISO_UTC, test.getChronology());
        assertEquals(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
        try {
            new TimeOfDay(-1, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(24, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, -1, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 60, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, -1, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 60, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 30, -1);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 30, 1000);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, int, Chronology)
     */
    @Test public void testConstructor_int_int_int_int_Chronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40, JulianChronology.getInstance());
NoAssert.donothing(JulianChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
        assertEquals(40, test.getMillisOfSecond());
        try {
            new TimeOfDay(-1, 20, 30, 40, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(24, 20, 30, 40, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, -1, 30, 40, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 60, 30, 40, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, -1, 40, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 60, 40, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 30, -1, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new TimeOfDay(10, 20, 30, 1000, JulianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, int, Chronology=null)
     */
    @Test public void testConstructor_int_int_int_int_nullChronology() throws Throwable {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

}
