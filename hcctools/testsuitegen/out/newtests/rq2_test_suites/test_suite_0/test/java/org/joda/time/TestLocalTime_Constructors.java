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

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Constructors  { //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final JulianChronology JULIAN_LONDON = JulianChronology.getInstance(LONDON);
    private static final JulianChronology JULIAN_PARIS = JulianChronology.getInstance(PARIS);
    private static final JulianChronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_LONDON = LONDON.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;

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
        TestLocalTime_Constructors TB= new TestLocalTime_Constructors();
        TB.setUp(); TB.testConstantMidnight(); TB.tearDown();
        TB.setUp(); TB.testParse_noFormatter(); TB.tearDown();
        TB.setUp(); TB.testParse_formatter(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromCalendarFields_Calendar(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromDateFields_after1970(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromDateFields_before1970(); TB.tearDown();
        TB.setUp(); TB.testFactory_FromDateFields_null(); TB.tearDown();
        TB.setUp(); TB.testFactoryMillisOfDay_long(); TB.tearDown();
        TB.setUp(); TB.testFactoryMillisOfDay_long_Chronology(); TB.tearDown();
        TB.setUp(); TB.testFactoryMillisOfDay_long_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor(); TB.tearDown();
        TB.setUp(); TB.testConstructor_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_DateTimeZone_2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString1Tokyo(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString1NewYork(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectLocalTime(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectLocalDate(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectLocalDateTime(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectTimeOfDay(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object1_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString_DateTimeZoneLondon(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString_DateTimeZoneTokyo(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString_DateTimeZoneNewYork(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object1_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object2_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_nullChronology(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalTime_Constructors.class);
    }

    public TestLocalTime_Constructors(String name) {
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
        LocalTime test = LocalTime.MIDNIGHT;
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testParse_noFormatter() throws Throwable {
NoAssert.donothing(new LocalTime(1, 20), LocalTime.parse("01:20"));
NoAssert.donothing(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432"));
    }

    @Test public void testParse_formatter() throws Throwable {
        DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS));
NoAssert.donothing(new LocalTime(13, 30), LocalTime.parse("13 30", f));
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_FromCalendarFields_Calendar() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        LocalTime expected = new LocalTime(4, 5, 6, 7);
NoAssert.donothing(expected, LocalTime.fromCalendarFields(cal));
        try {
            LocalTime.fromCalendarFields((Calendar) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_FromDateFields_after1970() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        LocalTime expected = new LocalTime(4, 5, 6, 7);
NoAssert.donothing(expected, LocalTime.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_FromDateFields_before1970() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        LocalTime expected = new LocalTime(4, 5, 6, 7);
NoAssert.donothing(expected, LocalTime.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_FromDateFields_null() throws Exception {
        try {
            LocalTime.fromDateFields((Date) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testFactoryMillisOfDay_long() throws Throwable {
        LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactoryMillisOfDay_long_Chronology() throws Throwable {
        LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, JULIAN_LONDON);
NoAssert.donothing(JULIAN_UTC, test.getChronology());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testFactoryMillisOfDay_long_nullChronology() throws Throwable {
        LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor() throws Throwable {
        LocalTime test = new LocalTime();
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(test, LocalTime.now());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_DateTimeZone() throws Throwable {
        DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        LocalTime test = new LocalTime(LONDON);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(23, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(test, LocalTime.now(LONDON));
        
        test = new LocalTime(PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(test, LocalTime.now(PARIS));
    }

    @Test public void testConstructor_nullDateTimeZone() throws Throwable {
        DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        LocalTime test = new LocalTime((DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(23, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Chronology() throws Throwable {
        LocalTime test = new LocalTime(JULIAN_LONDON);
NoAssert.donothing(JULIAN_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(test, LocalTime.now(JULIAN_LONDON));
    }

    @Test public void testConstructor_nullChronology() throws Throwable {
        LocalTime test = new LocalTime((Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long1() throws Throwable {
        LocalTime test = new LocalTime(TEST_TIME1);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long2() throws Throwable {
        LocalTime test = new LocalTime(TEST_TIME2);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(5 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(6, test.getMinuteOfHour());
NoAssert.donothing(7, test.getSecondOfMinute());
NoAssert.donothing(8, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_DateTimeZone() throws Throwable {
        LocalTime test = new LocalTime(TEST_TIME1, PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long_DateTimeZone_2() throws Throwable {
        DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS);
        DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC);
        
        LocalTime test = new LocalTime(dt.getMillis(), PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
NoAssert.donothing(dtUTC.getMillis(), test.getLocalMillis());
    }

    @Test public void testConstructor_long_nullDateTimeZone() throws Throwable {
        LocalTime test = new LocalTime(TEST_TIME1, (DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long1_Chronology() throws Throwable {
        LocalTime test = new LocalTime(TEST_TIME1, JULIAN_PARIS);
NoAssert.donothing(JULIAN_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long2_Chronology() throws Throwable {
        LocalTime test = new LocalTime(TEST_TIME2, JULIAN_LONDON);
NoAssert.donothing(JULIAN_UTC, test.getChronology());
NoAssert.donothing(5 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(6, test.getMinuteOfHour());
NoAssert.donothing(7, test.getSecondOfMinute());
NoAssert.donothing(8, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long_nullChronology() throws Throwable {
        LocalTime test = new LocalTime(TEST_TIME1, (Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object1() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalTime test = new LocalTime(date);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object2() throws Throwable {
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date(TEST_TIME1));
        LocalTime test = new LocalTime(cal);
NoAssert.donothing(GJChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject() throws Throwable {
        LocalTime test = new LocalTime((Object) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString1() throws Throwable {
        LocalTime test = new LocalTime("10:20:30.040");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString1Tokyo() throws Throwable {
        DateTimeZone.setDefault(TOKYO);
        LocalTime test = new LocalTime("10:20:30.040");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString1NewYork() throws Throwable {
        DateTimeZone.setDefault(NEW_YORK);
        LocalTime test = new LocalTime("10:20:30.040");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString2() throws Throwable {
        LocalTime test = new LocalTime("T10:20:30.040");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString3() throws Throwable {
        LocalTime test = new LocalTime("10:20");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString4() throws Throwable {
        LocalTime test = new LocalTime("10");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectStringEx1() throws Throwable {
        try {
            new LocalTime("1970-04-06");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx2() throws Throwable {
        try {
            new LocalTime("1970-04-06T+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx3() throws Throwable {
        try {
            new LocalTime("1970-04-06T10:20:30.040");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx4() throws Throwable {
        try {
            new LocalTime("1970-04-06T10:20:30.040+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx5() throws Throwable {
        try {
            new LocalTime("T10:20:30.040+04:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx6() throws Throwable {
        try {
            new LocalTime("10:20:30.040+04:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectLocalTime() throws Throwable {
        LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC);
        LocalTime test = new LocalTime(time);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectLocalDate() throws Throwable {
        LocalDate date = new LocalDate(1970, 4, 6, BUDDHIST_UTC);
        try {
            new LocalTime(date);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectLocalDateTime() throws Throwable {
        LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        LocalTime test = new LocalTime(dt);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_ObjectTimeOfDay() throws Throwable {
        TimeOfDay time = new TimeOfDay(10, 20, 30, 40, BUDDHIST_UTC);
        LocalTime test = new LocalTime(time);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object1_DateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalTime test = new LocalTime(date, PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString_DateTimeZoneLondon() throws Throwable {
        LocalTime test = new LocalTime("04:20", LONDON);
NoAssert.donothing(4, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
    }

    @Test public void testConstructor_ObjectString_DateTimeZoneTokyo() throws Throwable {
        LocalTime test = new LocalTime("04:20", TOKYO);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(4, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
    }

    @Test public void testConstructor_ObjectString_DateTimeZoneNewYork() throws Throwable {
        LocalTime test = new LocalTime("04:20", NEW_YORK);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(4, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
    }

    @Test public void testConstructor_nullObject_DateTimeZone() throws Throwable {
        LocalTime test = new LocalTime((Object) null, PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_nullDateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalTime test = new LocalTime(date, (DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {
        LocalTime test = new LocalTime((Object) null, (DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object1_Chronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalTime test = new LocalTime(date, JULIAN_LONDON);
NoAssert.donothing(JULIAN_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object2_Chronology() throws Throwable {
        LocalTime test = new LocalTime("T10:20");
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
        
        try {
            new LocalTime("T1020");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_nullObject_Chronology() throws Throwable {
        LocalTime test = new LocalTime((Object) null, JULIAN_LONDON);
NoAssert.donothing(JULIAN_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_nullChronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalTime test = new LocalTime(date, (Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(2, test.getMinuteOfHour());
NoAssert.donothing(3, test.getSecondOfMinute());
NoAssert.donothing(4, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject_nullChronology() throws Throwable {
        LocalTime test = new LocalTime((Object) null, (Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10 + OFFSET_LONDON, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_int_int() throws Throwable {
        LocalTime test = new LocalTime(10, 20);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
        try {
            new LocalTime(-1, 20);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(24, 20);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, -1);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 60);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_int_int_int() throws Throwable {
        LocalTime test = new LocalTime(10, 20, 30);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
        try {
            new LocalTime(-1, 20, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(24, 20, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, -1, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 60, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, -1);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, 60);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_int_int_int_int() throws Throwable {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
        try {
            new LocalTime(-1, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(24, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, -1, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 60, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, -1, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, 60, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, 30, -1);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, 30, 1000);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_int_int_int_int_Chronology() throws Throwable {
        LocalTime test = new LocalTime(10, 20, 30, 40, JULIAN_LONDON);
NoAssert.donothing(JULIAN_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
        try {
            new LocalTime(-1, 20, 30, 40, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(24, 20, 30, 40, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, -1, 30, 40, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 60, 30, 40, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, -1, 40, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, 60, 40, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, 30, -1, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalTime(10, 20, 30, 1000, JULIAN_LONDON);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_int_int_int_int_nullChronology() throws Throwable {
        LocalTime test = new LocalTime(10, 20, 30, 40, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

}
