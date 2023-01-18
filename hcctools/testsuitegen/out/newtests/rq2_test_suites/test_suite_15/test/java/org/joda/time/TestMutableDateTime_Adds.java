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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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
        TestMutableDateTime_Adds TB= new TestMutableDateTime_Adds();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testAdd_long1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RD1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RD2(); TB.tearDown();
        TB.setUp(); TB.testAdd_RD_int1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RD_int2(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP2(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP_int1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP_int2(); TB.tearDown();
        TB.setUp(); TB.testAdd_DurationFieldType_int1(); TB.tearDown();
        TB.setUp(); TB.testAdd_DurationFieldType_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAdd_DurationFieldType_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAdd_DurationFieldType_int2(); TB.tearDown();
        TB.setUp(); TB.testAdd_DurationFieldType_int3(); TB.tearDown();
        TB.setUp(); TB.testAddYears_int1(); TB.tearDown();
        TB.setUp(); TB.testAddYears_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddYears_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddMonths_int1(); TB.tearDown();
        TB.setUp(); TB.testAddMonths_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddMonths_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddDays_int1(); TB.tearDown();
        TB.setUp(); TB.testAddDays_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddDays_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddWeekyears_int1(); TB.tearDown();
        TB.setUp(); TB.testAddWeeks_int1(); TB.tearDown();
        TB.setUp(); TB.testAddWeeks_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddWeeks_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddHours_int1(); TB.tearDown();
        TB.setUp(); TB.testAddHours_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddHours_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddMinutes_int1(); TB.tearDown();
        TB.setUp(); TB.testAddMinutes_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddMinutes_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddSeconds_int1(); TB.tearDown();
        TB.setUp(); TB.testAddSeconds_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddSeconds_int_dstOverlapWinter_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddMillis_int1(); TB.tearDown();
        TB.setUp(); TB.testAddMillis_int_dstOverlapSummer_addZero(); TB.tearDown();
        TB.setUp(); TB.testAddMillis_int_dstOverlapWinter_addZero(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Adds.class);
    }

    public TestMutableDateTime_Adds(String name) {
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
    @Test public void testAdd_long1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add(123456L);
NoAssert.donothing(TEST_TIME1 + 123456L, test.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_RD1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add(new Duration(123456L));
NoAssert.donothing(TEST_TIME1 + 123456L, test.getMillis());
    }

    @Test public void testAdd_RD2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add((ReadableDuration) null);
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_RD_int1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add(new Duration(123456L), -2);
NoAssert.donothing(TEST_TIME1 - (2L * 123456L), test.getMillis());
    }

    @Test public void testAdd_RD_int2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add((ReadableDuration) null, 1);
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_RP1() {
        Period d = new Period(1, 1, 0, 1, 1, 1, 1, 1);
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
        test.add(d);
NoAssert.donothing("2003-07-10T06:07:08.009+01:00", test.toString());
    }

    @Test public void testAdd_RP2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add((ReadablePeriod) null);
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_RP_int1() {
        Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2);
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add(d, -2);
NoAssert.donothing(TEST_TIME1 - (2L * 1002L), test.getMillis());
    }

    @Test public void testAdd_RP_int2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add((ReadablePeriod) null, 1);
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_DurationFieldType_int1() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        test.add(DurationFieldType.years(), 8);
NoAssert.donothing(2010, test.getYear());
    }

    @Test public void testAdd_DurationFieldType_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.add(DurationFieldType.years(), 0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAdd_DurationFieldType_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        test.add(DurationFieldType.years(), 0);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    @Test public void testAdd_DurationFieldType_int2() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        try {
            test.add((DurationFieldType) null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    @Test public void testAdd_DurationFieldType_int3() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        try {
            test.add((DurationFieldType) null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddYears_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addYears(8);
NoAssert.donothing("2010-06-09T05:06:07.008+01:00", test.toString());
    }

    @Test public void testAddYears_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addYears(0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddYears_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addYears(0);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddMonths_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addMonths(6);
        assertEquals("2002-12-09T05:06:07.008Z", test.toString());
    }

    @Test public void testAddMonths_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addMonths(0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddMonths_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addMonths(0);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddDays_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addDays(17);
NoAssert.donothing("2002-06-26T05:06:07.008+01:00", test.toString());
    }

    @Test public void testAddDays_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addDays(0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddDays_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addDays(0);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddWeekyears_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addWeekyears(-1);
        assertEquals("2001-06-10T05:06:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddWeeks_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addWeeks(-21);
NoAssert.donothing("2002-01-13T05:06:07.008Z", test.toString());
    }

    @Test public void testAddWeeks_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addWeeks(0);
        assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddWeeks_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addWeeks(0);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddHours_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addHours(13);
NoAssert.donothing("2002-06-09T18:06:07.008+01:00", test.toString());
    }

    @Test public void testAddHours_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addHours(0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddHours_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addHours(0);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddMinutes_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addMinutes(13);
NoAssert.donothing("2002-06-09T05:19:07.008+01:00", test.toString());
    }

    @Test public void testAddMinutes_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addMinutes(0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddMinutes_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
        assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addMinutes(0);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddSeconds_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addSeconds(13);
NoAssert.donothing("2002-06-09T05:06:20.008+01:00", test.toString());
    }

    @Test public void testAddSeconds_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addSeconds(0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddSeconds_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addSeconds(0);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddMillis_int1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.addMillis(13);
NoAssert.donothing("2002-06-09T05:06:07.021+01:00", test.toString());
    }

    @Test public void testAddMillis_int_dstOverlapSummer_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
        test.addMillis(0);
NoAssert.donothing("2011-10-30T02:30:00.000+02:00", test.toString());
    }

    @Test public void testAddMillis_int_dstOverlapWinter_addZero() {
        MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        test.addHours(1);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
        test.addMillis(0);
NoAssert.donothing("2011-10-30T02:30:00.000+01:00", test.toString());
    }

}
