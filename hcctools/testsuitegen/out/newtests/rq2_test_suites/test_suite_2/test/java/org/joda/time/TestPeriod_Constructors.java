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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
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
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Throwable {
        TestPeriod_Constructors TB= new TestPeriod_Constructors();
        TB.setUp(); TB.testConstants(); TB.tearDown();
        TB.setUp(); TB.testParse_noFormatter(); TB.tearDown();
        TB.setUp(); TB.testConstructor1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_fixedZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_Chronology1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_Chronology2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_Chronology3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType_Chronology1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType_Chronology2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType_Chronology3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_PeriodType_Chronology4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_4int1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_8int1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_8int__PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_8int__PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_8int__PeriodType3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_PeriodType3(); TB.tearDown();
        TB.setUp(); TB.testToPeriod_PeriodType3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_Chronology1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_Chronology2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_PeriodType_Chronology1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_PeriodType_Chronology2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI7(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_PeriodType3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_PeriodType4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_PeriodType5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP2Local(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP7(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP8(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType2Local(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType7(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RP_PeriodType8(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_PeriodType3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_PeriodType4(); TB.tearDown();
        TB.setUp(); TB.testFactoryYears(); TB.tearDown();
        TB.setUp(); TB.testFactoryMonths(); TB.tearDown();
        TB.setUp(); TB.testFactoryWeeks(); TB.tearDown();
        TB.setUp(); TB.testFactoryDays(); TB.tearDown();
        TB.setUp(); TB.testFactoryHours(); TB.tearDown();
        TB.setUp(); TB.testFactoryMinutes(); TB.tearDown();
        TB.setUp(); TB.testFactorySeconds(); TB.tearDown();
        TB.setUp(); TB.testFactoryMillis(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toFeb_standardYear(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toFeb_leapYear(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toFeb_standardYear(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toFeb_leapYear(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2(); TB.tearDown();
        TB.setUp(); TB.testFactoryFieldDifference1(); TB.tearDown();
        TB.setUp(); TB.testFactoryFieldDifference2(); TB.tearDown();
        TB.setUp(); TB.testFactoryFieldDifference3(); TB.tearDown();
        TB.setUp(); TB.testFactoryFieldDifference4(); TB.tearDown();
        TB.setUp(); TB.testFactoryFieldDifference5(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriod_Constructors.class);
    }

    public TestPeriod_Constructors(String name) {
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
    @Test public void testConstants() throws Throwable {
        Period test = Period.ZERO;
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
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
    @Test public void testParse_noFormatter() throws Throwable {
NoAssert.donothing(new Period(1, 2, 3, 4, 5, 6, 7, 890), Period.parse("P1Y2M3W4DT5H6M7.890S"));
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor1() throws Throwable {
        Period test = new Period();
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
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
    @Test public void testConstructor_long1() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
        assertEquals(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
        assertEquals(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long2() throws Throwable {
        long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long3() throws Throwable {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Period test = new Period(length);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
        // only time fields are precise in AllType
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((450 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long_fixedZone() throws Throwable {
        DateTimeZone zone = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.forOffsetHours(2));
            long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                5L * DateTimeConstants.MILLIS_PER_HOUR +
                6L * DateTimeConstants.MILLIS_PER_MINUTE +
                7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            Period test = new Period(length);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
            // only time fields are precise in AllType
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((450 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
        } finally {
            DateTimeZone.setDefault(zone);
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_PeriodType1() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, (PeriodType) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long_PeriodType2() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, PeriodType.millis());
NoAssert.donothing(PeriodType.millis(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(length, test.getMillis());
    }

    @Test public void testConstructor_long_PeriodType3() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, PeriodType.dayTime());
NoAssert.donothing(PeriodType.dayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
        assertEquals(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long_PeriodType4() throws Throwable {
        long length =
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, PeriodType.standard().withMillisRemoved());
NoAssert.donothing(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_Chronology1() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, ISOChronology.getInstance());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long_Chronology2() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, ISOChronology.getInstanceUTC());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
        assertEquals(8, test.getMillis());
    }

    @Test public void testConstructor_long_Chronology3() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, (Chronology) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_PeriodType_Chronology1() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, PeriodType.time().withMillisRemoved(), ISOChronology.getInstance());
NoAssert.donothing(PeriodType.time().withMillisRemoved(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_long_PeriodType_Chronology2() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, PeriodType.standard(), ISOChronology.getInstanceUTC());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(4, test.getDays());
        assertEquals(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long_PeriodType_Chronology3() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, PeriodType.standard(), (Chronology) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_long_PeriodType_Chronology4() throws Throwable {
        long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        Period test = new Period(length, (PeriodType) null, (Chronology) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((4 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    @Test public void testConstructor_4int1() throws Throwable {
        Period test = new Period(5, 6, 7, 8);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    @Test public void testConstructor_8int1() throws Throwable {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
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
    /**
     * Test constructor (8ints)
     */
    @Test public void testConstructor_8int__PeriodType1() throws Throwable {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_8int__PeriodType2() throws Throwable {
        Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.dayTime());
NoAssert.donothing(PeriodType.dayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    @Test public void testConstructor_8int__PeriodType3() throws Throwable {
        try {
            new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.dayTime());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_long1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_long_long2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        Period test = new Period(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_long_PeriodType1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_long_long_PeriodType2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime());
NoAssert.donothing(PeriodType.dayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(31, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_long_long_PeriodType3() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.standard().withMillisRemoved());
NoAssert.donothing(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testToPeriod_PeriodType3() {
        DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        DateTime dt2 = new DateTime(2005, 6, 9, 12, 14, 16, 18);
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.yearWeekDayTime());
        
NoAssert.donothing(PeriodType.yearWeekDayTime(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());  // tests using years and not weekyears
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_long_Chronology1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_long_long_Chronology2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_long_PeriodType_Chronology1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance());
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance());
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, CopticChronology.getInstance());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_long_long_PeriodType_Chronology2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1.getMillis(), dt2.getMillis(), (PeriodType) null, null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RI_RI1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RI2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RI3() throws Throwable {
        DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(3, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
        assertEquals(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RI4() throws Throwable {
        DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(-3, test.getYears());
NoAssert.donothing(-1, test.getMonths());
NoAssert.donothing(-1, test.getWeeks());
NoAssert.donothing(-1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(-1, test.getMinutes());
NoAssert.donothing(-1, test.getSeconds());
NoAssert.donothing(-1, test.getMillis());
    }

    @Test public void testConstructor_RI_RI5() throws Throwable {
        DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_RI_RI6() throws Throwable {
        DateTimeZone zone = PARIS;
        DateTime dt1 = new DateTime(2013, 10, 27, 2, 0, 0, zone).withLaterOffsetAtOverlap();
        DateTime dt2 = new DateTime(2013, 10, 27, 2, 15, 0, zone).withLaterOffsetAtOverlap();
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(15, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_RI_RI7() throws Throwable {
        DateTimeZone zone = PARIS;
        DateTime dt1 = new DateTime(2013, 10, 27, 2, 0, 0, zone).withEarlierOffsetAtOverlap();
        DateTime dt2 = new DateTime(2013, 10, 27, 2, 15, 0, zone).withLaterOffsetAtOverlap();
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(15, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RI_RI_PeriodType1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1, dt2, null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RI_PeriodType2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1);
        Period test = new Period(dt1, dt2, PeriodType.dayTime());
NoAssert.donothing(PeriodType.dayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(31, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RI_PeriodType3() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2004, 6, 9, 1, 1, 1, 1);
        Period test = new Period(dt1, dt2, PeriodType.standard().withMillisRemoved());
NoAssert.donothing(PeriodType.standard().withMillisRemoved(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_RI_RI_PeriodType4() throws Throwable {
        DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        Period test = new Period(dt1, dt2, PeriodType.standard());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(3, test.getYears());
        assertEquals(1, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
        assertEquals(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RI_PeriodType5() throws Throwable {
        DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        Period test = new Period(dt1, dt2, PeriodType.standard());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
        assertEquals(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP1() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        YearMonthDay dt2 = new YearMonthDay(2005, 7, 10);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP2() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        YearMonthDay dt2 = new YearMonthDay(2005, 5, 17);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(11, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_RP_RP2Local() throws Throwable {
        LocalDate dt1 = new LocalDate(2004, 6, 9);
        LocalDate dt2 = new LocalDate(2005, 5, 17);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(11, test.getMonths());
NoAssert.donothing(1, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP3() throws Throwable {
        YearMonthDay dt1 = null;
        YearMonthDay dt2 = new YearMonthDay(2005, 7, 17);
        try {
            new Period(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP4() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        YearMonthDay dt2 = null;
        try {
            new Period(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP5() throws Throwable {
        YearMonthDay dt1 = null;
        YearMonthDay dt2 = null;
        try {
            new Period(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP6() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40);
        try {
            new Period(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_RP_RP7() throws Throwable {
        Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12);
        Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        try {
            new Period(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_RP_RP8() throws Throwable {
        Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12);
        Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        try {
            new Period(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP_PeriodType1() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        YearMonthDay dt2 = new YearMonthDay(2005, 7, 10);
        Period test = new Period(dt1, dt2, PeriodType.standard());
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP_PeriodType2() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2004, 6, 9);
        YearMonthDay dt2 = new YearMonthDay(2005, 5, 17);
        Period test = new Period(dt1, dt2, PeriodType.yearMonthDay());
NoAssert.donothing(PeriodType.yearMonthDay(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(11, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(8, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_RP_RP_PeriodType2Local() throws Throwable {
        LocalDate dt1 = new LocalDate(2004, 6, 9);
        LocalDate dt2 = new LocalDate(2005, 5, 17);
        Period test = new Period(dt1, dt2, PeriodType.yearMonthDay());
NoAssert.donothing(PeriodType.yearMonthDay(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(11, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(8, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP_PeriodType3() throws Throwable {
        YearMonthDay dt1 = null;
        YearMonthDay dt2 = new YearMonthDay(2005, 7, 17);
        try {
            new Period(dt1, dt2, PeriodType.standard());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP_PeriodType4() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        YearMonthDay dt2 = null;
        try {
            new Period(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP_PeriodType5() throws Throwable {
        YearMonthDay dt1 = null;
        YearMonthDay dt2 = null;
        try {
            new Period(dt1, dt2, PeriodType.standard());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testConstructor_RP_RP_PeriodType6() throws Throwable {
        YearMonthDay dt1 = new YearMonthDay(2005, 7, 17);
        TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40);
        try {
            new Period(dt1, dt2, PeriodType.standard());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_RP_RP_PeriodType7() throws Throwable {
        Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12);
        Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        try {
            new Period(dt1, dt2, PeriodType.standard());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_RP_RP_PeriodType8() throws Throwable {
        Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12);
        Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14);
        try {
            new Period(dt1, dt2, PeriodType.standard());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RI_RD1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Duration dur = new Interval(dt1, dt2).toDuration();
        Period test = new Period(dt1, dur);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RD2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Duration dur = null;
        Period test = new Period(dt1, dur);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
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
    @Test public void testConstructor_RI_RD_PeriodType1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Duration dur = new Interval(dt1, dt2).toDuration();
        Period test = new Period(dt1, dur, PeriodType.yearDayTime());
NoAssert.donothing(PeriodType.yearDayTime(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(31, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RI_RD_PeriodType2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Duration dur = null;
        Period test = new Period(dt1, dur, (PeriodType) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
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
    @Test public void testConstructor_RD_RI1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Duration dur = new Interval(dt1, dt2).toDuration();
        Period test = new Period(dur, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RD_RI2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Duration dur = null;
        Period test = new Period(dur, dt1);
        assertEquals(PeriodType.standard(), test.getPeriodType());
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
    @Test public void testConstructor_RD_RI_PeriodType1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Duration dur = new Interval(dt1, dt2).toDuration();
        Period test = new Period(dur, dt2, PeriodType.yearDayTime());
NoAssert.donothing(PeriodType.yearDayTime(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(31, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    @Test public void testConstructor_RD_RI_PeriodType2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Duration dur = null;
        Period test = new Period(dur, dt1, (PeriodType) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
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
    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_Object1() throws Throwable {
        Period test = new Period("P1Y2M3D");
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(3, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
        assertEquals(0, test.getMillis());
    }

    @Test public void testConstructor_Object2() throws Throwable {
        Period test = new Period((Object) null);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_Object3() throws Throwable {
        Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()));
NoAssert.donothing(PeriodType.dayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(2, test.getMinutes());
NoAssert.donothing(3, test.getSeconds());
NoAssert.donothing(4, test.getMillis());
    }

    @Test public void testConstructor_Object4() throws Throwable {
        Period base = new Period(1, 1, 0, 1, 1, 1, 1, 1, PeriodType.standard());
        Period test = new Period(base);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(1, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(1, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(1, test.getMinutes());
NoAssert.donothing(1, test.getSeconds());
NoAssert.donothing(1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_Object_PeriodType1() throws Throwable {
        Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime());
NoAssert.donothing(PeriodType.yearMonthDayTime(), test.getPeriodType());
NoAssert.donothing(1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(3, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_Object_PeriodType2() throws Throwable {
        Period test = new Period((Object) null, PeriodType.yearMonthDayTime());
NoAssert.donothing(PeriodType.yearMonthDayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testConstructor_Object_PeriodType3() throws Throwable {
        Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime());
NoAssert.donothing(PeriodType.yearMonthDayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
        assertEquals(1, test.getHours());
NoAssert.donothing(2, test.getMinutes());
NoAssert.donothing(3, test.getSeconds());
NoAssert.donothing(4, test.getMillis());
    }

    @Test public void testConstructor_Object_PeriodType4() throws Throwable {
        Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), (PeriodType) null);
NoAssert.donothing(PeriodType.dayTime(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(1, test.getHours());
NoAssert.donothing(2, test.getMinutes());
NoAssert.donothing(3, test.getSeconds());
        assertEquals(4, test.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactoryYears() throws Throwable {
        Period test = Period.years(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(6, test.getYears());
        assertEquals(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testFactoryMonths() throws Throwable {
        Period test = Period.months(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(6, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testFactoryWeeks() throws Throwable {
        Period test = Period.weeks(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(6, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testFactoryDays() throws Throwable {
        Period test = Period.days(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(6, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testFactoryHours() throws Throwable {
        Period test = Period.hours(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(6, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testFactoryMinutes() throws Throwable {
        Period test = Period.minutes(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testFactorySeconds() throws Throwable {
        Period test = Period.seconds(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(6, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @Test public void testFactoryMillis() throws Throwable {
        Period test = Period.millis(6);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(6, test.getMillis());
    }

    //-------------------------------------------------------------------------
    @Test public void testConstructor_trickyDifferences_RI_RI_toFeb_standardYear() throws Throwable {
        DateTime dt1 = new DateTime(2011, 1, 1, 0, 0);
        DateTime dt2 = new DateTime(2011, 2, 28, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 1, 3, 6, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_RI_RI_toFeb_leapYear() throws Throwable {
        DateTime dt1 = new DateTime(2012, 1, 1, 0, 0);
        DateTime dt2 = new DateTime(2012, 2, 29, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 1, 4, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths() throws Throwable {
        DateTime dt1 = new DateTime(2004, 12, 28, 0, 0);
        DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 12, 29, 0, 0);
        DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 12, 30, 0, 0);
        DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3() throws Throwable {
        DateTime dt1 = new DateTime(2004, 12, 31, 0, 0);
        DateTime dt2 = new DateTime(2005, 2, 28, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1() throws Throwable {
        DateTime dt1 = new DateTime(2013, 1, 31, 0, 0);
        DateTime dt2 = new DateTime(2013, 3, 30, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 1, 4, 2, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2() throws Throwable {
        DateTime dt1 = new DateTime(2013, 1, 31, 0, 0);
        DateTime dt2 = new DateTime(2013, 3, 31, 0, 0);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    //-------------------------------------------------------------------------
    @Test public void testConstructor_trickyDifferences_LD_LD_toFeb_standardYear() throws Throwable {
        LocalDate dt1 = new LocalDate(2011, 1, 1);
        LocalDate dt2 = new LocalDate(2011, 2, 28);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 1, 3, 6, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_LD_LD_toFeb_leapYear() throws Throwable {
        LocalDate dt1 = new LocalDate(2012, 1, 1);
        LocalDate dt2 = new LocalDate(2012, 2, 29);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 1, 4, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths() throws Throwable {
        LocalDate dt1 = new LocalDate(2004, 12, 28);
        LocalDate dt2 = new LocalDate(2005, 2, 28);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1() throws Throwable {
        LocalDate dt1 = new LocalDate(2004, 12, 29);
        LocalDate dt2 = new LocalDate(2005, 2, 28);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2() throws Throwable {
        LocalDate dt1 = new LocalDate(2004, 12, 30);
        LocalDate dt2 = new LocalDate(2005, 2, 28);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3() throws Throwable {
        LocalDate dt1 = new LocalDate(2004, 12, 31);
        LocalDate dt2 = new LocalDate(2005, 2, 28);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1() throws Throwable {
        LocalDate dt1 = new LocalDate(2013, 1, 31);
        LocalDate dt2 = new LocalDate(2013, 3, 30);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 1, 4, 2, 0, 0, 0, 0), test);
    }

    @Test public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2() throws Throwable {
        LocalDate dt1 = new LocalDate(2013, 1, 31);
        LocalDate dt2 = new LocalDate(2013, 3, 31);
        Period test = new Period(dt1, dt2);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0), test);
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testFactoryFieldDifference1() throws Throwable {
        YearMonthDay start = new YearMonthDay(2005, 4, 9);
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
        };
        Partial end = new Partial(types, new int[] {2004, 6, 7});
        Period test = Period.fieldDifference(start, end);
NoAssert.donothing(PeriodType.yearMonthDay(), test.getPeriodType());
NoAssert.donothing(-1, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(-2, test.getDays());
NoAssert.donothing(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
    }

    @SuppressWarnings("deprecation")
    @Test public void testFactoryFieldDifference2() throws Throwable {
        YearMonthDay ymd = new YearMonthDay(2005, 4, 9);
        try {
            Period.fieldDifference(ymd, (ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            Period.fieldDifference((ReadablePartial) null, ymd);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testFactoryFieldDifference3() throws Throwable {
        YearMonthDay start = new YearMonthDay(2005, 4, 9);
        TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0);
        try {
            Period.fieldDifference(start, endTime);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testFactoryFieldDifference4() throws Throwable {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfWeek(),
        };
        YearMonthDay start = new YearMonthDay(2005, 4, 9);
        Partial end = new Partial(types, new int[] {1, 2, 3});
        try {
            Period.fieldDifference(start, end);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testFactoryFieldDifference5() throws Throwable {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.dayOfWeek(),
        };
        Partial start = new Partial(types, new int[] {1, 2, 3});
        Partial end = new Partial(types, new int[] {1, 2, 3});
        try {
            Period.fieldDifference(start, end);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

}
