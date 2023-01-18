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

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Updates  { //extends TestCase {
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
        TestMutablePeriod_Updates TB= new TestMutablePeriod_Updates();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testClear(); TB.tearDown();
        TB.setUp(); TB.testAddYears(); TB.tearDown();
        TB.setUp(); TB.testAddMonths(); TB.tearDown();
        TB.setUp(); TB.testAddWeeks(); TB.tearDown();
        TB.setUp(); TB.testAddDays(); TB.tearDown();
        TB.setUp(); TB.testAddHours(); TB.tearDown();
        TB.setUp(); TB.testAddMinutes(); TB.tearDown();
        TB.setUp(); TB.testAddSeconds(); TB.tearDown();
        TB.setUp(); TB.testAddMillis(); TB.tearDown();
        TB.setUp(); TB.testSetYears(); TB.tearDown();
        TB.setUp(); TB.testSetMonths(); TB.tearDown();
        TB.setUp(); TB.testSetWeeks(); TB.tearDown();
        TB.setUp(); TB.testSetDays(); TB.tearDown();
        TB.setUp(); TB.testSetHours(); TB.tearDown();
        TB.setUp(); TB.testSetMinutes(); TB.tearDown();
        TB.setUp(); TB.testSetSeconds(); TB.tearDown();
        TB.setUp(); TB.testSetMillis(); TB.tearDown();
        TB.setUp(); TB.testSet_Field(); TB.tearDown();
        TB.setUp(); TB.testAdd_Field(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_8ints1(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_8ints2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_8ints3(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_8ints4(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RP1(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RP2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RP3(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RP4(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RP5(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long1(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long3(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoYears(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoMonths(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoWeeks(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoDays(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoHours(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoMinutes(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoSeconds(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long_long_NoMillis(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RI_RI1(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RI_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RI_RI3(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RInterval1(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RInterval2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long1(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_long2(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long3(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long4(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoYears(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoMonths(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoWeeks(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoDays(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoHours(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoMinutes(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoSeconds(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoMillis(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RD1(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RD2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriod_RD3(); TB.tearDown();
        TB.setUp(); TB.testAdd_8ints1(); TB.tearDown();
        TB.setUp(); TB.testAdd_8ints2(); TB.tearDown();
        TB.setUp(); TB.testAdd_long1(); TB.tearDown();
        TB.setUp(); TB.testAdd_long2(); TB.tearDown();
        TB.setUp(); TB.testAdd_long3(); TB.tearDown();
        TB.setUp(); TB.testAdd_long_Chronology1(); TB.tearDown();
        TB.setUp(); TB.testAdd_long_Chronology2(); TB.tearDown();
        TB.setUp(); TB.testAdd_long_Chronology3(); TB.tearDown();
        TB.setUp(); TB.testAdd_RD1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RD2(); TB.tearDown();
        TB.setUp(); TB.testAdd_RD3(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP2(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP3(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP4(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP5(); TB.tearDown();
        TB.setUp(); TB.testAdd_RP6(); TB.tearDown();
        TB.setUp(); TB.testAdd_RInterval1(); TB.tearDown();
        TB.setUp(); TB.testAdd_RInterval2(); TB.tearDown();
        TB.setUp(); TB.testAdd_RInterval3(); TB.tearDown();
        TB.setUp(); TB.testAdd_RInterval4(); TB.tearDown();
        TB.setUp(); TB.testAdd_RInterval5(); TB.tearDown();
        TB.setUp(); TB.testMergePeriod_RP1(); TB.tearDown();
        TB.setUp(); TB.testMergePeriod_RP2(); TB.tearDown();
        TB.setUp(); TB.testMergePeriod_RP3(); TB.tearDown();
        TB.setUp(); TB.testMergePeriod_RP4(); TB.tearDown();
        TB.setUp(); TB.testMergePeriod_RP5(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutablePeriod_Updates.class);
    }

    public TestMutablePeriod_Updates(String name) {
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
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testClear() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.clear();
NoAssert.donothing(new MutablePeriod(), test);
        
        test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        test.clear();
NoAssert.donothing(new MutablePeriod(PeriodType.yearMonthDayTime()), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testAddYears() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addYears(10);
NoAssert.donothing(11, test.getYears());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addYears(-10);
NoAssert.donothing(-9, test.getYears());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addYears(0);
NoAssert.donothing(1, test.getYears());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddMonths() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMonths(10);
NoAssert.donothing(12, test.getMonths());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMonths(-10);
NoAssert.donothing(-8, test.getMonths());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMonths(0);
NoAssert.donothing(2, test.getMonths());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddWeeks() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addWeeks(10);
NoAssert.donothing(13, test.getWeeks());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addWeeks(-10);
NoAssert.donothing(-7, test.getWeeks());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addWeeks(0);
NoAssert.donothing(3, test.getWeeks());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddDays() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addDays(10);
NoAssert.donothing(14, test.getDays());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addDays(-10);
NoAssert.donothing(-6, test.getDays());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addDays(0);
NoAssert.donothing(4, test.getDays());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddHours() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addHours(10);
NoAssert.donothing(15, test.getHours());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addHours(-10);
NoAssert.donothing(-5, test.getHours());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addHours(0);
NoAssert.donothing(5, test.getHours());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddMinutes() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMinutes(10);
NoAssert.donothing(16, test.getMinutes());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMinutes(-10);
NoAssert.donothing(-4, test.getMinutes());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMinutes(0);
NoAssert.donothing(6, test.getMinutes());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddSeconds() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addSeconds(10);
NoAssert.donothing(17, test.getSeconds());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addSeconds(-10);
NoAssert.donothing(-3, test.getSeconds());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addSeconds(0);
NoAssert.donothing(7, test.getSeconds());
    }

    //-----------------------------------------------------------------------
    @Test public void testAddMillis() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMillis(10);
NoAssert.donothing(18, test.getMillis());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMillis(-10);
        assertEquals(-2, test.getMillis());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.addMillis(0);
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetYears() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setYears(10);
NoAssert.donothing(10, test.getYears());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setYears(-10);
NoAssert.donothing(-10, test.getYears());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setYears(0);
NoAssert.donothing(0, test.getYears());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setYears(1);
NoAssert.donothing(1, test.getYears());
        
        test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis());
        try {
            test.setYears(1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMonths() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMonths(10);
NoAssert.donothing(10, test.getMonths());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMonths(-10);
        assertEquals(-10, test.getMonths());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMonths(0);
NoAssert.donothing(0, test.getMonths());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMonths(2);
NoAssert.donothing(2, test.getMonths());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetWeeks() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setWeeks(10);
NoAssert.donothing(10, test.getWeeks());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setWeeks(-10);
NoAssert.donothing(-10, test.getWeeks());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setWeeks(0);
        assertEquals(0, test.getWeeks());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setWeeks(3);
NoAssert.donothing(3, test.getWeeks());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDays() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setDays(10);
NoAssert.donothing(10, test.getDays());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setDays(-10);
NoAssert.donothing(-10, test.getDays());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setDays(0);
NoAssert.donothing(0, test.getDays());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setDays(4);
NoAssert.donothing(4, test.getDays());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetHours() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setHours(10);
NoAssert.donothing(10, test.getHours());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setHours(-10);
NoAssert.donothing(-10, test.getHours());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setHours(0);
NoAssert.donothing(0, test.getHours());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setHours(5);
NoAssert.donothing(5, test.getHours());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMinutes() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMinutes(10);
NoAssert.donothing(10, test.getMinutes());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMinutes(-10);
NoAssert.donothing(-10, test.getMinutes());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMinutes(0);
NoAssert.donothing(0, test.getMinutes());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMinutes(6);
NoAssert.donothing(6, test.getMinutes());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetSeconds() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setSeconds(10);
NoAssert.donothing(10, test.getSeconds());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setSeconds(-10);
        assertEquals(-10, test.getSeconds());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setSeconds(0);
NoAssert.donothing(0, test.getSeconds());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setSeconds(7);
NoAssert.donothing(7, test.getSeconds());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetMillis() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMillis(10);
NoAssert.donothing(10, test.getMillis());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMillis(-10);
NoAssert.donothing(-10, test.getMillis());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMillis(0);
NoAssert.donothing(0, test.getMillis());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setMillis(8);
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSet_Field() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.set(DurationFieldType.years(), 10);
NoAssert.donothing(10, test.getYears());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        try {
            test.set(null, 10);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_Field() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.add(DurationFieldType.years(), 10);
NoAssert.donothing(11, test.getYears());
        
        test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis());
        test.add(DurationFieldType.years(), 0);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(1, test.getMillis());
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        try {
            test.add(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        try {
            test.add(null, 10);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriod_8ints1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
NoAssert.donothing(11, test.getYears());
NoAssert.donothing(12, test.getMonths());
NoAssert.donothing(13, test.getWeeks());
        assertEquals(14, test.getDays());
NoAssert.donothing(15, test.getHours());
NoAssert.donothing(16, test.getMinutes());
NoAssert.donothing(17, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    @Test public void testSetPeriod_8ints2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        try {
            test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
        assertEquals(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testSetPeriod_8ints3() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        test.setPeriod(0, 0, 0, 0, 0, 0, 0, 18);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    @Test public void testSetPeriod_8ints4() {
        MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
NoAssert.donothing(11, test.getYears());
NoAssert.donothing(12, test.getMonths());
NoAssert.donothing(13, test.getWeeks());
NoAssert.donothing(14, test.getDays());
NoAssert.donothing(15, test.getHours());
NoAssert.donothing(16, test.getMinutes());
NoAssert.donothing(17, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriod_RP1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
        assertEquals(11, test.getYears());
NoAssert.donothing(12, test.getMonths());
NoAssert.donothing(13, test.getWeeks());
NoAssert.donothing(14, test.getDays());
NoAssert.donothing(15, test.getHours());
NoAssert.donothing(16, test.getMinutes());
NoAssert.donothing(17, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    @Test public void testSetPeriod_RP2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        try {
            test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testSetPeriod_RP3() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        test.setPeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    @Test public void testSetPeriod_RP4() {
        MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
NoAssert.donothing(11, test.getYears());
NoAssert.donothing(12, test.getMonths());
NoAssert.donothing(13, test.getWeeks());
NoAssert.donothing(14, test.getDays());
NoAssert.donothing(15, test.getHours());
NoAssert.donothing(16, test.getMinutes());
NoAssert.donothing(17, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    @Test public void testSetPeriod_RP5() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setPeriod((ReadablePeriod) null);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
        assertEquals(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriod_long_long1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long2() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt2.getMillis(), dt1.getMillis());
NoAssert.donothing(-1, test.getYears());
NoAssert.donothing(-1, test.getMonths());
NoAssert.donothing(-1, test.getWeeks());
NoAssert.donothing(-1, test.getDays());
NoAssert.donothing(-1, test.getHours());
NoAssert.donothing(-1, test.getMinutes());
NoAssert.donothing(-1, test.getSeconds());
NoAssert.donothing(-1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long3() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        test.setPeriod(dt1.getMillis(), dt1.getMillis());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoYears() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withYearsRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(0, test.getYears());
        assertEquals(13, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
        assertEquals(1, test.getDays());
        assertEquals(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoMonths() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withMonthsRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(5, test.getWeeks());
NoAssert.donothing(3, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoWeeks() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withWeeksRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(8, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoDays() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withDaysRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
        assertEquals(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(25, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoHours() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withHoursRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(61, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
        assertEquals(1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoMinutes() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(61, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoSeconds() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withSecondsRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
        assertEquals(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(1001, test.getMillis());
    }

    @Test public void testSetPeriod_long_long_NoMillis() {
        MutablePeriod test = new MutablePeriod(PeriodType.standard().withMillisRemoved());
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriod_RI_RI1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt1, dt2);
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_RI_RI2() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(dt2, dt1);
NoAssert.donothing(-1, test.getYears());
NoAssert.donothing(-1, test.getMonths());
NoAssert.donothing(-1, test.getWeeks());
NoAssert.donothing(-1, test.getDays());
NoAssert.donothing(-1, test.getHours());
        assertEquals(-1, test.getMinutes());
NoAssert.donothing(-1, test.getSeconds());
        assertEquals(-1, test.getMillis());
    }

    @Test public void testSetPeriod_RI_RI3() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        test.setPeriod(dt1, dt1);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
        assertEquals(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
        assertEquals(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriod_RInterval1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        test.setPeriod(new Interval(dt1, dt2));
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testSetPeriod_RInterval2() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setPeriod((ReadableInterval) null);
        assertEquals(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriod_long1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setPeriod(100L);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testSetPeriod_long2() {
        MutablePeriod test = new MutablePeriod();
        test.setPeriod(
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
        // only time fields are precise
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((450 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
        assertEquals(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

//    @Test public void testSetPeriod_long3() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    @Test public void testSetPeriod_long4() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(12, test.getWeeks());
//        assertEquals(1, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoYears() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withYearsRemoved());
//        test.setPeriod(ms);
//        assertEquals(0, test.getYears());
//        assertEquals(15, test.getMonths()); // totalDays=365+85=450=15*30
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoMonths() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMonthsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoWeeks() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType().withWeeksRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoDays() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withDaysRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5 + 25 * 24, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoHours() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withHoursRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(0, test.getHours());
//        assertEquals(6 + 5 * 60, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoMinutes() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMinutesRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(0, test.getMinutes());
//        assertEquals(7 + 6 * 60, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoSeconds() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withSecondsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(0, test.getSeconds());
//        assertEquals(8 + 7 * 1000, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoMillis() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMillisRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(0, test.getMillis());
//        assertEquals(ms - 8, test.toDurationMillis());
//    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriod_RD1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setPeriod(new Duration(100L));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testSetPeriod_RD2() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        test.setPeriod(new Duration(length));
        // only time fields are precise
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((450 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testSetPeriod_RD3() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.setPeriod((ReadableDuration) null);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_8ints1() {
        MutablePeriod test = new MutablePeriod(100L);
        test.add(1, 2, 3, 4, 5, 6, 7, 8);
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(108, test.getMillis());
    }

    @Test public void testAdd_8ints2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        try {
            test.add(1, 2, 3, 4, 5, 6, 7, 8);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(0, test.getYears());
        assertEquals(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_long1() {
        MutablePeriod test = new MutablePeriod(100L);
        test.add(100L);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(200, test.getMillis());
    }

    @Test public void testAdd_long2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        long ms =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        test.add(ms);
        // only time fields are precise
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
NoAssert.donothing(0, test.getMonths());
        assertEquals(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((450 * 24) + 5, test.getHours());
        assertEquals(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(108, test.getMillis());
    }

    @Test public void testAdd_long3() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.add(2100L);
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(9, test.getSeconds());
NoAssert.donothing(108, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_long_Chronology1() {
        MutablePeriod test = new MutablePeriod(100L);
        test.add(100L, ISOChronology.getInstance());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(200, test.getMillis());
    }

    @Test public void testAdd_long_Chronology2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        long ms =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        test.add(ms, ISOChronology.getInstance());
        // only time fields are precise
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450 days
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
        assertEquals((450 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(108, test.getMillis());
    }

    @Test public void testAdd_long_Chronology3() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        long ms =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        test.add(ms, ISOChronology.getInstanceUTC());
        // UTC, so weeks and day also precise
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450 days
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(64, test.getWeeks());
NoAssert.donothing(2, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
        assertEquals(108, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_RD1() {
        MutablePeriod test = new MutablePeriod(100L);
        test.add(new Duration(100L));
        assertEquals(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(200, test.getMillis());
    }

    @Test public void testAdd_RD2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        long ms =
            (4L + (3L * 7L)) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        test.add(new Duration(ms));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((4 + (3 * 7)) * 24 + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(108, test.getMillis());
    }

    @Test public void testAdd_RD3() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.add((ReadableDuration) null);
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
NoAssert.donothing(5, test.getHours());
        assertEquals(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_RP1() {
        MutablePeriod test = new MutablePeriod(100L);
        test.add(new Period(100L));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(200, test.getMillis());
    }

    @Test public void testAdd_RP2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());  // All type
        test.add(new Period(1, 2, 3, 4, 5, 6, 7, 0, PeriodType.standard().withMillisRemoved()));
        // add field value, ignore different types
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testAdd_RP3() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        test.add(new Period(0L));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
        assertEquals(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testAdd_RP4() {
        MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        try {
            test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8));  // cannot set weeks
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
        assertEquals(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testAdd_RP5() {
        MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        test.add(new Period(1, 2, 0, 4, 5, 6, 7, 8));  // can set weeks as zero
NoAssert.donothing(2, test.getYears());
NoAssert.donothing(4, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(8, test.getDays());
NoAssert.donothing(10, test.getHours());
NoAssert.donothing(12, test.getMinutes());
NoAssert.donothing(14, test.getSeconds());
        assertEquals(16, test.getMillis());
    }

    @Test public void testAdd_RP6() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.add((ReadablePeriod) null);
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testAdd_RInterval1() {
        MutablePeriod test = new MutablePeriod(100L);
        test.add(new Interval(100L, 200L));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
        assertEquals(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(200, test.getMillis());
    }

    @Test public void testAdd_RInterval2() {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 12, 18, 0, 0, 0, 8);
        MutablePeriod test = new MutablePeriod(100L);  // All type
        test.add(new Interval(dt1, dt2));
NoAssert.donothing(1, test.getYears());  // add field value from interval
NoAssert.donothing(6, test.getMonths());  // add field value from interval
NoAssert.donothing(1, test.getWeeks());  // add field value from interval
NoAssert.donothing(2, test.getDays());  // add field value from interval
NoAssert.donothing(0, test.getHours());  // time zone OK
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
        assertEquals(108, test.getMillis());
    }

    @Test public void testAdd_RInterval3() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        test.add(new Interval(0L, 0L));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testAdd_RInterval4() {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 17, 0, 0, 0, 8);
        MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        test.add(new Interval(dt1, dt2));
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
        assertEquals(0, test.getWeeks());  // no weeks
NoAssert.donothing(8, test.getDays());  // week added to days
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(108, test.getMillis());
    }

    @Test public void testAdd_RInterval5() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.add((ReadableInterval) null);
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
        assertEquals(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testMergePeriod_RP1() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.mergePeriod(new MutablePeriod(0, 0, 0, 14, 15, 16, 17, 18, PeriodType.dayTime()));
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(14, test.getDays());
NoAssert.donothing(15, test.getHours());
NoAssert.donothing(16, test.getMinutes());
NoAssert.donothing(17, test.getSeconds());
        assertEquals(18, test.getMillis());
    }

    @Test public void testMergePeriod_RP2() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        try {
            test.mergePeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(100, test.getMillis());
    }

    @Test public void testMergePeriod_RP3() {
        MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18));
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
        assertEquals(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    @Test public void testMergePeriod_RP4() {
        MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        test.mergePeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
NoAssert.donothing(11, test.getYears());
NoAssert.donothing(12, test.getMonths());
NoAssert.donothing(13, test.getWeeks());
NoAssert.donothing(14, test.getDays());
NoAssert.donothing(15, test.getHours());
NoAssert.donothing(16, test.getMinutes());
NoAssert.donothing(17, test.getSeconds());
NoAssert.donothing(18, test.getMillis());
    }

    @Test public void testMergePeriod_RP5() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        test.mergePeriod((ReadablePeriod) null);
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
        assertEquals(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

}