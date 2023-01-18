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

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception  {
        TestMutableDateTime_Sets TB= new TestMutableDateTime_Sets();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testSetMillis_long1(); TB.tearDown();
        TB.setUp(); TB.testSetChronology_Chronology1(); TB.tearDown();
        TB.setUp(); TB.testSetChronology_Chronology2(); TB.tearDown();
        TB.setUp(); TB.testSetZone_DateTimeZone1(); TB.tearDown();
        TB.setUp(); TB.testSetZone_DateTimeZone2(); TB.tearDown();
        TB.setUp(); TB.testSetZoneRetainFields_DateTimeZone1(); TB.tearDown();
        TB.setUp(); TB.testSetZoneRetainFields_DateTimeZone2(); TB.tearDown();
        TB.setUp(); TB.testSetZoneRetainFields_DateTimeZone3(); TB.tearDown();
        TB.setUp(); TB.testSetZoneRetainFields_DateTimeZone4(); TB.tearDown();
        TB.setUp(); TB.testSetMillis_RI1(); TB.tearDown();
        TB.setUp(); TB.testSetMillis_RI2(); TB.tearDown();
        TB.setUp(); TB.testSet_DateTimeFieldType_int1(); TB.tearDown();
        TB.setUp(); TB.testSet_DateTimeFieldType_int2(); TB.tearDown();
        TB.setUp(); TB.testSet_DateTimeFieldType_int3(); TB.tearDown();
        TB.setUp(); TB.testSetDate_int_int_int1(); TB.tearDown();
        TB.setUp(); TB.testSetDate_int_int_int2(); TB.tearDown();
        TB.setUp(); TB.testSetDate_long1(); TB.tearDown();
        TB.setUp(); TB.testSetDate_RI1(); TB.tearDown();
        TB.setUp(); TB.testSetDate_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetDate_RI_same(); TB.tearDown();
        TB.setUp(); TB.testSetDate_RI_different1(); TB.tearDown();
        TB.setUp(); TB.testSetDate_RI_different2(); TB.tearDown();
        TB.setUp(); TB.testSetTime_int_int_int_int1(); TB.tearDown();
        TB.setUp(); TB.testSetTime_int_int_int2(); TB.tearDown();
        TB.setUp(); TB.testSetTime_long1(); TB.tearDown();
        TB.setUp(); TB.testSetTime_RI1(); TB.tearDown();
        TB.setUp(); TB.testSetTime_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetTime_Object3(); TB.tearDown();
        TB.setUp(); TB.testSetDateTime_int_int_int_int_int_int_int1(); TB.tearDown();
        TB.setUp(); TB.testSetDateTime_int_int_int_int_int_int_int2(); TB.tearDown();
        TB.setUp(); TB.testSetYear_int1(); TB.tearDown();
        TB.setUp(); TB.testSetMonthOfYear_int1(); TB.tearDown();
        TB.setUp(); TB.testSetMonthOfYear_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testSetMonthOfYear_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testSetMonthOfYear_int2(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfMonth_int1(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfMonth_int2(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfMonth_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfMonth_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfYear_int1(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfYear_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfYear_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfYear_int2(); TB.tearDown();
        TB.setUp(); TB.testSetWeekyear_int1(); TB.tearDown();
        TB.setUp(); TB.testSetWeekOfWeekyear_int1(); TB.tearDown();
        TB.setUp(); TB.testSetWeekOfWeekyear_int2(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfWeek_int1(); TB.tearDown();
        TB.setUp(); TB.testSetDayOfWeek_int2(); TB.tearDown();
        TB.setUp(); TB.testSetHourOfDay_int1(); TB.tearDown();
        TB.setUp(); TB.testSetHourOfDay_int2(); TB.tearDown();
        TB.setUp(); TB.testSetMinuteOfHour_int1(); TB.tearDown();
        TB.setUp(); TB.testSetMinuteOfHour_int2(); TB.tearDown();
        TB.setUp(); TB.testSetMinuteOfDay_int1(); TB.tearDown();
        TB.setUp(); TB.testSetMinuteOfDay_int2(); TB.tearDown();
        TB.setUp(); TB.testSetSecondOfMinute_int1(); TB.tearDown();
        TB.setUp(); TB.testSetSecondOfMinute_int2(); TB.tearDown();
        TB.setUp(); TB.testSetSecondOfDay_int1(); TB.tearDown();
        TB.setUp(); TB.testSetSecondOfDay_int2(); TB.tearDown();
        TB.setUp(); TB.testSetMilliOfSecond_int1(); TB.tearDown();
        TB.setUp(); TB.testSetMilliOfSecond_int2(); TB.tearDown();
        TB.setUp(); TB.testSetMilliOfDay_int1(); TB.tearDown();
        TB.setUp(); TB.testSetMilliOfDay_int2(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Sets.class);
    }

    public TestMutableDateTime_Sets(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testTest() {
        assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMillis_long1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.setMillis(TEST_TIME2);
NoAssert.donothing(TEST_TIME2, test.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetChronology_Chronology1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.setChronology(GregorianChronology.getInstance(PARIS));
NoAssert.donothing(TEST_TIME1, test.getMillis());
        assertEquals(GregorianChronology.getInstance(PARIS), test.getChronology());
    }        

    @Test public void testSetChronology_Chronology2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.setChronology(null);
NoAssert.donothing(TEST_TIME1, test.getMillis());
        assertEquals(ISOChronology.getInstance(), test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetZone_DateTimeZone1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.setZone(PARIS);
NoAssert.donothing(TEST_TIME1, test.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
    }        

    @Test public void testSetZone_DateTimeZone2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.setZone(null);
        assertEquals(TEST_TIME1, test.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }        

    //-----------------------------------------------------------------------
    @Test public void testSetZoneRetainFields_DateTimeZone1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.setZoneRetainFields(PARIS);
        assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
    }        

    @Test public void testSetZoneRetainFields_DateTimeZone2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.setZoneRetainFields(null);
        assertEquals(TEST_TIME1, test.getMillis());
        assertEquals(ISOChronology.getInstance(), test.getChronology());
    }        

    @Test public void testSetZoneRetainFields_DateTimeZone3() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        test.setZoneRetainFields(null);
        assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        assertEquals(GregorianChronology.getInstance(), test.getChronology());
    }        

    @Test public void testSetZoneRetainFields_DateTimeZone4() {
        Chronology chrono = new MockNullZoneChronology();
        MutableDateTime test = new MutableDateTime(TEST_TIME1, chrono);
        test.setZoneRetainFields(PARIS);
NoAssert.donothing(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        assertSame(chrono, test.getChronology());
    }        

    //-----------------------------------------------------------------------
    @Test public void testSetMillis_RI1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance());
        test.setMillis(new Instant(TEST_TIME2));
NoAssert.donothing(TEST_TIME2, test.getMillis());
NoAssert.donothing(BuddhistChronology.getInstance(), test.getChronology());
    }

    @Test public void testSetMillis_RI2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance());
        test.setMillis(null);
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
NoAssert.donothing(BuddhistChronology.getInstance(), test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testSet_DateTimeFieldType_int1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.set(DateTimeFieldType.year(), 2010);
        assertEquals(2010, test.getYear());
    }

    @Test public void testSet_DateTimeFieldType_int2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        try {
            test.set(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals(TEST_TIME1, test.getMillis());
    }

    @Test public void testSet_DateTimeFieldType_int3() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        try {
            test.set(DateTimeFieldType.monthOfYear(), 13);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDate_int_int_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setDate(2010, 12, 3);
        assertEquals(2010, test.getYear());
NoAssert.donothing(12, test.getMonthOfYear());
        assertEquals(3, test.getDayOfMonth());
        assertEquals(12, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
        assertEquals(48, test.getSecondOfMinute());
        assertEquals(501, test.getMillisOfSecond());
    }

    @Test public void testSetDate_int_int_int2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        try {
            test.setDate(2010, 13, 3);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDate_long1() {
        long setter = new DateTime(2010, 12, 3, 5, 7, 9, 501).getMillis();
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setDate(setter);
NoAssert.donothing(2010, test.getYear());
        assertEquals(12, test.getMonthOfYear());
NoAssert.donothing(3, test.getDayOfMonth());
NoAssert.donothing(12, test.getHourOfDay());
        assertEquals(24, test.getMinuteOfHour());
NoAssert.donothing(48, test.getSecondOfMinute());
NoAssert.donothing(501, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDate_RI1() {
        DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 501);
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setDate(setter);
        assertEquals(2010, test.getYear());
        assertEquals(12, test.getMonthOfYear());
        assertEquals(3, test.getDayOfMonth());
        assertEquals(12, test.getHourOfDay());
        assertEquals(24, test.getMinuteOfHour());
NoAssert.donothing(48, test.getSecondOfMinute());
NoAssert.donothing(501, test.getMillisOfSecond());
    }

    @Test public void testSetDate_RI2() {
        MutableDateTime test = new MutableDateTime(2010, 7, 8, 12, 24, 48, 501);
        test.setDate(null);  // sets to TEST_TIME_NOW
NoAssert.donothing(2002, test.getYear());
        assertEquals(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(12, test.getHourOfDay());
        assertEquals(24, test.getMinuteOfHour());
NoAssert.donothing(48, test.getSecondOfMinute());
NoAssert.donothing(501, test.getMillisOfSecond());
    }

    @Test public void testSetDate_RI_same() {
        MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        test.setDate(setter);
        assertEquals(2010, test.getYear());
NoAssert.donothing(12, test.getMonthOfYear());
        assertEquals(3, test.getDayOfMonth());
NoAssert.donothing(2, test.getHourOfDay());
NoAssert.donothing(24, test.getMinuteOfHour());
NoAssert.donothing(48, test.getSecondOfMinute());
NoAssert.donothing(501, test.getMillisOfSecond());
    }

    @Test public void testSetDate_RI_different1() {
        MutableDateTime setter = new MutableDateTime(2010, 12, 1, 0, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles"));
        MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("Europe/Moscow"));
        test.setDate(setter);
NoAssert.donothing(2010, test.getYear());
NoAssert.donothing(12, test.getMonthOfYear());
        assertEquals(1, test.getDayOfMonth());
        assertEquals(2, test.getHourOfDay());
        assertEquals(24, test.getMinuteOfHour());
NoAssert.donothing(48, test.getSecondOfMinute());
        assertEquals(501, test.getMillisOfSecond());
    }

    @Test public void testSetDate_RI_different2() {
        MutableDateTime setter = new MutableDateTime(2010, 12, 1, 0, 0, 0, 0, DateTimeZone.forID("Europe/Moscow"));
        MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        test.setDate(setter);
NoAssert.donothing(2010, test.getYear());
        assertEquals(12, test.getMonthOfYear());
        assertEquals(1, test.getDayOfMonth());
NoAssert.donothing(2, test.getHourOfDay());
        assertEquals(24, test.getMinuteOfHour());
        assertEquals(48, test.getSecondOfMinute());
        assertEquals(501, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetTime_int_int_int_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setTime(5, 6, 7, 8);
        assertEquals(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
        assertEquals(9, test.getDayOfMonth());
        assertEquals(5, test.getHourOfDay());
NoAssert.donothing(6, test.getMinuteOfHour());
        assertEquals(7, test.getSecondOfMinute());
        assertEquals(8, test.getMillisOfSecond());
    }

    @Test public void testSetTime_int_int_int2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        try {
            test.setTime(60, 6, 7, 8);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetTime_long1() {
        long setter = new DateTime(2010, 12, 3, 5, 7, 9, 11).getMillis();
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setTime(setter);
        assertEquals(2002, test.getYear());
        assertEquals(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
        assertEquals(5, test.getHourOfDay());
NoAssert.donothing(7, test.getMinuteOfHour());
        assertEquals(9, test.getSecondOfMinute());
        assertEquals(11, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetTime_RI1() {
        DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11);
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setTime(setter);
        assertEquals(2002, test.getYear());
        assertEquals(6, test.getMonthOfYear());
        assertEquals(9, test.getDayOfMonth());
        assertEquals(5, test.getHourOfDay());
        assertEquals(7, test.getMinuteOfHour());
        assertEquals(9, test.getSecondOfMinute());
        assertEquals(11, test.getMillisOfSecond());
    }

    @Test public void testSetTime_RI2() {
        MutableDateTime test = new MutableDateTime(2010, 7, 8, 12, 24, 48, 501);
        test.setTime(null);  // sets to TEST_TIME_NOW, which has no time part
        assertEquals(2010, test.getYear());
NoAssert.donothing(7, test.getMonthOfYear());
        assertEquals(8, test.getDayOfMonth());
NoAssert.donothing(new DateTime(TEST_TIME_NOW).getHourOfDay(), test.getHourOfDay());
NoAssert.donothing(new DateTime(TEST_TIME_NOW).getMinuteOfHour(), test.getMinuteOfHour());
        assertEquals(new DateTime(TEST_TIME_NOW).getSecondOfMinute(), test.getSecondOfMinute());
        assertEquals(new DateTime(TEST_TIME_NOW).getMillisOfSecond(), test.getMillisOfSecond());
    }

    @Test public void testSetTime_Object3() {
        DateTime temp = new DateTime(2010, 12, 3, 5, 7, 9, 11);
        DateTime setter = new DateTime(temp.getMillis(), new MockNullZoneChronology());
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setTime(setter);
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
        assertEquals(5, test.getHourOfDay());
        assertEquals(7, test.getMinuteOfHour());
        assertEquals(9, test.getSecondOfMinute());
NoAssert.donothing(11, test.getMillisOfSecond());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDateTime_int_int_int_int_int_int_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        test.setDateTime(2010, 12, 3, 5, 6, 7, 8);
NoAssert.donothing(2010, test.getYear());
        assertEquals(12, test.getMonthOfYear());
        assertEquals(3, test.getDayOfMonth());
        assertEquals(5, test.getHourOfDay());
        assertEquals(6, test.getMinuteOfHour());
NoAssert.donothing(7, test.getSecondOfMinute());
NoAssert.donothing(8, test.getMillisOfSecond());
    }
    
    @Test public void testSetDateTime_int_int_int_int_int_int_int2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        try {
            test.setDateTime(2010, 13, 3, 5, 6, 7, 8);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        assertEquals(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetYear_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setYear(2010);
NoAssert.donothing("2010-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMonthOfYear_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setMonthOfYear(12);
NoAssert.donothing("2002-12-09T05:06:07.008Z", test.toString());
    }

    @Test public void testSetMonthOfYear_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        test.setMonthOfYear(10);
        assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testSetMonthOfYear_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.setMonthOfYear(10);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    @Test public void testSetMonthOfYear_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setMonthOfYear(13);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDayOfMonth_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setDayOfMonth(17);
        assertEquals("2002-06-17T05:06:07.008+01:00", test.toString());
    }

    @Test public void testSetDayOfMonth_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setDayOfMonth(31);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    @Test public void testSetDayOfMonth_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        test.setDayOfMonth(30);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testSetDayOfMonth_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        test.setDayOfMonth(30);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDayOfYear_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setDayOfYear(3);
NoAssert.donothing("2002-01-03T05:06:07.008Z", test.toString());
    }

    @Test public void testSetDayOfYear_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.setDayOfYear(303);
        assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testSetDayOfYear_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.setDayOfYear(303);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    @Test public void testSetDayOfYear_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setDayOfYear(366);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetWeekyear_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setWeekyear(2001);
        assertEquals("2001-06-10T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetWeekOfWeekyear_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setWeekOfWeekyear(2);
        assertEquals("2002-01-13T05:06:07.008Z", test.toString());
    }

    @Test public void testSetWeekOfWeekyear_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setWeekOfWeekyear(53);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDayOfWeek_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setDayOfWeek(5);
NoAssert.donothing("2002-06-07T05:06:07.008+01:00", test.toString());
    }

    @Test public void testSetDayOfWeek_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setDayOfWeek(8);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetHourOfDay_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setHourOfDay(13);
        assertEquals("2002-06-09T13:06:07.008+01:00", test.toString());
    }

    @Test public void testSetHourOfDay_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setHourOfDay(24);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMinuteOfHour_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setMinuteOfHour(13);
        assertEquals("2002-06-09T05:13:07.008+01:00", test.toString());
    }

    @Test public void testSetMinuteOfHour_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setMinuteOfHour(60);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMinuteOfDay_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setMinuteOfDay(13);
        assertEquals("2002-06-09T00:13:07.008+01:00", test.toString());
    }

    @Test public void testSetMinuteOfDay_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setMinuteOfDay(24 * 60);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetSecondOfMinute_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setSecondOfMinute(13);
NoAssert.donothing("2002-06-09T05:06:13.008+01:00", test.toString());
    }

    @Test public void testSetSecondOfMinute_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setSecondOfMinute(60);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetSecondOfDay_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setSecondOfDay(13);
NoAssert.donothing("2002-06-09T00:00:13.008+01:00", test.toString());
    }

    @Test public void testSetSecondOfDay_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setSecondOfDay(24 * 60 * 60);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMilliOfSecond_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setMillisOfSecond(13);
NoAssert.donothing("2002-06-09T05:06:07.013+01:00", test.toString());
    }

    @Test public void testSetMilliOfSecond_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setMillisOfSecond(1000);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMilliOfDay_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setMillisOfDay(13);
        assertEquals("2002-06-09T00:00:00.013+01:00", test.toString());
    }

    @Test public void testSetMilliOfDay_int2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setMillisOfDay(24 * 60 * 60 * 1000);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing("2002-06-09T05:06:07.008+01:00", test.toString());
    }

}
