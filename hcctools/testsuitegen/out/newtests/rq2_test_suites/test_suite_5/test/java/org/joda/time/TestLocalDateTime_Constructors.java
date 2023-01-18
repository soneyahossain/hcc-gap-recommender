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
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Constructors  { //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_MOSCOW = GregorianChronology.getInstance(MOSCOW);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_MOSCOW = MOSCOW.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    
    private long MILLIS_OF_DAY =
        10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L;
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;

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
        TestLocalDateTime_Constructors TB= new TestLocalDateTime_Constructors();
        TB.setUp(); TB.testParse_noFormatter(); TB.tearDown();
        TB.setUp(); TB.testParse_formatter(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromCalendarFields(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromCalendarFields_beforeYearZero1(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromCalendarFields_beforeYearZero3(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromCalendarFields_null(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromDateFields_after1970(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromDateFields_before1970(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromDateFields_beforeYearZero1(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromDateFields_beforeYearZero3(); TB.tearDown();
        TB.setUp(); TB.testFactory_fromDateFields_null(); TB.tearDown();
        TB.setUp(); TB.testConstructor(); TB.tearDown();
        TB.setUp(); TB.testConstructor_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectString4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectStringEx6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectLocalDateTime(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectLocalDate(); TB.tearDown();
        TB.setUp(); TB.testConstructor_ObjectLocalTime(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_DateTimeZoneMoscow(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_DateTimeZoneMoscowBadDateTime(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_Chronology_crossChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_ChronologyMoscow(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_ChronologyMoscowBadDateTime(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_nullChronology(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Constructors.class);
    }

    public TestLocalDateTime_Constructors(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(MOSCOW);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testParse_noFormatter() throws Throwable {
NoAssert.donothing(new LocalDateTime(2010, 6, 30, 1, 20), LocalDateTime.parse("2010-06-30T01:20"));
NoAssert.donothing(new LocalDateTime(2010, 1, 2, 14, 50, 30, 432), LocalDateTime.parse("2010-002T14:50:30.432"));
    }

    @Test public void testParse_formatter() throws Throwable {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
NoAssert.donothing(new LocalDateTime(2010, 6, 30, 13, 0), LocalDateTime.parse("2010--30 06 13", f));
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_fromCalendarFields() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7);
NoAssert.donothing(expected, LocalDateTime.fromCalendarFields(cal));
    }

    @Test public void testFactory_fromCalendarFields_beforeYearZero1() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.MILLISECOND, 7);
        LocalDateTime expected = new LocalDateTime(0, 2, 3, 4, 5, 6, 7);
NoAssert.donothing(expected, LocalDateTime.fromCalendarFields(cal));
    }

    @Test public void testFactory_fromCalendarFields_beforeYearZero3() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.MILLISECOND, 7);
        LocalDateTime expected = new LocalDateTime(-2, 2, 3, 4, 5, 6, 7);
NoAssert.donothing(expected, LocalDateTime.fromCalendarFields(cal));
    }

    @Test public void testFactory_fromCalendarFields_null() throws Exception {
        try {
            LocalDateTime.fromCalendarFields((Calendar) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_fromDateFields_after1970() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5 ,6, 7);
NoAssert.donothing(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_fromDateFields_before1970() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        cal.set(Calendar.MILLISECOND, 7);
        LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5 ,6, 7);
NoAssert.donothing(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_fromDateFields_beforeYearZero1() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.MILLISECOND, 7);
        LocalDateTime expected = new LocalDateTime(0, 2, 3, 4, 5, 6, 7);
NoAssert.donothing(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_fromDateFields_beforeYearZero3() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.MILLISECOND, 7);
        LocalDateTime expected = new LocalDateTime(-2, 2, 3, 4, 5, 6, 7);
NoAssert.donothing(expected, LocalDateTime.fromDateFields(cal.getTime()));
    }

    @Test public void testFactory_fromDateFields_null() throws Exception {
        try {
            LocalDateTime.fromDateFields((Date) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor() throws Throwable {
        LocalDateTime test = new LocalDateTime();
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(test, LocalDateTime.now());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_DateTimeZone() throws Throwable {
        DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris
        
        LocalDateTime test = new LocalDateTime(LONDON);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(8, test.getDayOfMonth());
NoAssert.donothing(23, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
NoAssert.donothing(test, LocalDateTime.now(LONDON));
        
        test = new LocalDateTime(PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(59, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
        assertEquals(0, test.getMillisOfSecond());
NoAssert.donothing(test, LocalDateTime.now(PARIS));
    }

    @Test public void testConstructor_nullDateTimeZone() throws Throwable {
        LocalDateTime test = new LocalDateTime((DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Chronology() throws Throwable {
        LocalDateTime test = new LocalDateTime(GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(test, LocalDateTime.now(GREGORIAN_PARIS));
    }

    @Test public void testConstructor_nullChronology() throws Throwable {
        LocalDateTime test = new LocalDateTime((Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long1() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME1);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long2() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1971, test.getYear());
        assertEquals(5, test.getMonthOfYear());
NoAssert.donothing(7, test.getDayOfMonth());
NoAssert.donothing(14 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(28, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long1_DateTimeZone() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME1, PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long2_DateTimeZone() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME2, PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1971, test.getYear());
NoAssert.donothing(5, test.getMonthOfYear());
NoAssert.donothing(7, test.getDayOfMonth());
NoAssert.donothing(14 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(28, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long_nullDateTimeZone() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
        assertEquals(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long1_Chronology() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME1, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long2_Chronology() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME2, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1971, test.getYear());
NoAssert.donothing(5, test.getMonthOfYear());
NoAssert.donothing(7, test.getDayOfMonth());
NoAssert.donothing(14 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(28, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_long_nullChronology() throws Throwable {
        LocalDateTime test = new LocalDateTime(TEST_TIME1, (Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object1() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalDateTime test = new LocalDateTime(date);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
        assertEquals(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject() throws Throwable {
        LocalDateTime test = new LocalDateTime((Object) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
        assertEquals(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString1() throws Throwable {
        LocalDateTime test = new LocalDateTime("1972-04-06");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1972, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString2() throws Throwable {
        LocalDateTime test = new LocalDateTime("1972-037");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1972, test.getYear());
NoAssert.donothing(2, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString3() throws Throwable {
        LocalDateTime test = new LocalDateTime("1972-04-06T10:20:30.040");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1972, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectString4() throws Throwable {
        LocalDateTime test = new LocalDateTime("1972-04-06T10:20");
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1972, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectStringEx1() throws Throwable {
        try {
            new LocalDateTime("1970-04-06T+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx2() throws Throwable {
        try {
            new LocalDateTime("1970-04-06T10:20:30.040+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx3() throws Throwable {
        try {
            new LocalDateTime("T10:20:30.040");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx4() throws Throwable {
        try {
            new LocalDateTime("T10:20:30.040+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx5() throws Throwable {
        try {
            new LocalDateTime("10:20:30.040");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectStringEx6() throws Throwable {
        try {
            new LocalDateTime("10:20:30.040+14:00");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectLocalDateTime() throws Throwable {
        LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        LocalDateTime test = new LocalDateTime(dt);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(5, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_ObjectLocalDate() throws Throwable {
        LocalDate date = new LocalDate(1970, 5, 6);
        try {
            new LocalDateTime(date);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_ObjectLocalTime() throws Throwable {
        LocalTime time = new LocalTime(10, 20, 30, 40);
        try {
            new LocalDateTime(time);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object_DateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalDateTime test = new LocalDateTime(date, PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_DateTimeZoneMoscow() throws Throwable {
        LocalDateTime test = new LocalDateTime("1970-04-06T12:24:00", MOSCOW);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_DateTimeZoneMoscowBadDateTime() throws Throwable {
        // 1981-03-31T23:59:59.999+03:00 followed by 1981-04-01T01:00:00.000+04:00
        // 1981-09-30T23:59:59.999+04:00 followed by 1981-09-30T23:00:00.000+03:00
        
        // when a DST non-existing time is passed in, it should still work (ie. zone ignored)
        LocalDateTime test = new LocalDateTime("1981-04-01T00:30:00", MOSCOW);  // doesnt exist
NoAssert.donothing(ISO_UTC, test.getChronology());
        assertEquals(1981, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(1, test.getDayOfMonth());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(30, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject_DateTimeZone() throws Throwable {
        LocalDateTime test = new LocalDateTime((Object) null, PARIS);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
        assertEquals(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_nullDateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalDateTime test = new LocalDateTime(date, (DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {
        LocalDateTime test = new LocalDateTime((Object) null, (DateTimeZone) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object_Chronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalDateTime test = new LocalDateTime(date, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_PARIS, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_Chronology_crossChronology() throws Throwable {
        LocalDateTime input = new LocalDateTime(1970, 4, 6, 12, 30, 0, 0, ISO_UTC);
        LocalDateTime test = new LocalDateTime(input, BUDDHIST_UTC);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12, test.getHourOfDay());
NoAssert.donothing(30, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
        assertEquals(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_ChronologyMoscow() throws Throwable {
        LocalDateTime test = new LocalDateTime("1970-04-06T12:24:00", GREGORIAN_MOSCOW);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12, test.getHourOfDay());
        assertEquals(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_ChronologyMoscowBadDateTime() throws Throwable {
        // 1981-03-31T23:59:59.999+03:00 followed by 1981-04-01T01:00:00.000+04:00
        // 1981-09-30T23:59:59.999+04:00 followed by 1981-09-30T23:00:00.000+03:00
        
        // when a DST non-existing time is passed in, it should still work (ie. zone ignored)
        LocalDateTime test = new LocalDateTime("1981-04-01T00:30:00", GREGORIAN_MOSCOW);  // doesnt exist
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1981, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(1, test.getDayOfMonth());
NoAssert.donothing(0, test.getHourOfDay());
NoAssert.donothing(30, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject_Chronology() throws Throwable {
        LocalDateTime test = new LocalDateTime((Object) null, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_PARIS, test.getHourOfDay());
        assertEquals(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    @Test public void testConstructor_Object_nullChronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        LocalDateTime test = new LocalDateTime(date, (Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(4, test.getMonthOfYear());
NoAssert.donothing(6, test.getDayOfMonth());
NoAssert.donothing(12 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    @Test public void testConstructor_nullObject_nullChronology() throws Throwable {
        LocalDateTime test = new LocalDateTime((Object) null, (Chronology) null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10 + OFFSET_MOSCOW, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
        assertEquals(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_int_int_int_int_int() throws Throwable {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_int_int_int_int_int_int() throws Throwable {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(0, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_int_int_int_int_int_int_int() throws Throwable {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
        try {
            new LocalDateTime(Integer.MIN_VALUE, 6, 9, 10, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(Integer.MAX_VALUE, 6, 9, 10, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 0, 9, 10, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 13, 9, 10, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 6, 0, 10, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 6, 31, 10, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        new LocalDateTime(2005, 7, 31, 10, 20, 30, 40);
        try {
            new LocalDateTime(2005, 7, 32, 10, 20, 30, 40);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_int_int_int_Chronology() throws Throwable {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
NoAssert.donothing(GREGORIAN_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
        assertEquals(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(10, test.getHourOfDay());  // PARIS has no effect
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
        try {
            new LocalDateTime(Integer.MIN_VALUE, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(Integer.MAX_VALUE, 6, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 0, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 13, 9, 10, 20, 30, 40, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 6, 0, 10, 20, 30, 40, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new LocalDateTime(2005, 6, 31, 10, 20, 30, 40, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        new LocalDateTime(2005, 7, 31, 10, 20, 30, 40, GREGORIAN_PARIS);
        try {
            new LocalDateTime(2005, 7, 32, 10, 20, 30, 40, GREGORIAN_PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_int_int_int_nullChronology() throws Throwable {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, null);
NoAssert.donothing(ISO_UTC, test.getChronology());
NoAssert.donothing(2005, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
    }

}
